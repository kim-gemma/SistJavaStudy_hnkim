package day1031;

//super
class Person{
	String name;
	String buseo;
	
	//메서드
	public void writeSawon() {
		System.out.println("부모변수출력");
		System.out.println("이름: "+this.name);
		System.out.println("부서: "+this.buseo);
	}
}

//sub

class MyInfo extends Person {
	int age;
	String position;
	
	//명시적생성자
	public MyInfo(String name, String buseo, int age, String po) {
		this.name=name;
		this.buseo=buseo;
		this.age=age;
		this.position=po;
	}
	
	//단독으로 부모의 멤버로 메서드 작성이 가능하다.
	public void writeMyInfo() {
		System.out.println("사원명: "+ this.name);
		System.out.println("부서명: "+ this.buseo);
		System.out.println("나이: "+ this.age);
		System.out.println("직급: "+ this.position);
	}
	
	// 오라바이딩 메서드 구현
	@Override
	public void writeSawon() {
		// TODO Auto-generated method stub
		super.writeSawon();
		System.out.println("나이: "+ this.age);
		System.out.println("직급: "+ this.position);
	}
	
}

public class Ex3Inheri {

	public static void main(String[] args) {
		MyInfo data = new MyInfo("김현능", "개발팀", 30, "팀장");
		data.writeMyInfo();
		
		// 또는 오버라이딩된 부모 메서드 호출도 가능
		data.writeSawon();
	}

}
