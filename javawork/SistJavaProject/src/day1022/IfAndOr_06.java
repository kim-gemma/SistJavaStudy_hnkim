package day1022;

import java.util.Scanner;

public class IfAndOr_06 {

	public static void main(String[] args) {
		// 3과목을 입력하여 총점,평균 구하기
		//각과목은 모두 40점 이상이어야하며 총점은 60점이상을 합격기준으로 한다
		Scanner sc=new Scanner(System.in);
		
		String name;
		int java, oracle, html; //3과목

		//입력
		System.out.println("수험생 이름을 입력하시요");
		name=sc.nextLine();
		System.out.println("3과목의 점수를 입력하시요");
		java=sc.nextInt();
		oracle=sc.nextInt();
		html=sc.nextInt();
		
		//계산
		int total = java+oracle+html;
		double avg=total/3.0; // 3이 아나라 실수형태로 붙여서 실수형태 나오게 만들기 정수형태 나오게 하지말고 
		
		System.out.println("3과목의 점수: "+java+","+oracle+","+html);
		System.out.println("총점수: "+total);
		System.out.println("평균: "+avg);
		//홍길동님은 시험에(불)합격하셧습니다.
		//if
		if(java>=40 && oracle>=40 && html >=40 && avg >= 60)
			System.out.println(name+"님은 시험에 합격하셨습니다.");
		else
			System.out.println(name+"님은 시험에 불합격하셨습니다.");
		
		if(java<40 || oracle <40 || html<40 || avg<60) //or
			System.out.println(name+"님은 시험에 불합격하셨습니다.");
		else
			System.out.println(name+"님은 시험에 합격하셨습니다.");
	}

}
