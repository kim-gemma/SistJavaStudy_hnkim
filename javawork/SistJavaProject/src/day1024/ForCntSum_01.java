package day1024;

import java.util.Scanner;

public class ForCntSum_01 {

	public static void main(String[] args) {
		// 총 다섯개의 점수를 입력받아 합계를 구하려고 한다(반복문)
		//만약 1~100이 아니라면 다시 입력하시오(continue).. 잘못 입력함 메세지 출력후 다시진행
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int score;
		
		for(int i=1; i< 5; i++) {
			System.out.print(i+"번 점수: ");
			score=sc.nextInt();
			
			if(score<1 || score>100) {
				System.out.println("\t다시입력해주세요");
				i--;
				continue;
			}
			sum+=score;
		}
		System.out.println("총점: "+sum);
		

	}

}
