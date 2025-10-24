package day1024;

import java.util.Scanner;

public class WhileQuiz_06 {

	public static void main(String[] args) {
		// 점수를 입력하다가 Q or q를 입력하면 while문을 빠져나온후
		// 총갯수 총점 평균 구해서 출력하시오
		Scanner sc = new Scanner(System.in);
		String scroeInput;
		int score = 0, sum = 0, count = 0;
		double avg;

		// 계산
		while (true) {
			System.out.println("점수를 입력하세요");
			scroeInput = sc.nextLine();
			// 입력한 첫글자 charAt
			// if(scroeInput.charAt(0)=='Q' || scroeInput.charAt(0)=='q')
			if (scroeInput.equalsIgnoreCase("Q"))
				break;
			count++;
			sum += Integer.parseInt(scroeInput); // 정수로 변환후 합게변수에 누적하기

		}
		// 평균은 총점을 갯수로 한번만 나누면 되므로 반복문 밖에서 계산 한다
		avg = (double) sum / count; // 둘다 정수형이므로 정확히 실수로 나오게 하려면 double을 사용함!
		System.out.println("**결과출력**");
		System.out.println("점수갯수: " + count);
		System.out.println("총점: " + sum);
		System.out.printf("평균: %.1f\n", avg);

	}

}
