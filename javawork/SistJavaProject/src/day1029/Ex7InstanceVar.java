package day1029;


class MyInfo{
	
	String name; //null 
	int age; //0
	String city; //null
}

/////////////////////////////////
public class Ex7InstanceVar {

	public static void main(String[] args) {
		
		//MyInfo 생성해서 초기화 후 출력
		//디폴트 인스턴스 변수는 생성후 참조변수를 통해서 변수병을 불러올수잇다
		//참조변수명.변수명
		
		MyInfo info =new MyInfo();
		
		info.name ="홍길동";
		info.age =26;
		info.city ="서울시";
		
		System.out.println("이름: " + info.name);
		System.out.println("나이: " + info.age);
		System.out.println("도시: " + info.city);
		
	}

}
