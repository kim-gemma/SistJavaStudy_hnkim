package day1106;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex5QuizWriteRead {

	Scanner sc = new Scanner(System.in);
	static final String FILENAME = "C:\\sist1017\\work\\file\\shop.txt";
	FileWriter fw;
	FileReader fr;
	BufferedReader br;

	// 상품선택하는 메서트
	public int getProcess() {
		int num = 0;
		System.out.println("**메뉴 1. 상품추가    2. 상품재고현황    9.종료**");
		num = Integer.parseInt(sc.nextLine());
		return num;
	}

	// 스캐너 통해서 입력하고 파일에 저장 ==> 아이폰12,5,1200000
	public void sanpumAdd() {
		System.out.println("상품명을 입력");
		String sang = sc.nextLine();
		System.out.println("입고된 수량");
		int su = Integer.parseInt(sc.nextLine());
		System.out.println("입고된 가격");
		int price = Integer.parseInt(sc.nextLine());

		// 파일입력생성
		try {
			fw = new FileWriter(FILENAME, true);
			
			
			
			fw.write(sang + "," + su + "," + price + "\n");
			System.out.println("***추가되었습니다!!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 출력
	// 할인가격은 따로 메서드 만들어서 호출 할것
	public void sangpumWrite() {
		System.out.println("번호\t상품명\t입고수량\t가격\t할인가격\t실제가격");
		System.out.println("----------------------------------------");

		int num = 0;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			while (true) {
				String s = br.readLine();
				if (s == null)
					break;

				String[] d = s.split(",");
				String sang = d[0];
				int su = Integer.parseInt(d[1]);
				int dan = Integer.parseInt(d[2]);
				int price = su * dan;
				int dcPrice = getDiscout(su, price);
				int netPrice = price - dcPrice;
				System.out.println(++num + "\t" + sang + "\t" + su + "\t" + price + "\t" + dcPrice + "\t" + netPrice);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

//		try {
//			fr = new FileReader(FILENAME);
//			br = new BufferedReader(fr);
//			System.out.println("====================================================");
//			System.out.println("번호\t상품명\t입고수량\t가격\t할인가격\t총가격");
//			System.out.println("====================================================");
//
//			String line = null;
//			int num = 1; // 상품 번호
//
//			while ((line = br.readLine()) != null) {
//
//				// 한 줄 예시: "아이폰12,5,1200000"
//				String[] data = line.split(",");
//				String sang = data[0]; // 상품명
//				int su = Integer.parseInt(data[1]); // 수량
//				int price = Integer.parseInt(data[2]); // 가격
//
//				int salePrice = getSalePrice(price, su); // 할인가 계산
//				int total = salePrice * su;
//
//				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\n", num++, sang, su, price, salePrice, total);
//			}
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	// 입고수량이 10개이상이면 10프로 할인 10개 아니면 할인 안됨
	// 번호 상품명 입고수량 가격 할인가격 총가격
	public int getDiscout(int su, int price) {
		int dc = 0;
		if (su >= 10) {
			dc = price * 1 / 10;
		}
		return dc;
	}
//	public int getSalePrice(int price, int su) {
//		if (su >= 10) {
//			return (int) (price * 0.9); // 10% 할인
//		} else {
//			return price; // 할인 없음
//		}
//	}

	public static void main(String[] args) {
		Ex5QuizWriteRead quiz = new Ex5QuizWriteRead();
		// getprocess의 num으로 1입력 2출력 9번 총료처럼 만들것
		while (true) {
			int num = quiz.getProcess();
			switch (num) {
			case 1: {
				System.out.println("상품정보를 입력합니다.");
				quiz.sanpumAdd();
				break;
			}
			case 2: {
				System.out.println("상품재고현황을 조회합니다.");
				quiz.sangpumWrite();
				break;
			}
			case 9: {
				System.out.println("프로그램 종료!!");
				System.exit(0);
				break;
			}
			default:
				System.out.println("다시입력바람");

			}
		}

	}

}
