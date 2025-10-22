package day1022;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class IfMax_04 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력하여 max 값을 구해보세요
		// if문 이용(&&)
		// 3개의 숫자중 가장 큰수는 ** 입니다

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, max, min;

		/*
		 * System.out.println("세개의 수 입력"); num1=sc.nextInt(); num2=sc.nextInt();
		 * num3=sc.nextInt();
		 */

		System.out.print("첫 번째 숫자 입력: ");
		num1 = sc.nextInt();

		System.out.print("두 번째 숫자 입력: ");
		num2 = sc.nextInt();

		System.out.print("세 번째 숫자 입력: ");
		num3 = sc.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			max = num1;// ***num1을 max 값에 대입해준다 ! 중요!!
		} else if (num2 >= num1 && num2 >= num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println("3개의 숫자 중 가장 큰 수는 " + max + " 입니다.");

		// 삼항연산자
		max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;
		System.out.println("Max=" + max);

		
		//if or 삼항연산자 이용하여 min값 구하기
		if(num1<num2&&num1<num3) {
			min=num1;
		} else if(num2<num3&&num2<num3) {
			min=num2;
		} else {
			min=num3;
		}
		System.out.println("3개의 숫자 중 가장 큰 수는 " + min + " 입니다.");

		
		min = (num1<num2&&num1<num3)? num1 : (num2<num1&& num2<num3)? num2:num3;
		
		System.out.println("Min="+min);
	}

}
