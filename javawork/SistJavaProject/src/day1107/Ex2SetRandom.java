package day1107;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex2SetRandom {

	public static void main(String[] args) {
		// 1~45사이의 랜덤수 6개구해서 출력하기
		Random rnd=new Random();
		Set<Integer> set=new HashSet<Integer>();
		
		while(true) {
			
			int n=rnd.nextInt(45)+1; 
			set.add(n);
			
			if(set.size()==6)
				break;
		}
		
		
		System.out.println("출력#1_for~each");
		for(int n:set)
			System.out.printf("%5d",n);
		System.out.println();
		
		System.out.println("**정렬후 출력***");
		
		Object [] ob=set.toArray();
		//오름차순 정렬
		Arrays.sort(ob); 
		for(int i=0;i<ob.length;i++)
			System.out.printf("%5d",ob[i]);

	}

}
