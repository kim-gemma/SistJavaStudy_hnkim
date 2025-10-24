package day1023;

import java.util.Scanner;

public class ForQuiz_01 {

	public static void main(String[] args) {
		//1. 1~20까지를 출력하는데 5의 배수는 제외후 출력하시오(for)
		for(int i=1;i<=20;i++)
		{
			//continue
			if(i%5==0)
				continue;
			System.out.print(i+"  ");
		}
		System.out.println();
		
		//2.1~50까지 출력하는데 3씩 증가하게 출력합니다(1 4 7 10...)
		for(int i=1;i<=50;i+=3)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
		//3.내가 숫자를 입력하면 1부터 입력한 숫자까지의 합계를 구해서 출력해보자
		//합계를 구할 숫자는? 10
		//1~10까지의 합은 55
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int num;
		
		System.out.println("합계를 구한 숫자는?");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
			sum+=i;
		System.out.println("1부터 "+num+" 까지의 합="+sum);
		
		//4.1~100까지의 숫자중에서 짝수의 합과 홀수의 합을 나누어 출력(교재66~67)
		//짝수의 합 (even):***
		//홀수의 합 (odd):***
		
		int tot=0;
		int  esum=0;
		int osum=0;
		
		for(int i=1;i<=100;i++)
		{
			//전체합
			tot+=i;
			
			//짝수
			if(i%2==0)
				esum+=i;
			//홀수
			else
				osum+=i;
		}
		System.out.println("1~100까지 합="+tot);
		System.out.println("1~100까지 짝수의합="+esum);
		System.out.println("1~100까지 홀수의합="+osum);
		
		
		
	}

}
