package day1024;

public class MultiFor_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("** 다중  for문연습 1 **");
		
		for(int i= 1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println(i+" : "+j++);
				if(j==3){
					break; //j는 3까지만 출력, 현재 반복문 빠져나간다
				}
			}
			System.out.println();
		}
		
		System.out.println("** 다중  for문연습 2 **");
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println(i+" : "+j++);
			}
			System.out.println();
			if(i==2) {
				break;//for의 i영역 i반복문 빠져나간다.
			}
		}

	}

}
