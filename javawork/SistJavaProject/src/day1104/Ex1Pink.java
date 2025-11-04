package day1104;

//sub
public class Ex1Pink extends Ex1Color {
//	public void process()
//	{
//		System.out.println("나는 핑크매니아_subClass");
//	}
	@Override
	public void process() {
		super.process();
		System.out.println("나는 핑크매니아_subClass");
	}
}
