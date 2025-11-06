package day1105;

public class Ex3Exception {

	public static void main(String[] args) {

		System.out.println("프로그램시작!!");
		try { //예외발생할만한 코드
			int num=3/0; //정수를 0으로 나누면 에러발생
		}catch (Exception e) {
			// 예외처리
			//e.printStackTrace();//자세한 예외정보
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상종료!!!");

	}

}
