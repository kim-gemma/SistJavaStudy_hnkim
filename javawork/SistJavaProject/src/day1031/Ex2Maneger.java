package day1031;

//sub(자식 클래스)
public class Ex2Maneger extends Ex2Emp {
	
	String dept; //부서
	
	
    // 생성자
	public Ex2Maneger(String name, int sal, String d) {
		super(name, sal); //부모(Ex2Emp)의 생성자 호출
		this.dept=d;   // 자식 클래스의 필드 초기화
	}
	
	@Override 
    // 부모 클래스의 메서드를 자식이 다시 정의(재정의)한 메서드
    // 목적: 부모의 기능을 그대로 사용하는 대신, 자식 클래스에서 확장하거나 다르게 동작시키기 위함
    // 개념: 자식을 생성하면 부모 객체도 함께 생성된다.
	public String getEmp() {
		return super.getEmp()+ "," + dept;
	}
}
