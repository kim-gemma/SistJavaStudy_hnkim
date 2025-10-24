package day1023;

import java.util.Scanner;

public class IfSwitch_04 {

	public static void main(String[] args) {
		// 숫자를 입력받아 그숫자가 홀수인지 짝수인지 출력
		//if로도 구해보고 switch로도 구해보자
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("숫자입력");
		num=sc.nextInt();
		
		System.out.println("**if문**");
		if(num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		System.out.println("**switch문**");
		switch(num%2)
		{
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
		}
		
		//12개월중 원하는 달을 입력하여 몇일까지 있는지 출력
		//1,3,5,7,8,10,12_31일 
		int month; //달 입력
		
		System.out.println("월을 입력해주세요");
		month=sc.nextInt();
		
		switch(month)
		{
		case 2:
			System.out.println("28일 또는 29일까지 있습니다");
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일까지 있습니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있습니다");
			break;
		default:
			System.out.println("존재하지 않은 달 입니다");
			break;
		}
		
		
		
	}

}
