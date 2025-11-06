package day1106;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Ex2FileWriter {

	public static void fileWrite() {
		FileWriter fw=null;
		String fileName="C:\\sist1017\\work\\file\\test1.txt";
		
		try {
			fw=new FileWriter(fileName); //파일을 새로생성(같은이름이 있더라도 새로생성)
			//파일에 내용추가
			fw.write("Have a nice day!!!!!!!!!!!!!!!!\n");
			fw.write(new Date().toString());
			// Date 객체를 문자열(String) 형태로 변환하여 파일에 기록한다.
			// 날짜와 시간 정보는 기본적으로 Date 타입이므로, 
			// 파일에 쓸 때는 반드시 문자열로 변환(toString())해야 오류가 발생하지 않는다.
			System.out.println("파일저장성공??");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //  이거 꼭 해줘야됨!!
			try {
				fw.close(); // 파일 닫기 (꼭 해줘야 실제로 파일이 저장됨)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void fileWrite2() {
		FileWriter fw=null;   // 지역변수
		String fileName="C:\\sist1017\\work\\file\\test2.txt";   // 지역변수
		
		try {
			fw = new FileWriter(fileName, true); // true라고 해야 추가모드
			
			fw.write("내이름은 김현능입니다\n");
			fw.write("===================\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		fileWrite();
		fileWrite2();
	}

}
