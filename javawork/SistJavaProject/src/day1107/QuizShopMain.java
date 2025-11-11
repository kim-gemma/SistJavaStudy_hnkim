package day1107;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizShopMain {

	//리스트의 제네릭유형은 QuizShop이라는 클래스이다
	List<QuizShop> list=new ArrayList<QuizShop>();
	Scanner sc=new Scanner(System.in);

	//입력
	//상품,색상,제조사,수량,가격에 대해서 값을 입력받는다
	//입력한 상품의 갯수를 출력해본다
	public void ipgoSangpum()
	{
		
		//변수선언
		String sname,col,company;
		int su,dan;

		System.out.println("상품명");
		sname=sc.nextLine();
		System.out.println("상품색상");
		col=sc.nextLine();
		System.out.println("상품제조회사");
		company=sc.nextLine();
		System.out.println("입고된 수량");
		su=Integer.parseInt(sc.nextLine());
		System.out.println("입고된 가격");
		dan=Integer.parseInt(sc.nextLine());

		//클래스를 생성해서 리스트에 추가해준다..제네릭유형이 클래스이므로
		QuizShop shop=new QuizShop();
		shop.setSangpumName(sname);
		shop.setColor(col);
		shop.setMadeCompany(company);
		shop.setSu(su);
		shop.setPrice(dan);

		list.add(shop);

		System.out.println("입고된 상품갯수: "+list.size()+"개");


	}
	
	
	//출력
	//번호    상품명     색상      제조사       수량     가격    총금액
	public void jegoSangpum()
	{
		System.out.println("***상품 재고 현황***");
		System.out.println("--------------------------------------------");
		System.out.println("번호\t상품명\t색상\t제조사\t입고수량\t가격\t총금액");
		System.out.println("--------------------------------------------");

		for(int i=0;i<list.size();i++)
		{
			QuizShop s=list.get(i);

			int totalPrice=s.getSu()*s.getPrice();

			System.out.println(i+1+"\t"+s.getSangpumName()
			+"\t"+s.getColor()+"\t"+s.getMadeCompany()+"\t"
			+s.getSu()+"\t"+s.getPrice()+"\t"+totalPrice);

		}
	}

	//3.상품검색
	public void shopSearch()
	{
		//상품을 입력하면(이름의 일부도가능..equals,startsWith,contains)모두 출력
		//없을경우 "해당제품 없음"
		System.out.println("검색할 상품명을 입력해주세요");
		String sangpum=sc.nextLine();
		
		boolean find=false;
		System.out.println("***검색결과***");
		for(QuizShop s:list)
		{
			if(s.getSangpumName().equals(sangpum)) 
			//if(s.getSangpumName().startsWith(sangpum))//상품명으로 시작하는
			//if(s.getSangpumName().contains(sangpum)) //입력한상품명을 포함한
			{
				find=true;
				
				int totalPrice=s.getSu()*s.getPrice();
				
				System.out.println(s.getSangpumName()
				+"\t"+s.getColor()+"\t"+s.getMadeCompany()+"\t"
				+s.getSu()+"\t"+s.getPrice()+"\t"+totalPrice);
			}
			
		}
		
		if(!find) //find==false
			System.out.println("해당상품은 없습니다");
	}

	
		//4.상품삭제
		public void deleteSangpum()
		{
			//삭제할 상품명을 입력해주세요 ..입력시 삭제
			//없을시 ~~  삭제할 상품명이 없습니다
			System.out.println("삭제할 상품명을 입력하세요");
			String sang=sc.nextLine();
			
			boolean find=false;
			
			for(int i=0;i<list.size();i++)
			{
				QuizShop s=list.get(i);
				
				if(s.getSangpumName().equals(sang))
				{
					find=true;
					list.remove(i);
				}
			}
			
			if(find) //find==true
				System.out.println("삭제되었습니다");
			else  //find==false
				System.out.println("해당상품이 없습니다");
			
		}

	public static void main(String[] args) {
		// 1.상품입고    2.상품재고     9.종료
		QuizShopMain quiz=new QuizShopMain();
		int s;
		Scanner sc=new Scanner(System.in);

		while(true)
		{
			System.out.println("1.상품입고    2.상품재고 3.상품검색 4.상품삭제  9.종료");
			s=Integer.parseInt(sc.nextLine());

			if(s==1)
				quiz.ipgoSangpum();
			else if(s==2)
				quiz.jegoSangpum();
			else if(s==3)
				quiz.shopSearch();
			else if(s==4)
				quiz.deleteSangpum();
			else if(s==9)
			{
				System.out.println("종료");
				break;
			}
			else
				System.out.println("다시입력바람");
		}
	}

}
