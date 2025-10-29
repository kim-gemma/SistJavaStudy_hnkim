package day1027;

public class ArrayMax_05 {

	public static void main(String[] args) {
		// 배열 최대값 구하기
		int[] data= {100,9,11,33,56,87,98,96,5,21};
		
		System.out.println("갯수: "+data.length);
		
		//첫데이타를 무조건 최대값,최소값에 저장
		int max=data[0];
		int min=data[0];
		
		//2번째 데이타부터 끝까지 max와 비교
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
				max=data[i];
			
			if(min>data[i])
				min=data[i];
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
		

	}

}
