package day1106;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set: 순서유지 없다 중복 허용안함
//Set: 인터페이스 HashSet :set을 구현한 클래스
//Set<제네릭타입> 참조변수명=new HashSet<제네릭타입>();
public class Ex6HashsSet {

	public static void main(String[] args) {
		// set안에 스트링이라는 자료형의 자료형의 데이터만 담겠다.
		Set<String> set1=new HashSet<String>();
		
		//추가,삭제가 가능한게 배열과의 가장 큰 차이점_가변적이다
		set1.add("사과");
		set1.add("배");
		set1.add("오렌지");
		set1.add("사과");
		set1.add("바나나");
		set1.add("사과");
		//데이터 갯수
		System.out.println("데이터갯수: " +set1.size());
		
		System.out.println("#출력1_for문");
		//List에서는 get(i)로 인덱스 접근이 가능하지만
//		Set은 순서(index)가 없기 때문에 get() 메서드가 없음.
//
//		그래서 for (int i=0; …) 문은 Set과는 맞지 않아요.
		for (String s : set1) {
			System.out.println(s);
		}
		
		System.out.println("#출력2_iterator");
		Iterator<String> iter= set1.iterator();
		while(iter.hasNext()) {
			String s=iter.next();
			System.out.println(s);
		}
		
		System.out.println("#출력3_");
		Object[] ob=set1.toArray();
		// ② Object는 자바의 모든 클래스의 최상위(조상) 클래스이다.
//		    => String, Integer, Double, Scanner 등 모든 클래스는 Object를 상속받는다.
		//
//		       예시: class String extends Object
//		             class Integer extends Object
		//
//		    따라서 Object 타입 변수에는 어떤 객체든 담을 수 있다.
		//
		// ③ 그래서 Object[]는 “모든 타입의 데이터를 담을 수 있는 배열”이다.
//		    단, 꺼내서 사용할 때는 원래 타입으로 캐스팅이 필요하다.
		//
		// ④ 즉, 이 문장은 “Set에 들어있는 모든 요소를 Object 배열로 변환한다”는 뜻이다.

		for(int i=0; i<ob.length; i++) {
			System.out.println(ob[i]);
		}
		
		//모든데이터 삭제
		set1.clear();

		//isEmpty
		if(set1.isEmpty()) {
			System.out.println("Set타입안에 데이터가 없다!!!");
		}else {
			System.out.println("데이터가 있다");
		}
	}

}
