package day1104;

interface InterA{
	public void work();
	public void play();
}

//interface InterB extends InterA{ 
	// 같은 종류끼리는 extends가 맞다!
	// (클래스-클래스: extends, 인터페이스-인터페이스: extends, 클래스-인터페이스: implements)
interface InterB {
	public void write();
}

//2개의 인터페이스를 구현하는 클래스
//다중구현이 가능하다
class InterImpl implements InterA,InterB{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println(" 글을작성");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("작업을함");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("축구를 합니다");
	}

	
	
}
public class Ex6Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자식클래스생성
		InterImpl impl= new InterImpl();
		impl.work();
		impl.play();
		impl.write();
		//다형성생성
		InterA a = new InterImpl();
		a.work();
		a.play();
		// a.write(); // ❌ InterA에는 write()가 없으므로 호출 불가

		System.out.println("----------------------");

		InterB b = new InterImpl();
		b.write();
		// b.work(); // ❌ InterB에는 work(), play()가 없으므로 호출 불가
	}

}
