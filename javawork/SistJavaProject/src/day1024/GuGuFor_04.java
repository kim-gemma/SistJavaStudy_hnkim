package day1024;

public class GuGuFor_04 {

	public static void main(String[] args) {
		// 2~9단(세로)
		
		for(int i=2;i<=9;i++)  //단
		{
			for(int j=1;j<=9;j++)
			{
				if(j==5)
					break;  //각단의 4까지만 출력
				
				System.out.println(i+"X"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		//자신이 속한 반복문말고 최상단 반복문 빠져나가는것도 가능?
		//이름(라벨)을 주어서 빠져나가는것 가능
		System.out.println("최상단 라벨을 주어 빠져나가는 경우");
	soo:for(int i=2;i<=9;i++)  //단
		{
			for(int j=1;j<=9;j++)
			{
				if(j==5)
					break soo;  //최상단빠져나감
				
				System.out.println(i+"X"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		
		
		
		
		
		System.out.println("========================================");
		System.out.println("**가로방향구구단**");
		
		for(int i=2;i<=9;i++)
		{
			System.out.print("["+i+"단]\t");
		}
		System.out.println();
		
		for(int j=1;j<=9;j++)
		{
			for(int i=2;i<=9;i++)  //단
			{
				System.out.print(i+"X"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}

	}

}