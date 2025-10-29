package day1028;

import java.util.Scanner;

public class ArrayLottoQuiz_03 {

	public static void main(String[] args) {
		 //몇장을 구입할지 입력후 로또를 출력할것!!-중복체크,오름차순
		//몇장구입을 원하세요?
		//2	
		//1회: 3  18	  19 21	29	39
		//2회: 5  28	  29 31	39	41
		Scanner sc=new Scanner(System.in);
		int [] lotto=new int[6];
		int buySu;
		
		System.out.println("로또 몇장구입을 원하세요?");
		buySu=sc.nextInt();
		
		
		if(buySu<1)
		{
			System.out.println("구매하려는 갯수보다 작네요_프로그램종료");
			return; //메인메서드 종료
		}
		
		
		//buySu만큼 로또갯수 반복
		for(int b=0;b<buySu;b++)
		{
			System.out.printf("%d회: ",b+1);
			
			//임의의 수를 로또변수에 발생시켜서 넣어준다
			for(int i=0;i<lotto.length;i++)
			{
				lotto[i]=(int)(Math.random()*45)+1; //1~45랜덤수
				//중복처리
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--; //같은번지에 다른값을 구하기 위해서
						break; //i++로 이동
						
					}
				}
			}
			
			//오름차순 정렬
			for(int i=0;i<lotto.length-1;i++)
			{
				for(int j=i+1;j<lotto.length;j++)
				{
					if(lotto[i]>lotto[j])
					{
						int temp=lotto[i];
						lotto[i]=lotto[j];
						lotto[j]=temp;
					}
				}
			}
			
			//출력
			for(int i=0;i<lotto.length;i++)
			{
				System.out.printf("%5d",lotto[i]);
			}
			System.out.println();
			
		}
		
		
	}
}
