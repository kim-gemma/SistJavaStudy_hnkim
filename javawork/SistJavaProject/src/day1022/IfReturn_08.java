package day1022;

import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class IfReturn_08 {

	public static void main(String[] args) {
		// 점수를 입력하는데 범위1~100만 입력하고 잘못입력시 매서드 종료하게..
		//void는 리턴받을게 없고 라는 뜻 **void는 **"이 메서드는 어떤 값도 반환하지 않는다
		//void는 “값을 돌려주지 않는다”
		//return;은 “메서드를 종료한다”
		
		Scanner sc=new Scanner(System.in);
		int score;
		
		System.out.println("점수입력(1~100)");
		score=sc.nextInt();
		
		//잘못입력한 경우 종료
		if(score<1 || score>100) {
			System.out.println("잘못입력했습니다");
			return; //현재 main 함수 종료!!** 
		}
		else
			System.out.println("점수: "+score);

	}

}
