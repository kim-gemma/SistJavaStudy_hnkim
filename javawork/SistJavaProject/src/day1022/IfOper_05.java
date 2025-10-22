package day1022;

import java.util.Scanner;

public class IfOper_05 {

	public static void main(String[] args) {
		// 점수를 입력해서 학점을 알아보고 평가구하기 
		//학점:if 평가: 삼항연산자(90점이상:장학생 80점이상:잘함 80점미만:재수강)

		/*
		 * 점수를 입력하시오
		 * 78
		 * 학점: C학점
		 * 평가: 재수강*/
		
		Scanner sc=new Scanner(System.in);
		
		int score;
		String grade, eval;
		
		System.out.print("점수를 입력하시오");
		score=sc.nextInt();
		
		// 학점 구하기 (if문)
        if (score >= 90) {
            grade = "A학점";
        } else if (score >= 80) {
            grade = "B학점";
        } else if (score >= 70) {
            grade = "C학점";
        } else if (score >= 60) {
            grade = "D학점";
        } else {
            grade = "F학점";
        }

        // 평가 구하기 (삼항연산자)
        eval = (score >= 90) ? "장학생" :
               (score >= 80) ? "잘함" : "재수강";
		
        // 출력
        System.out.println("학점: " + grade);
        System.out.println("평가: " + eval);
		
	}

}
