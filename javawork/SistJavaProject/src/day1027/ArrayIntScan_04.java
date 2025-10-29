package day1027;

import java.util.Scanner;

public class ArrayIntScan_04 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력받은 그수를 출력하고 합계도 구해보자
		//입력도 출력도 모두 배열의 반복문 이용할것
		Scanner sc=new Scanner(System.in);
		
		int[] arrNum;
		arrNum=new int[5];
	    int sum=0;
	    
		
		//값입력
		for(int i=0;i<arrNum.length;i++)
		{
			System.out.print(i+"번지값:  ");
			arrNum[i]=sc.nextInt();
			
			//합계에 반복문만큼 누적
			sum+=arrNum[i];
		}
		System.out.println();
		//출력
		System.out.println("**입력한값 출력**_ 1: 10");
		for(int i=0;i<arrNum.length;i++)
		{
			System.out.println(i+1+":"+arrNum[i]);
		}
		//총합계
		System.out.println("총합계: "+sum);

	}

}
