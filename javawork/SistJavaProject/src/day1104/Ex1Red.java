package day1104;

//sub
public class Ex1Red extends Ex1Color{
//	public void process()
//	{
//		System.out.println("나는 레드를 좋아한다_subClass");
//	}
	@Override
	public void process() {
		super.process();
		System.out.println("나는 레드를 좋아한다_subClass");
	}
}
