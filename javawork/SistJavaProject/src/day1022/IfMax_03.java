package day1022;

import java.util.Scanner;

public class IfMax_03 {

	public static void main(String[] args) {
		// 2개의 숫자를 입력해서 max값 구하기
		//삼항연산자
		//if
		
		Scanner sc=new Scanner(System.in);
		int x,y,max;
		
		System.out.println("2개의 숫자를 입력해 주세요.");
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("입력한 두수는"+ x+","+y+"입니다");
		
		//if
		if(x>y) 
			max=x;
		else 
			max=y;
		System.out.println("두수중에서 더큰값은"+max+"입니다");
		System.out.println("첫번째수가 더"+(x>y? "크다": "작다"));
		
	}

}
