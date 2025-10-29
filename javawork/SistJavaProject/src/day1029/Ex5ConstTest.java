package day1029;

public class Ex5ConstTest {

	int num; //0
	
	//디폴트생성사
	public Ex5ConstTest() {
		num=10;
		System.out.println("나는 디폴트 생성자");
	}
	
	//명시적 생성자 	//오버로딩은 메서드명이 같아도 파라미터는 달라야됨 
	public Ex5ConstTest(int num) {
		this.num=num;
		System.out.println("나는 명시적 생성자");
	}
	
	//메서드(함수)
	public int getNumber() {
		num=50;
		return num;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex5ConstTest ex1 = new Ex5ConstTest();
		
		System.out.println(ex1.num);
		
		//명시적 생성자 생성
		Ex5ConstTest ex2= new Ex5ConstTest(30);// 생성과 동시에 초기화 //생성자의 역할은 초기화
		System.out.println(ex2.num);
		
		//메서드
		Ex5ConstTest ex3= new Ex5ConstTest();
		System.out.println(ex3.getNumber());
	}

}
