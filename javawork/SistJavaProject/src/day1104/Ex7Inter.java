package day1104;

interface MyColor {
	String INITCOLOR="white";
	public void paitColor();
}


class Red implements MyColor {

	@Override
	public void paitColor() {
		// TODO Auto-generated method stub
		System.out.println("현재생상은 "+INITCOLOR);
		System.out.println("래드컬러로 도색합니다.");
	}
	
}

class Blue implements MyColor{

	@Override
	public void paitColor() {
		// TODO Auto-generated method stub
		System.out.println("현재생상은 "+INITCOLOR);
		System.out.println("블루컬러로 도색합니다.");
	}
	
}

class Green implements MyColor{

	@Override
	public void paitColor() {
		// TODO Auto-generated method stub
		System.out.println("현재생상은 "+INITCOLOR);
		System.out.println("그린컬러로 도색합니다.");
	}}



public class Ex7Inter {

	public static void main(String[] args) {
		// red blue green 은 mycolor를 구현하시고 각 클래스마다 
		//현재색상은 white
		//레드컬러로 도색합니다
		//mycolor로 선언하시고 각각의 컬러로 생성해주세요(다형성)
		MyColor color;
		color = new Red();
		color.paitColor();
		
		color=new Blue();
		color.paitColor();
		color=new Green();
		color.paitColor();
	}

}
