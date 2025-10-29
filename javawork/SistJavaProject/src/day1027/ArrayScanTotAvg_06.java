package day1027;

import java.util.Scanner;

public class ArrayScanTotAvg_06 {

	public static void main(String[] args) {
		//인원수를 먼저 입력후 그 인원수만큼 이름과 점수를 입력후 총점,평균 구하기
		
		int iw; //입력할 인원수
		String [] name; //입력한 이름
		int [] score; //입력한 점수
		int [] rank;
		
		
		int tot=0;
		double avg=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("몇명의 학생들을 입력하실건가요?");
		iw=Integer.parseInt(sc.nextLine()); //다음에 이름(문자열)입력하기위해서
		
		//인원수만큼 배열할당
		name=new String[iw]; 
		score=new int[iw];
		rank=new int[iw];
		
		//학생수만큼 데이타 입력
		for(int i=0;i<iw;i++)
		{
			System.out.println(i+"번지 학생명");
			name[i]=sc.nextLine();
			System.out.println(i+"번지 점수");
			score[i]=Integer.parseInt(sc.nextLine());
			
			//총점
			tot+=score[i];
		}
		
		//등수구하기(다중 for문)
		for(int i=0;i<iw;i++) //기준
		{
			rank[i]=1;
			
			for(int j=0;j<iw;j++) //비교
			{
				//비교하는 대상이 점수가 높으면 i번지의 등수를 1증가
				if(score[i]<score[j])
					rank[i]++;
			}
		}
		
		
		//평균
		avg=(double)tot/iw;
		
		//출력
		System.out.println("----------------------------------");
		System.out.println("번호\t학생명\t점수\t등수");
		System.out.println("----------------------------------");
		
		for(int i=0;i<iw;i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		
		System.out.println("---------------------------------");
		System.out.println("총점: "+tot+"점");
		System.out.println("평균: "+avg+"점");
		
		

	}

}
