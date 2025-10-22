package day1021;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		// Q. 2개의 숫자를 입력하여 + - * / % 을 구해봅시다
		/*
		 * 첫번째 숫자는? 7
		 * 두번째 숫자는? 3
		 * ==============
		 * [결과출력]
		 * 두수의 합은 10입니다.
		 * 두수의 차이는 4입니다.
		 * 두수의 곱은 21입니다.
		 * 두수를 나누면 2입니다
		 * 두수를 나누면 나머지가 1입니다.*/
		//import
		Scanner sc = new Scanner(System.in);
		
		//변수
		int num1,num2;
		
		//입력
		System.out.print("첫번째 숫자는?");
		num1 =sc.nextInt();
		System.out.print("두번째 숫자는?");
		num2 =sc.nextInt();
		
		//계산
		int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;  // 정수 나눗셈
        int mod = num1 % num2;

        // 출력
        System.out.println("===============");
        System.out.println("[결과출력]");
        System.out.println("두 수의 합은 " + sum + "입니다.");
        System.out.println("두 수의 차이는 " + diff + "입니다.");
        System.out.println("두 수의 곱은 " + mul + "입니다.");
        System.out.println("두 수를 나누면 " + div + "입니다.");
        System.out.println("두 수를 나눈 나머지는 " + mod + "입니다.");
		

	}

}
