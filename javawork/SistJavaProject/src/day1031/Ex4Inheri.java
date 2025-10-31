package day1031;

//super
class Shop{
	private String sanpum;
	private int su;
	
	//디폴트 생성자
	public Shop() {
		//초기값 주기도 가능
		sanpum="딸기";
		su=10;
	}
	//명시적 생성자
	public Shop(String s, int su) {
		this.sanpum=s;
		this.su=su;
	}
	//출력메서드
	public void writeShop() {
		System.out.println("상품명: "+ sanpum);
		System.out.println("수량: "+ su);
	}
}


//sub_shop을 상속 : 디폴트 생성자(초기값 1000원 추가) 명시적 생성자(Price 추가)
class Mymall extends Shop{
	private int price;
	//디폴트
	public Mymall() {
		// super();  // 부모의 디폴트 생성자는 자동으로 호출되므로 생략 가능
		price = 1000;
	}
	
	//명시적
	public Mymall(String s, int su, int price) {
		super(s,su);
		this.price=price;
	}
	
	//writeshop 오버라이딩후 price도 추가 합니다
	@Override
	public void writeShop() {
		super.writeShop();
		System.out.println("가격: "+ price);
	}	
}

public class Ex4Inheri {

	public static void main(String[] args) {
		
		//디폴트 생성자로 추가후 메서트 출력(딸기,10개,1000)
		Mymall mall1= new Mymall();
		mall1.writeShop();
		System.out.println("======================");
		
		//명시적 생성자로 추가후 머세드 출력(오렌지,40,2000)
		Mymall mall2= new Mymall("오렌지", 40, 2000);
		mall2.writeShop();

	}

}
