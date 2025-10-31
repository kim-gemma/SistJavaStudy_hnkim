package day1029;

public class Ex11Object {

	private String sangpum;// private은 같은 클래스내에서만 변수명으로 접근가능
	int su;
	int price;
	static final String SHOPNAME = "이마트";

	public static void main(String[] args) {

		Ex11Object ob = new Ex11Object();
		ob.sangpum = "딸기";
		ob.su = 10;
		ob.price = 25000;

		System.out.println("상점명: " + SHOPNAME);
		System.out.println("상품명: " + ob.sangpum);
		System.out.println("가격: " + ob.price + "원");
		System.out.println("갯수: " + ob.su + "개");

	}

}
