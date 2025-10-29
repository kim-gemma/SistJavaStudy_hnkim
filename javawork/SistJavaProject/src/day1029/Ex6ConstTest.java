package day1029;

//파일명이랑 다른 클래스를 만들고 싶으면 public 지우면 됨
//클래스명 첫번째는 대문자
class Apple {
	public Apple() {
		System.out.println("Apple클래스의 디폴트 생성자");
	}
}

class Banana {
	
	public Banana() {
		System.out.println("디폴트생성자는 자동으로 만들어지지만"
				+"명시적 생성자를 만들면 자동으로 안만들어진다");
	}
	
	public Banana(String str) {
		System.out.println("Banana클래스의 명시적 생성자: "+str);
	}
}

//생성자의 오버로딩_이름이 중복되는거 가능(단 인자값은 달라야한다)
class Orange{
	public Orange() {
		System.out.println("Orange클래스의 디폴트 생성자");
	}
	public Orange(String str) {
		System.out.println("Orange클래스의 문자열을 받는 생성자 "+str);
	}
	public Orange(int num) {
		this();
		System.out.println("Orange클래스의 숫자를 받는 생성자 "+ num);
	}
}
public class Ex6ConstTest {

	public static void main(String[] args) {
		// 생성자는 객체생성시 자동호출되는 메소드
		//일반메서드와 틀린게 리턴타입이 없다
		//생성자의 가장 큰 역할운 주로 멤버의 초기화를 담당한다
		//같은 생성자끼리 호출은  this()로 한다.
		
		//Banana
		Banana b1=new Banana();
		Banana b2=new Banana("바나나 클래스에서 문자열 보낸것");
		
		//Orange
		Orange or=new Orange(77);
		Orange or2=new Orange("안녕 생성자 공부중");
		Orange or3= new Orange();
	}

}
