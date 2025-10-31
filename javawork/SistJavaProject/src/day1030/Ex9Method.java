package day1030;

public class Ex9Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("2 수의 합: "+add(20, 50));
		System.out.println("제곱: "+square(4.5));
		System.out.println("정수와 실수 더하기: "+sum(5, 10.5));
		System.out.println("실수와 정수더하기: "+sum(20.5, 20));
	}
	
	static int add(int num1,int num2)
	{
		int result=num1+num2;
		return result;
	}
	
	static double square(double num)
	{
		return num*num;
	}
	
	//이름이 sum인 메서드_1개의 정수와 1개의 실수를 입력받아 더해서 리턴해주는 함수
	static double sum(int num1,double num2)
	{
		return num1+num2;
	}
	
	static double sum(double num1,int num2)
	{
		return num1+num2;
	}
	
	
	

}
