package day1105;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizFile {

	public static void ipgoRead()
	{
		//번호 상품명 수량 가격 총금액
		//Split or StringTokneizer 를 활용해서 출력해보세요
		String fileName="C:\\sist1017\\work\\file\\ipgo.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
			
			System.out.println("***입고상품***");
			System.out.println("---------------------------------");
			System.out.println("번호\t상품명\t수량\t가격\t총금액");
			System.out.println("---------------------------------");
			
			int cnt=0;
			
			while(true)
			{
				String s=br.readLine();
				
				if(s==null)
					break;
				//분리
				StringTokenizer st=new StringTokenizer(s, ":");
				
				//배열갯수만큼 반복출력
				String sangName=st.nextToken();
				int su=Integer.parseInt(st.nextToken());
				int price=Integer.parseInt(st.nextToken());
				int total=su*price;
				
				
				System.out.println(++cnt+"\t"+sangName+"\t"+su+"개\t"+price+"원\t"+total+"원");
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ipgoRead();
	}

}
