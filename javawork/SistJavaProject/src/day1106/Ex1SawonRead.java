package day1106;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex1SawonRead {
	
	 // static으로 선언한 이유:
    // - main에서 객체 생성 없이 바로 호출하기 위해
	public static void sawonRead(){
        // 1. 파일 경로 지정
		String fileName="C:\\sist1017\\work\\file\\sawon.txt";
		FileReader fr=null; // 파일을 문자 단위로 읽는 클래스
		BufferedReader br=null;  // 한 줄 단위로 빠르게 읽는 보조 스트림
		int num =1;

		try {
			 // 2. 파일 읽기 스트림 생성
			fr=new FileReader(fileName); 
			// BufferedReader 안에 FileReader를 넣는 이유:
            // -> FileReader는 "한 글자씩" 읽어서 느림.
            // -> BufferedReader는 버퍼(임시 메모리)를 사용해서 "한 줄씩" 빠르게 읽을 수 있음.
			br=new BufferedReader(fr);   
			
			System.out.println("**\t\t사원급여**");
			System.out.println("==================================================");
			System.out.println("번호\t사원명\t기본급\t가족수\t초과근무시간\t가족수당\t시간수당\t총급여");
			System.out.println("==================================================");
			//레인지가 모호한건 while반복문을 쓴다
			while(true) {
				//한줄읽기
				String s=br.readLine();//한줄씩 읽어오는걸 쓴다 스트링 라인이고 무조건 예에처리를 해애한다 없을수도 있으니까  try catch 가 필요하지 않고 catch만 필요catch (IOException e)
				
				// EOF(End Of File) = null 이면 종료
				if(s==null) {
					break;
				}
				//token
				// 5. 한 줄 데이터 예시: "이순신,3000000,2,10"
                //    → 콤마(,)로 구분되어 있으므로 StringTokenizer 사용
				StringTokenizer st=new StringTokenizer(s,",");
				//6. 토큰(조각)별로 데이터 분리
				String name=st.nextToken();
				int gibonpay= Integer.parseInt(st.nextToken());
				int famsu=Integer.parseInt(st.nextToken());
				int timesu=Integer.parseInt(st.nextToken());
				//계산
				int famSudang=famsu*30000;
				int timeSudang=timesu*20000;
				int totalPay=gibonpay+famSudang+timeSudang;
				
				//num 0 이면 ->  ++num이고 이렇게 처리
				//출력
				System.out.print(num++ +"\t"+name+"\t"+gibonpay+"원\t");
				System.out.print(famsu+"\t"+timesu+"\t"+famSudang+"원\t");
				System.out.print(timeSudang+"원\t"+totalPay+"원\n");
				
			}
			
			//오류가 발생할수잇기에 예외처리를 해주는것(try catch) 빨간줄이 생길경우 처리해주기 
		} catch (FileNotFoundException e) {
			// 파일이 없을 때 예외 발생 (경로가 잘못되었을 때)
			   System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			 // 파일 읽는 중 예외 발생
            System.out.println("파일 읽기 중 오류 발생: " + e.getMessage());
		} finally { //나중에 생성한걸 먼저 닫아
			// finally: 예외 발생 여부와 상관없이 "항상 실행"
            // 파일, 네트워크, DB 같은 외부 자원은 반드시 닫아야 함 (메모리 누수 방지)
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}

	public static void main(String[] args) {
		sawonRead();

	}

}
