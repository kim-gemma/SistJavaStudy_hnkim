package day1023;

public class SwitchTest_02 {

	public static void main(String[] args) {
		// break가 없으면 끝까지 실행

		int n=4;
		
		switch(n) 
		{
		case 1:
			System.out.println("n is 1");
			break;
		case 2:
			System.out.println("n is 2");
			break;
		case 3:
			System.out.println("n is 3");
			break;
		default:
			System.out.println("n is>3");
		}
	}

}
