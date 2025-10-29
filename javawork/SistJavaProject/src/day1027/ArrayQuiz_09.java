package day1027;

import java.util.Scanner;

public class ArrayQuiz_09 {

	public static void main(String[] args) {
		// 메뉴명을 입력하여 '해당메뉴는 2번째에 있습니다' Q or q를 입력시 프로그램 종료
		//티본스테이크 처럼 없는 메뉴 입력하면 '해당메뉴는 본 메뉴에 없습니다'

		String[] menu= {"아보카도 샌드위치","에그샌드위치","콥샐러드","치아바타 샌드위치"
				,"스테이크 샐러드","까르보나라 파스트","토마토파스트"};
		
		Scanner sc=new Scanner(System.in);
		boolean flag;
		String menuName;
		
		while(true)
		{
			System.out.println("검색할 메뉴명 입력");
			menuName=sc.nextLine();
			
			//종료
			if(menuName.equalsIgnoreCase("Q"))
			{
				System.out.println("종료합니다");
				break;
			}
			
			flag=false; //찾으면 true로 변경
			
			//값찾기
			for(int i=0;i<menu.length;i++)
			{
				if(menuName.equals(menu[i]))
				{
					flag=true;
					System.out.println(i+"번지에서 검색함");
				}
			}
			
			if(!flag)
				System.out.println(menuName+"는 메뉴판에 없습니다");
		}
		
		
	}

}
