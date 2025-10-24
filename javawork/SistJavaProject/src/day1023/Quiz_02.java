package day1023;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// 여기서 호출해서 결과보면 됩니다
		// quiz1();
		// quiz2();
		quiz3();
	}

	public static void quiz1() {
		// 팩토리얼 구할 숫자를 입력
		// 3
		// 3!=6
		Scanner sc = new Scanner(System.in);
		int su;
		int result = 1;
		System.out.println("팩토리얼 구할 숫자를 입력");
		su = sc.nextInt();

		for (int i = 1; i <= su; i++) // 초기값;조건식;증감식
		{
			result *= i;
		}
		System.out.println(su + "!=" + result);
	}

	public static void quiz2() {
		// 1~100까지중에서 5의배수의 합을 구하시오
		// 1~100까지중 5의 배수의 합은 ****입니다
		int sum = 0;
		/*
		 * for(int i=5;i<=100;i+=5) { sum+=i; }
		 */

		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지의 5의 배수의 합: " + sum);
	}

	public static void quiz3() {
		// 점수(1~100)를 입력받다가 0을 입력하면 반복문 빠져나온후에
		// 총갯수와 총점,평균 출력하기
		// 78
		// 90
		// 120
		// 다시입력해주세요
		// 88
		// 77
		// 0

		// 총갯수:
		// 총점:
		// 평균: 소수점1자리
		Scanner sc = new Scanner(System.in);

		int su;// 입력할 점수
		int cnt = 0, sum = 0;
		double avg;

		while (true) {
			System.out.println("점수입력");
			su = sc.nextInt();

			// break
			if (su == 0)
				break;
			// continue
			if (su < 0 || su > 100) {
				System.out.println("\t다시입력해주세요");
				continue;
			}

			cnt++;
			sum += su;
		}

		avg = (double) sum / cnt;

		System.out.println("총갯수: " + cnt);
		System.out.println("총점: " + sum);
		System.out.printf("평균:%.1f", avg);
	}

}