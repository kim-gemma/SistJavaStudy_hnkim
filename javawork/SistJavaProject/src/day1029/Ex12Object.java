package day1029;

//클래스 정의 : member
class Member{
	//모든 변수 private
	private String memName;
	private int memAge;
	private String job;
	//private: 외부 클래스 (main 등)에서 직접 접근 못하게 막음 -> 안전하게 데이터를 보호(캡슐화)
	//static final 상수 선언
	//final 값 변경 불가
	static final String ADDR="세종시";
	//즉, ADDR은 ‘세종시’로 고정된 공통 주소
	
	//setter(수정용 메서드)
	//void: 반환값 없음
	public void setMemName(String name)
	{
		memName=name;
	}
	//setAge()에서 this.memAge를 쓴 이유 → **멤버 변수(memAge)**와 매개변수(age) 이름이 비슷해서 구분 필요.
	//객체 생성 후 멤버 변수에 값을 “저장”하는 역할.
	public void setAge(int age)
	{
		this.memAge=age;
	}
	public void setJob(String job)
	{
		this.job=job;
	}
	
	//getter(조회용 메서드)
	public String getMemName()
	{
		return memName;
	}
	public int getMemage()
	{
		return memAge;
	}
	public String getJob()
	{
		return job;
	}
	
	//출력메서드 (편의 메서드)
	public void writeMember()
	{
		System.out.println("회원명: "+memName);
		System.out.println("회원나이: "+memAge);
		System.out.println("회원직업: "+job);
	}
	
	
}

public class Ex12Object {

	//main() 실행부
	public static void main(String[] args) {
		
		//디폴트생성자로 생성후 setter이용해서 수정하고
		//getter이용해서 출력
		Member mem=new Member(); // 기본 생성자 호출
		
		//메서드이용해서 출력도 가능
		//첫출력.
		//아직 set으로 값을 안넣어서 모든값은 초기값 상태임 
		mem.writeMember();
		
		//수정
		mem.setMemName("김구라");
		mem.setAge(33);
		mem.setJob("연예인");
		//메서드 다시 호출
		mem.writeMember();
		
		//수정
		mem.setMemName("유재석");
		mem.setAge(22);
		mem.setJob("아나운서");
		
		//조회메서드를 이용해서 출력(getter)


		System.out.println("회원 직업: "+mem.getJob());
		
		
		
	}
}