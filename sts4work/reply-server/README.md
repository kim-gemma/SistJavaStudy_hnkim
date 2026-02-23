# reply-server

WebSocket 기반 AI 답변 서버 (Google Gemini API 사용)

## 3. 정리

| 위치 | API 키 |
|------|--------|
| React Native 앱 | 두지 않음 (번들에 들어가면 노출됨) |
| Spring Boot 서버 | application.properties 또는 환경 변수로만 보관·사용 |

→ 키는 서버에만 있고, 앱은 `originalText`만 보내는 구조

## Gemini API 키 발급

1. [Google AI Studio](https://aistudio.google.com/app/apikey) 접속
2. API 키 생성 후 `application.properties`에 `gemini.api.key=발급받은키` 로 설정

## API 키 동작 확인 (PowerShell)

PowerShell에서 아래 명령으로 키가 정상인지 확인 (헤더로 전달):

```powershell
$body = '{"contents":[{"parts":[{"text":"Hello"}]}]}'
$headers = @{"Content-Type"="application/json"; "x-goog-api-key"="YOUR_API_KEY"}
Invoke-RestMethod -Uri "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent" -Method Post -Body $body -Headers $headers
```

`YOUR_API_KEY`를 실제 키로 바꿔 실행. 정상이면 JSON 응답이 나옴.
