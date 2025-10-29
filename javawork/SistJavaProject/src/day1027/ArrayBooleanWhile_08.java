package day1027;

import java.util.Scanner;

public class ArrayBooleanWhile_08 {

	public static void main(String[] args) {
		// 숫자배열을 생성과 동시에 초기화
		//해당숫자가 몇번째 있는지 출력,숫자가 없으면 없다라고 출력
		//찾는 숫자를 입력하여 해당숫자의 유무,순번등을 출력.....
		//반복문을 입력하여 0을 입력할때까지 계속할수있다
		
		int [] numData= {7,8,89,98,77,66,54,100,56,33,22};
		
		Scanner sc=new Scanner(System.in);
		boolean flag;
		int su;
		
		while(true)
		{
			System.out.println("검색할 숫자는?");
			su=sc.nextInt();
			
			//0종료
			if(su==0) {
				System.out.println("숫자검색 완료~~~");
				break;
			}
			
			flag=false; //찾아서 있으면 true라고 변경할예정
			
			//값 찾기
			for(int i=0;i<numData.length;i++)
			{
				if(su==numData[i])
				{
					flag=true;
					System.out.println(i+1+"번째 에서 검색됨");
				}
			}
			
			if(!flag) //flag==false
				System.out.println(su+"는 데이타에 없습니다");
		}
		
		

	}

}
