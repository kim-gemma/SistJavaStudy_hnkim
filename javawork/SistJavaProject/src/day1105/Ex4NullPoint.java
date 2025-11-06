package day1105;

import java.util.Date;

//NullPointerException(널포인터 예외)
public class Ex4NullPoint {

	Date date; //선언  // Date형 멤버변수 'date' 선언 (아직 객체 생성 안됨)
	// date = new Date(); // ✅ 객체 생성 추가 이런식의 객체생성이 필요함 
	
	public void writeday()
	{
		int y,m,d;

		try {
			y=date.getYear()-1900;
			m=date.getMonth()+1;
			d=date.getDate();

			System.out.println(y+"년"+m+"월"+d+"일 입니다");
		}catch (NullPointerException e) {
			System.out.println("객체생성을 안했네요~~"+e.getMessage());
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex4NullPoint np=new Ex4NullPoint(); // 객체 생성
		np.writeday();  // 메서드 호출
 
		System.out.println("정상종료!!!!");
	}

}
