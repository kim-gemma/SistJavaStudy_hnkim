package day1027;

public class ArrayString_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str;
		str=new String[4]; //1.생성
		
		//2.초기값
		str[0]="김밥";
		str[1]="떡볶이";
		str[2]="쫄면";
		str[3]="돈까스";
		
		System.out.println("출력_#1");
		for(int i=0;i<str.length;i++)
		{
			System.out.println((i+1)+":"+str[i]);
		}
		
		System.out.println("출력_#2");
		for(String s:str)
			System.out.println(s);
		
		System.out.println("-----------------------------");
		
		System.out.println("선언과 동시에 초기값을 지정하기도 한다_주로이렇게 많이함");
		
		String[] menu= {"파스타","피자","샐러드","양송이스프"};
		
		System.out.println("menu갯수: "+menu.length);
		
		//메뉴 1==>파스타  요렇게 출력해보세요
		for(int i=0;i<menu.length;i++)
		{
			System.out.println("메뉴"+(i+1)+"==>"+menu[i]);
		}
		System.out.println("for~each로 가로로 메뉴출력");
		for(String m:menu)
		{
			System.out.print(m+"  ");
		}
		
	}

}
