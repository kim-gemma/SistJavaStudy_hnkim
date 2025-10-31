package day1030;

public class EX8Method {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		nice(26);
		nice(33);

		hello("이수연",175.3);
	}

	public static void hello(String name,double height) {

		System.out.println("저의 이름은 "+name+"입니다");
		System.out.println("저의 키는 "+height+"cm 입니다");
		System.out.println("감사합니다");
	}

	public static void nice(int age) {

		System.out.println("안녕하세요");
		System.out.println("제나이는 "+age+"세 입니다");
	}

}
