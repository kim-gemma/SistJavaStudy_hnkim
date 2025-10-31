package day1029;

//어떤 방법으로 해도 좋다
//디폴트 생서자 _setter getter 
//명시적 생성자에 3개의 인자를 넣고 해도 좋다
//출력문을 메서드로 만들어서 출력해도 좋다
//시간남으시면 cnt도 증가시켜서 1,2 에 추가해보세요.
/*
 **학생1정보**
 이름:이병헌
 소속반:JAVA 4class
 성별:남자
 주소: 서울시 강서구
 ================
 **학생2정보**
 이름:신민아
 소속반:JAVA 4class
 성별:여자
 주소: 서울시 성동구
 */

class Quiz{
	private String stuName;
	private String gender; //성별
	private String addr; // 주소
	
	static String ban="JAVA 4class";
	static int cnt=0;
	
	public Quiz(String stuName, String gender, String addr) {
		this.stuName = stuName;
		this.gender = gender;
		this.addr = addr;
		cnt++; // 객체가 만들어질 때마다 1씩 증가
	}
	
	public void setStuName(String name) {
		this.stuName=name;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getAddr() {
		return addr;
	}
	
	// 출력 메서드
	public void printInfo() {
		System.out.println("**학생" + cnt + "정보**");
		System.out.println("이름: " + stuName);
		System.out.println("소속반: " + ban);
		System.out.println("성별: " + gender);
		System.out.println("주소: " + addr);
		System.out.println("================");
	}

}

public class QuizTest {

	public static void main(String[] args) {
		Quiz stu1= new Quiz("이병헌", "남자", "서울시 강서구");
		stu1.printInfo();
		
		Quiz stu2 = new Quiz("신민아", "여자", "서울시 성동구");
		stu2.printInfo();
		

	}

}
