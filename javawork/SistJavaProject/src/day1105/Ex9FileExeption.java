package day1105;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex9FileExeption {

	/*score.txt일고 총몇개인지구하고
	 * 점수에 대한 총점 평균구해서 출력하기*/
	public static void scoreRead() throws IOException,FileNotFoundException
	{
		String fileName="C:\\sist1017\\work\\file\\score.txt";
		FileReader fr=null;
		BufferedReader br=null;
		int cnt=0; //총갯수
		int total=0; //총합계
		double avg=0; //평균
		
		//파일읽기
		fr=new FileReader(fileName);
		System.out.println("파일이 정상적으로 오픈!!!");
		br=new BufferedReader(fr);
		
		while(true)
		{
			String s=br.readLine();
			//더이상 값이 없으면 종료
			if(s==null)
				break;
			
			System.out.println(s);
						
			//문자열 점수를 int로 변환해서 합계랑 갯수 구하기
			cnt++; //읽은갯수
			total+=Integer.parseInt(s);
			
		}
		
		System.out.println("==========================");
		//평균구하기
		avg=(double)total/cnt;
		System.out.println("총갯수: "+cnt+"개");
		System.out.println("총점: "+total+"점");
		System.out.printf("평균:%.2f점\n",avg);
		
		//finally..자원닫기
		br.close();
		fr.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			scoreRead();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("정상종료");
	}

}
