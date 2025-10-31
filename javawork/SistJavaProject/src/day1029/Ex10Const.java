package day1029;

class StuInfo {
	private String stuName;
	private String major;
	private int grade; 
	
	//명시적 생성자
	public StuInfo(String sname, String mj, int grade ) {
		stuName=sname;
		major=mj;
		this.grade=grade;
	}
	
	//getter메서드
	public String getStuName(){
		return stuName;
	}
	public String getMajor(){
		return major;
	}
	public int getGrade(){
		return grade;
	}
}

public class Ex10Const {

	public static void main(String[] args) {
		
		//생성과 동시에 초기화해주었으므로
		//setter메서드의 역할까지 해준것
		StuInfo stu1=new StuInfo("홍길동", "유아교육과", 2);
		String sname =stu1.getStuName();
		String smajor = stu1.getMajor();
		int grade = stu1.getGrade();
		
		//출력
		System.out.println(sname+"님의 전공은 "+smajor+"이며 학년은 "+grade+" 입니다");

	}

}
