package day1021;

import java.util.Scanner;

public class ScanTest_09 {

	public static void main(String[] args) {
		/*
		 * 이름입력: 홍길동 (string)
		 * 점수: 88(int)
		 * 학년:4 (string)
		 *
		 * [결과출력]
		 * 홍길동님은 4학년이며 평점은 88점입니다*
		 */

		//import
		Scanner sc=new Scanner(System.in);
		
		//변수
		String name;
		int score;
		String level;
		
		//입력
        System.out.print("이름입력: ");
        name = sc.nextLine();

        System.out.print("점수입력: ");
        score = Integer.parseInt(sc.nextLine());

        System.out.print("학년입력: ");
        level = sc.nextLine();
		
		//출력
        System.out.println("\n[결과출력]");
        System.out.println(name + "님은 " + level + "학년이며 평점은 " + score + "점입니다.");
		
	}

}
