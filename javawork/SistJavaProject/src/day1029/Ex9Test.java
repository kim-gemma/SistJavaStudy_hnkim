package day1029;

public class Ex9Test {
	
	private String stuName; //학생명
	private int grade; //학년
	static String schooLName; //학교명
	
	//set변수명_수정용
	public void setStuName(String name) {
		this.stuName = name;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	//get변수명_조회용
	public String getStuName() {
		return stuName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	
	public static void main(String[] args) {
		
		//학교명: 쌍용고등학교
		//학생명: 김수현
		//학년: 2학년
		Ex9Test ex= new Ex9Test();
		
		ex.setStuName("김수현");
		ex.setGrade(2);
		String sname= ex.getStuName();
		int sgrade= ex.getGrade();
		schooLName="쌍용고등학교";
		
		System.out.println("학교명: "+schooLName);
		System.out.println("학샹명: "+sname);
		System.out.println("학년: "+sgrade );
	}

}
