package day1024;

public class RandomTest_07 {

	public static void main(String[] args) {
		// 자바에서 난수를 구하는 방법 2가지
		//1.Math.random()메서드 활용
		//2.Random 클래스를 생성해서 구하는 방법

		System.out.println("10개의 난수발생");
		for(int i=1; i<=10; i++) {
			double n= Math.random(); //0.0~1.0미만 임의의수 발생
			System.out.println(n);
		}
		System.out.println();
		

		for(int i=1; i<=10; i++) {
			System.out.println("0~9까지의 난수발생");
			int n= (int)(Math.random()*10);
			//System.out.println("0~9까지의 난수발생");
			// int n= (int)(Math.random()*10)+1;
			System.out.println(n);
		}
		for(int i=1; i<=100; i++) {
			System.out.println("100까지의 난수발생");
			int n= (int)(Math.random()*10);
			//System.out.println("0~9까지의 난수발생");
			// int n= (int)(Math.random()*10)+1;
			System.out.println(n);
		}
		for(int i=1; i<=45; i++) {
			System.out.println("45까지의 난수발생");
			int n= (int)(Math.random()*10);
			//System.out.println("0~9까지의 난수발생");
			// int n= (int)(Math.random()*10)+1;
			System.out.println(n);
		}
	}

}
