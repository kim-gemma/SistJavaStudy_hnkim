package day1029;

//객체의 속성은 인스턴스 변수로 표현하고 객체의 동작은 메서드로 표현한다
//object: 객체(실제로 존재하는것.. 핸드폰 텀플러,마우스같은거)
//class: 객체를 정의해 놓은 것, 객체를 생성하기 위해 존재
//instance:클래스에서 만들어진 객체가 그 클래스의 인스턴스라고 한다
//멤버변수(클래스아래서에정의하는것): instance 변수, static 변수(클래스변수)

public class Ex1Object {

	String name; // 인스턴스 변수 =iv : 객체생성후 값변경 또는 호출 가능 
	static final String MESSAGE="오늘은 클래스 배우는날!!";
	//cv-주로 상수선언 _객체생성없이 클래스명으로 접근 가능 (Ex1Object.MESSAGE) 같은클래스내에서는 클래스명 생략가능
	
	public static void main(String[] args) {
		System.out.println("static변수는 new로 생성없이 호출가능하다");
		System.out.println(MESSAGE);
		System.out.println(Ex1Object.MESSAGE);// 같은 글래스라서 생략 가능
		
		//MESSAGE="NICE DAY!!" final 붙였기 때문에 값 변경 안됨 상수는 변경 안됨 
		
		//스태틱이 아닌 모든 변수는 인스턴스 변수이고 객체생성을 해야 사용가능하다 
		//name과 같은 인스턴스 변수는 객체생성을 해야만 사용가능
		Ex1Object ex1= new Ex1Object(); //객체생성!! ex1을 인스턴스 변수라고 한다! 
		System.out.println(ex1.name); // 클래스에서 초기화 안하면 문자는 NULL로 자동인식
		
		//초기화
		ex1.name="홍길동";
		System.out.println(ex1.name);
		
		//2. 2번쨰 이름 초기화 후 출력
		Ex1Object ex2 = new Ex1Object();
		ex2.name= "김민지";
		System.out.println(ex2.name);
	}

}
