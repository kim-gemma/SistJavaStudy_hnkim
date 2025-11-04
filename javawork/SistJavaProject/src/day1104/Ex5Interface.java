package day1104;

//super_Interface_상수와 추상메서드만 가능

interface FoodShop{
	String SHOPNAME="돼지국밥"; //final 생략, 변수 안됨,상수밖에 못넣는곳
	
	public void order();//abstract 생략되어있음
	public void beadal();
	
}

//sub  인터페이스를 '구현한다(implements)'고 표현함, implements 다중구현이 가능하다
class Food1 implements FoodShop{

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println(SHOPNAME + " 가게에서 주문 접수 완료!");
	}

	@Override
	public void beadal() {
		// TODO Auto-generated method stub
		System.out.println(SHOPNAME + " 배달 중입니다!");
	}
	
}

public class Ex5Interface {

	public static void main(String[] args) {
		FoodShop shop = new Food1();
		
		//다형성 사용: 부모 타입(인터페이스)으로 자식을 다룸 — 실무에서 권장
		//부모인터페이스로 생성!! 
		shop.beadal();
		shop.order();
	}

}
