package day1029;

public class Ex4ConstTest {
	
	//iv와 static변수 비교 테스트
	//static int count=0;
	int count=0;
	
	//생성자
	public Ex4ConstTest() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex4ConstTest con= new Ex4ConstTest(); //iv =1 ,cv= 1
 		Ex4ConstTest con2=new Ex4ConstTest(); // iv= 1 ,cv=2
		
		// 인스턴스 변수는 서로 다른 메모리를 가지고 있으므로 생성을 각각 하더라도 
		//카운트가 중가 하지 않는다
		//static은 서로 메모리를 공유하므로 생성을 또해도 1,2,3 증가한다.

	}
}
