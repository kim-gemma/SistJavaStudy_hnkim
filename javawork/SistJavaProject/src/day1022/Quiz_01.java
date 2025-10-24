package day1022;

import java.util.Scanner;

public class Quiz_01 {

	public static void main(String[] args) {
		/*
		 오늘 입고된 상품명은?
		 갤럭시 폴드
		 입고된 수량은?
		 5
		 단가는?
		 1200000
		 
		 갤럭시폴드 5개는 총  6000000입니다
		 5개이상은 10프로 DC됨
		 항인된총금액:5400000원
		 */

        Scanner sc = new Scanner(System.in);

        String name;
        int amount, price, total;
        double dc, finalPrice;

        System.out.print("오늘 입고된 상품명은? ");
        name = sc.nextLine();

        System.out.print("입고된 수량은? ");
        amount = sc.nextInt();

        System.out.print("단가는? "  );
        price = sc.nextInt();

        // 계산
        total = amount * price;

        System.out.println();
        System.out.println(name + " " + amount + "개는 총 " + total + "원입니다.");

        if (amount >= 5) {
            //dc = total * 0.1;
        	dc = total * 9/10;
            finalPrice = total - dc;
            System.out.println("5개 이상은 10% DC됨");
            System.out.println("할인된 총 금액: " + (int)finalPrice + "원");
        } else {
            System.out.println("할인 없음. 총 금액: " + total + "원");
        }

	}

}
