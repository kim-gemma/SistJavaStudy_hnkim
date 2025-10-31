package day1030;

class MyShop{
	
	private String sangName;
	private int price;
	private String company;
	
	//생성과 동시에 초기화
	public MyShop(String s,int p,String c) {
		this.sangName=s;
		this.price=p;
		this.company=c;
	}
	
	//제목메서드
	public static void setTitle()
	{
		System.out.println("상품명\t가격\t회사명");
		System.out.println("===============================");
	}
	//출력문
	public void getSangpums()
	{
		System.out.println(sangName+"\t"+price+"원\t"+company);
	}
	
}

public class Ex6ArrayObject {

	public static void main(String[] args) {
		
		//4개를 생성후 출력_배열로만
		MyShop [] sh=new MyShop[4];
		
		sh[0]=new MyShop("아이폰", 1200000, "애플");
		sh[1]=new MyShop("갤럭시", 1500000, "삼성");
		sh[2]=new MyShop("에어팟", 300000, "애플");
		sh[3]=new MyShop("그램", 1500000, "엘지");
		
		//제목출력
		System.out.println("입력한 상품들 출력_for");
		
		MyShop.setTitle();
		for(int i=0;i<sh.length;i++)
		{
			sh[i].getSangpums();
		}
		System.out.println("=============================");
		
		System.out.println("입력한 상품들 출력_for~each");
		
		MyShop.setTitle();
		for(MyShop s:sh)
			s.getSangpums();
		
		
		
		
				

	}

}
