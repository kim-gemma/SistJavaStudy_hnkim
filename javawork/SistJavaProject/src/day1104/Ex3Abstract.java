package day1104;

import java.nio.file.spi.FileSystemProvider;

//super_추상클래스_추상메서드가 단하나만 있더라도 추상클래스임
//▶ 추상 메서드가 '단 하나'라도 존재하면 반드시 추상클래스로 선언해야 한다.
//▶ 공통적인 기능(일반 메서드)과, 하위 클래스에서 반드시 구현해야 할 기능(추상 메서드)을 함께 정의할 수 있다
abstract class Fruit{
	//상수 
	// final: 값 변경 불가, static: 클래스 이름으로 접근 가능
	public static final String MESSAGE="오늘은 추상클래스 배우는 날!";
	//일반 메서드
	public void showTilte() {
		System.out.println("추상클래스 제목을 출력합니다.");
	}
	
	// 3. 추상 메서드 (abstract)_ 오버라이딩이 목적이므로 상속받은 자식클래스에서는 반드시 오버라이딩 해주어야한다
	// - 메서드 선언만 있고, 구현(중괄호 { } 내용)이 없다.
	// - 하위 클래스(자식 클래스)에서 반드시 '오버라이딩(Override)' 해야 함.
	// - 규칙만 정해두고, 실제 동작은 자식이 구현한다.
	abstract public void showMessage();
}

//sub1
class Apple extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("사과다");
	}
	
}

//sub2
class Banana extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("바나나다");
	}
	
}

//sub3
class Orange extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("오렌지다");
	}
	
}

public class Ex3Abstract {

	public static void main(String[] args) {
		//다형성 출력 부모 타입으로 여러 자식 객체를 공통된 방식으로 제어하는 것
		// 하나의 변수로 여러가지 일을 처리할떄 편하다
		// (부모클래스명) 참초변수명 = new (자식클래스명)();.
		Fruit fruit;
		fruit = new Apple();
		fruit.showMessage();
		fruit= new Banana();
		fruit.showMessage();
		fruit =new Orange();
		fruit.showMessage();

	}

}
