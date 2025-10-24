package day1024;

import java.util.Scanner;

public class GuguScan_05 {

	public static void main(String[] args) {
		// 원하는 단을 입력해서 해당 단만 출력해보자
		/*
		 * 단을 입력하시오: 5 [5단]
		 */

		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {

			System.out.println("원하는 단 입력_0이면 종료:");
			num = sc.nextInt();

			// 종료
			if (num == 0) {
				System.out.println("프르그램 종료합니다!");
				break;
			}

			// 2~9단이 아니면 "2~9사이의 숫자만 넣어주세요

			if (num < 2 || num > 9) {
				System.out.println("2~9사이의 숫자만 넣어주세요");
				continue;
			}

			System.out.println("[" + num + "단]");
			for (int j = 1; j <= 9; j++) {
				System.out.println(num + "x" + j + "=" + (num * j));
			}
		}
	}

}
