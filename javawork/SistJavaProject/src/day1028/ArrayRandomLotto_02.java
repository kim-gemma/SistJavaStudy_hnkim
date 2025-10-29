package day1028;

public class ArrayRandomLotto_02 {

	public static void main(String[] args) {
		// 로또6개를 출력(1~45까지의 랜덤수) 단 같은수가 나오면 다시추점한다
		int[] lotto=new int[6];
		//랜덤수를 로또변수에 발생시켜서 넣어준다
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;  //1~45까지의 난수
			//System.out.println("뽑은값: "+lotto[i]);
			
			//중복처리
			//중복제거: 현재 index (i)와 (0~i-1)까지를 비교해서 중복된 숫자가 존재하면 i--
			for(int j=0;j<i;j++)
			{
				//System.out.println(lotto[i]+"==>"+lotto[j]);
				if(lotto[i]==lotto[j])
				{
					//System.out.println("중복");
					i--; //같은 번지에 다시 값을 구하려고...
					break; //자기가 속한 반복문 빠져나간다 i++로 이동
				}
			}
			
		}
		
		//오름차순 정렬
		for(int i=0;i<lotto.length-1;i++)
		{
			for(int j=i+1;j<lotto.length;j++)
			{
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		//출력
		for(int i=0;i<lotto.length;i++)
		{
			System.out.print(lotto[i]+"\t");
		}
		System.out.println();
		

	}

}
