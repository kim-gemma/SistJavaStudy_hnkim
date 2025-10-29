package day1029;

class MyJeongbo{
	private String name; //null 
	private int age; //0
	private String city; //null
	
	//변수앞에 private을 붙히면 다른클래스에서 생성을 하더라도 변수명에 접근할수없다
	//반드시 메서드를 만들어서 그 메서드를 호출하여 사용한다 
	//setter메서드: 수정용 getter메서드: 조회용 이 2개를 합쳐서 worker method라 부른다
	//캡슐화라고도 한다

	//수정용메서드_set
	//빈환타입 없다 인자값있음
	public void setName(String name) {
		this.name=name; // 같은 name 이면 this 붙여
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setcCity(String city) {
		this.city=city;
	}
	
	//조회용메서도_get
	//무조건 반환타입 존재함 인자값없음
	 public String getName() {
		 return name;
	 }

	 public int getAge() {
		 return age;
	 }
	 
	 public String getCity() {
		 return city;
	 }
}
/////////////////////////////
public class Ex8WokerMethod {

	public static void main(String[] args) {
		//생성
		MyJeongbo jb1=new MyJeongbo();
		//jb1.name="홍길동"; 변수명 접근 안됨
		jb1.setName("김현능");
		String name =jb1.getName();
		
		jb1.setAge(33);
		int age= jb1.getAge();
		
		jb1.setcCity("평택시");
		String city=jb1.getCity();
		
		//출력
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age+ "세");
		System.out.println("지역: "+ city);
		

	}

}
