package day1104;

public class ExInheri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자식클래스로 생성");
		System.out.println("1.자식클래스로 선언, 자식클래스로 생성");
		
		Ex1Red red= new Ex1Red();
		red.helloColor();//부모메서드
		red.process();//sub클래스에서 만든 메서드
		
		Ex1Pink pink = new Ex1Pink();
		pink.helloColor();
		pink.process();
		
		Ex1Orange orange= new Ex1Orange();
		orange.helloColor();
		orange.process();
		System.out.println("===========================");
		
		System.out.println("2.부모클래스로 선언 자식 클래스로 생성__ 다형성");
		
		Ex1Color color;  // 부모 클래스 타입으로 변수 선언 (한 번만 선언!)
		color= new Ex1Red(); //생성1
		//같은 타입의 변수로 여러 형태(자식 클래스)의 객체를 다룰 수 있는 성질==> 다형성
		
		color.helloColor(); //부모가 가진 메서드 호출 ok
	
		// color.process();  
		// ※ 부모 클래스에 정의되지 않은 메서드는 호출 불가능
		// 단, '오버라이딩'된 메서드는 자식 클래스의 내용으로 실행됨

		color.process(); // 오버라이딩된 메서드는 자식 클래스의 구현 내용이 호출됨
		
		color= new Ex1Orange(); //생성2
		color.helloColor();
		color.process();
		
		color= new Ex1Pink(); //생성3
		color.helloColor();
		color.process();
		
	}

}
