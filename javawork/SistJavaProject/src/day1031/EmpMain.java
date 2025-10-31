package day1031;

import java.util.Scanner;

public class EmpMain {
	
	// static 메서드는 객체를 생성하지 않아도 클래스명으로 직접 호출할 수 있다.
	public static void getEmpPay(Emp e)
	{
		System.out.println
		(e.getName()+"\t"+e.getPay()+"\t"+e.getSudang()+"\t"+e.getNetPay());
	}

	public static void main(String[] args) {
		//회사명, 사원명,급여,수당 입력후 emp테이블 생성후 set메서드를 이용하여 초기값을 입력한다
		//최종적으로 getEmpPay를 호출하여 급여명세서를 사원수만큼 출력한다
		
		Scanner sc=new Scanner(System.in);
		int inwon;
		String empName;
		Emp[] emp; // 인원만큼 생성해주려고?? 
		
		System.out.println("회사이름 입력");
		empName=sc.nextLine();
		
		//화사이름은 static 멤버변수에 저장
		Emp.setEmpName(empName);
		
		System.out.println("총 사원수 입력");
		inwon=Integer.parseInt(sc.nextLine());
		
		//inwon수 만큼 emp배열 할당
		emp=new Emp[inwon];
		
		//입력
		for(int i=0;i<inwon; i++) {
			
			emp[i]=new Emp(); //객체생성
			System.out.println("사원명은?");
			String name =sc.nextLine();
			System.out.println("월급여는");
			int pay=Integer.parseInt(sc.nextLine());
			System.out.println("수당은");
			int sudang= Integer.parseInt(sc.nextLine());
			
			//emp객체에 값 저장하기_초기화 
			emp[i].setName(name);
			emp[i].setPay(pay);
			emp[i].setSudang(sudang);
		}
		
		//출력
		System.out.println("회사명: "+Emp.getEmpName());
		System.out.println();
		System.out.println("사원명\t급여\t수당\t총급여");
		System.out.println("=============================================");
		
		for(Emp e:emp) 
			getEmpPay(e);
	}

}
