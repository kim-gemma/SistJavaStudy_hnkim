package day1021;

import java.util.Scanner;

public class KeyBoardIn_07 {

	public static void main(String[] args) {
		// Scanner 라는 클래스를 import 받아서 쓴다
		//Scanner는 문자열이나 숫자를 모두 키보드로 입력받으려 할때 생성해준다
		Scanner sc= new Scanner(System.in);
	
		//변수선언을 우선하고 밑에 name을 쓰는것 근데 name 옆에 타입값 써도 됨
		String name, city;
		int age;
		System.out.print("이름을 입력해보세요===>");
		name=sc.nextLine(); //한줄을 문자로 읽어온다(공백사용가능)
		System.out.println("내이름은"+name+"입니다");
		System.out.print("당신의 나이는?");
		//age=sc.nextInt();
		age=Integer.parseInt(sc.nextLine()); // String ==> int
		System.out.println("당신의 나이는"+age+"입니다");
		//숫자입력후 엔터를 누르면 그엔터가 기보드 버퍼로 저장되어 다음문자열읽을때
		//먼저 읽어버리는 현상발생
		//다음문자읽지전에 숫자를 해결하려면 숫자를 문자처럼 변환해주면 가능
		System.out.print("당신이 사는 지역은?");
		city=sc.nextLine();
		System.out.println("저는"+city+"지녁에 삽니다.");
	}

}
