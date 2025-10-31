package day1030;

class TestMethod{
	
	private String sangpum;
	private String made;  //한국,중국
	private int price; 
	
	//디폴트 생성자
	public TestMethod() {
		// TODO Auto-generated constructor stub
	}
	
	//3개의 멤버변수를 한꺼번에 변경하는 생성자
	public TestMethod(String sang,String made,int price) {
		
		this.sangpum=sang;
		this.made=made;
		this.price=price;
	}
	
	//3개의 멤버변수를 한꺼번에 변경하는 메소드 _set
	public void setSangpums(String sang,String made,int price)
	{
		this.sangpum=sang;
		this.made=made;
		this.price=price;
	}
	
	//출력용메서드
	public void getSangpums()
	{
		System.out.println("**입고상품**");
		System.out.println("상품명: "+this.sangpum);
		System.out.println("원산지: "+this.made);
		System.out.println("가격: "+this.price+"원");
		System.out.println("-------------------------------");
	}
	
	//3개를 동시에 리턴받는 get메서드 방식으로 만들어보자
	public String getIpgoSangpum()
	{
		String s="상품명: "+sangpum+"\n원산지: "+made+"\n가격: "+price+"원";
		
		return s;
	}
	
	
}

public class Ex1Object {

	public static void main(String[] args) {
		// 아이폰  중국  1200000
		// 갤럭시  베트남   1500000
		TestMethod t1=new TestMethod();
		t1.setSangpums("아이폰", "중국", 1200000);
		t1.getSangpums();
		
		TestMethod t2=new TestMethod();
		t2.setSangpums("갤럭시", "베트남", 1500000);
		t2.getSangpums();
		
		TestMethod t3=new TestMethod();
		t3.setSangpums("바나나", "태국", 5000);
		System.out.println(t3.getIpgoSangpum());
		
		//네번째생성은 명시적생성자로 
		TestMethod t4=new TestMethod("파스타", "이탈리아", 12000);
		t4.getSangpums();
				
		

	}

}
