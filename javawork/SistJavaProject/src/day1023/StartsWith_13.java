package day1023;

import java.util.Scanner;

public class StartsWith_13 {

	public static void main(String[] args) {
		//반복해서 이름을 입력후 김씨가 몇명인지...(startsWith,equals사용)
		//끝 이라고 쓰면 프로그램 종료
		Scanner sc=new Scanner(System.in);
		String name;
		int count=0;
		
		while(true)
		{
			System.out.println("이름을 입력하시오(끝이라고 쓰면 종료!!)");
			name=sc.nextLine();
			
			//break
			if(name.equals("끝"))
				break;
			
			//조건을 쓰고 그조건에 부합하면 count증가
			if(name.startsWith("김"))
				count++;
		}
		
		System.out.println("김씨성을 가진사람은 총"+count+"명 입니다");
		
	}

}
