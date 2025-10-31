package day1030;

import java.util.Scanner;

public class SawonMain {

	// Sawon테이블의 멤버를 이용해서 출력 []
	public static void getSawonPay(Sawon[] sawon)
	{
		//제목부터 호출
		Sawon.getTitle();
		
		//입력한 사원수만큼 배열출력
		for(Sawon sa:sawon)
			System.out.println(sa.getSname()+"\t"+sa.getPay()+"\t"+sa.getFamilySu()+"\t"
		+sa.getTimeSu()+"\t"+sa.getFamilySudang()+"\t"+sa.getTimeSudang()
		+"\t"+sa.getTotalPay());
	}
	
	public static void main(String[] args) {
		//사원수를 입력하여 그수만큼 사원명 급여 가족수 시간외근무시간을 입력해서
		//그입력한 값을 생성한다
		Scanner sc=new Scanner(System.in);
		int inwon;
		Sawon [] sawon;
		
		System.out.println("입력할 직원수는 몇명입니까?");
		inwon=Integer.parseInt(sc.nextLine());
		
		//배열할당
		sawon=new Sawon[inwon];  //3 입력하면??
		
		//인원수만큼 데이타 입력
		for(int i=0;i<inwon;i++) // 0.1.2 번지 이렇게 생성??
		{
			//Sawon 생성
			sawon[i]=new Sawon(); //디폴트 생성
			
			System.out.println("사원명");
			String name=sc.nextLine();
			System.out.println("급여?");
			int pay=Integer.parseInt(sc.nextLine());
			System.out.println("가족수?");
			int fs=Integer.parseInt(sc.nextLine());
			System.out.println("초과근무시간?");
			int ts=Integer.parseInt(sc.nextLine());
			
			//입력한 값이 setter메소드의 데이타로 초기화
			sawon[i].setSname(name);
			sawon[i].setPay(pay);
			sawon[i].setFamilySu(fs);
			sawon[i].setTimeSu(ts);
		}
		
		
		//출력
		getSawonPay(sawon);
		
		
		
	}

}
