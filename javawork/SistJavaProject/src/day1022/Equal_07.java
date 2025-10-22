package day1022;

import java.util.Scanner;

public class Equal_07 {

	public static void main(String[] args) {
		// 문자열비교는 관계연산과(==)로 하면 안되고
		//equals라는 메소드를 사용해서 비교한다
		//단어를 입력하면 해당단어의 뜻을 출력한다
		Scanner sc=new Scanner(System.in);
		String word;
		System.out.println("영어단어를 입력하시오.");
		System.out.println("예: happy, rose, angel, phone");
		
		word=sc.nextLine();
		System.out.println("입력한 문자열: "+word);
		//문자열비교
		//if(word=="haappy") 이거 아니야~~~~
		if(word.equals("happy")) //대소문자 구분
			System.out.println("행복하다.");
		else if(word.equalsIgnoreCase("rose")) //대소문자 상관없다
			System.out.println("장미");
		else if(word.equalsIgnoreCase("angel"))
			System.out.println("천사");
		else if(word.equalsIgnoreCase("phone"))
			System.out.println("전화기");
		else
			System.out.println("단어목록에 없는 단어입니다.");
	}

}
