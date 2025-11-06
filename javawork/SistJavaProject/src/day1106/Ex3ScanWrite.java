package day1106;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex3ScanWrite {

	// 선언부!
	Scanner sc; // 젼역선언
	FileWriter fw;
	static final String FILENAME = "C:\\sist1017\\work\\file\\member2.txt"; // 상수니까 대문자
	FileReader fr;
	BufferedReader br;

	// 생성자
	public Ex3ScanWrite() {
		sc = new Scanner(System.in);
		System.out.println("생성자가 실행되었습니다!");
	}

	public void FileWrite() {
		try {
			fw = new FileWriter(FILENAME, true); // 추가모드
			System.out.println("이름입력");
			String name = sc.nextLine();
			System.out.println("주소입력");
			String addr = sc.nextLine();
			System.out.println("핸드폰 입력");
			String hp = sc.nextLine();
			System.out.println("파일저장");
			fw.write(name + "\n");
			fw.write(addr + "\n");
			fw.write(hp + "\n");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public void fileRead() {
		// 제목출력
		System.out.println("**Member2정보");
		System.out.println("아름\t주소\t핸드폰");
		System.out.println("=================================");

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			int num = 0;
			while (true) {
				String name = br.readLine();
				if (name == null)
					break;

				String addr = br.readLine();
				String hp = br.readLine();
				System.out.println(++num + "\t" + name + "\t" + addr + "\t" + hp);
			}
			System.out.println("출력끝!!!!");

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {

			// TODO: handle exception
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}

	public static void main(String[] args) {
		Ex3ScanWrite ex = new Ex3ScanWrite(); // ✅ 이 순간 생성자가 자동으로 실행됨
		// ex.FileWrite();
		ex.fileRead();

	}

}
