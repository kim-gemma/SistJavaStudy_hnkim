package day1023;

public class ForWhile_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//조건에 안맞으면 한번도 반복안함
		for(int i=5;i<=1;i++)
		{
			System.out.println(i);
		}
		
		//for문밖에서 i값을 출력하고 싶을때
		int i;
		for(i=10;i<=50;i+=5) //초기값을 밖에 지정하더라도 ;은 앞에 붙혀야한다
		{
			System.out.println(i);
		}
		System.out.println("\n빠져나온후의 i값: "+i);
		
		//1~10까지중에서 짝수만 출력하기
		for(int n=1;n<=10;n++)
		{
			if(n%2==0)
				System.out.printf("%4d",n);
		}
		System.out.println();
		
		//1~10 뒤에 Hello붙혀서 출력
		for(int a=1;a<=10;a++)
		{
			System.out.println(a+" Hello");
		}
		System.out.println("for문을 빠져나와 종료!!!");
		
	}

}
