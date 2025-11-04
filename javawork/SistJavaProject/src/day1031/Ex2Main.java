
package day1031;

public class Ex2Main {

	public static void main(String[] args) {
		// 이효리, 2600000,개발팀
		//객체생성은 자동으로 부모 -> 자식순
		//그래야 자식이 부모의 멤버를 사용할수 있기 때문이다.
		//디폴트 생성자는 자동호출된다
		
		Ex2Maneger man= new Ex2Maneger("이효리", 2600000, "개발팀");
		
		System.out.println(man.getEmp());
	}

}
