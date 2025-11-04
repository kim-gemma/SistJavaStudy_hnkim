package day1104;

//sub
public class Ex1Orange extends Ex1Color {
//	public void process()
//	{
//		System.out.println("나는 오렌지_subClass");
//	}
	@Override
	public void process() {
		super.process();
		System.out.println("나는 오렌지_subClass");
	}
}
