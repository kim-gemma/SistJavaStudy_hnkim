package day1028;

import java.util.Iterator;

public class Array2ChaSum_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] stuName= {"조성진","이태주","김민지"};
		int [][] score= {
				{88,77,99,0},
				{98,56,100,0},
				{55,88,99,0}
		};
		
		//총점 구하기
		for(int i=0;i<score.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				score[i][3]+=score[i][j];
			}
		}
		
		//출력
		System.out.println("이름\t자바\t오라클\t스프링\t총점");
		System.out.println("===========================================");
		
		for(int i=0;i<stuName.length;i++)
		{
			System.out.print(stuName[i]+"\t");
			//점수와 총점은 열갯수만큼 반복해서 출력
			for(int j=0;j<score[i].length;j++)
			{
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
