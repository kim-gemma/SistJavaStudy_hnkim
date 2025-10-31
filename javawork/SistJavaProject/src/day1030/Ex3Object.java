package day1030;

class StuScore{
	
	private String stuName;
	private int java;
	private int oracle;
	
	static final String TITLE="자바오라클 중간시험";

	//각각의 setter,getter
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	
	
	
	//합계메서드
	public int getTot()
	{
		int s=this.java+this.oracle;
		return s;
	}
	
	//평균메서드
	public double getAvg()
	{
		double result=this.getTot()/2.0;
		return result;
	}
	
	
}

public class Ex3Object {

	public static void main(String[] args) {
		/*자바오라클 중간시험
		이름: 박호준
		자바점수: 87
		오라클점수: 99
		합계: 186점 
		평균: 93.0 점*/
		
		StuScore stu=new StuScore();
		
		stu.setStuName("박호준");
		stu.setJava(87);
		stu.setOracle(99);
		
		int tot=stu.getTot();
		double avg=stu.getAvg();
		
		//출력
		System.out.println(StuScore.TITLE);
		System.out.println("이름: "+stu.getStuName());
		System.out.println("자바점수: "+stu.getJava());
		System.out.println("오라클점수: "+stu.getOracle());
		System.out.println("합계: "+tot);
		System.out.printf("평균: %.1f",avg);
		

	}

}
