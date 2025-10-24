package day1023;

import java.util.Scanner;

public class IfReview_01 {

	public static void main(String[] args) {
		// 이름과 자바 스프링 점수를 입력후 총점을 구하시오
		//총점이 180점이상이면 "시험통과",170점 이상이면 "좀더노력할것!!",170점미만은 "재시험"
		//조건은 if,삼항연산자 아무거나 선택해서 하세요
		//선언->입력->계산->출력
		Scanner sc=new Scanner(System.in);
		String name;
		int java,spring,tot;
		
		System.out.println("이름입력");
		name=sc.nextLine();
		System.out.println("자바 스프링 점수 차례로 입력");
		java=sc.nextInt();
		spring=sc.nextInt();
		
		tot=java+spring;
		
		System.out.println("학생명: "+name+"님");
		System.out.println("총점: "+tot+"점");
		System.out.println("평가: "+(tot>=180?"시험통과":tot>=170?"좀더노력할것":"재시험"));

	}

}

