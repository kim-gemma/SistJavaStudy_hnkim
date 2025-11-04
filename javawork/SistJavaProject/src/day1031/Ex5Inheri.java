package day1031;

//super
class School{
	private String schoolAddr; //학교주소
	private int countStu; //학생수
	private int countTeacher; //교사수
	
	// final 키워드는 상수를 의미하므로 보통 대문자로 작성하며, 한 번 정해진 값은 변경할 수 없다.
	public static final String SCHOOLNAME="쌍용고등학교";
	//디폴트생성자
	public School() {
		schoolAddr="강남구";
		countStu=200;
		countTeacher=15;
	}
	
	//명시적생성자
	public School(String addr,int stu,int teacher) {
		this.schoolAddr=addr;
		this.countStu=stu;
		this.countTeacher=teacher;
	}
	//setter getter: 멤버 하나하나만 수정또는 출력하고 싶을수도 있으므로.
	public String getSchoolAddr() {
		return schoolAddr;
	}

	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}

	public int getCountStu() {
		return countStu;
	}

	public void setCountStu(int countStu) {
		this.countStu = countStu;
	}

	public int getCountTeacher() {
		return countTeacher;
	}

	public void setCountTeacher(int countTeacher) {
		this.countTeacher = countTeacher;
	}

	public static String getSchoolname() {
		return SCHOOLNAME;
	}
	
	//출력메서드
	public void writeData() {
		System.out.println("학교명:"
				+ " "+SCHOOLNAME);
		System.out.println("학교주소: "+this.schoolAddr);
		System.out.println("학교수: "+this.countStu+", 선생님수: "+ this.countTeacher);
	}
	
}

//sub
class Student extends School{
	private String stuName;
	private int score;
	
	
	//디폴트 생성자
	public Student() {
		super();
		this.stuName= "김현능";
		this.score= 100;
	}
	//명시적 생성자 _studuent의 멤버 sutdent score을 추가한다
	public Student(String stu, int score) {
		super(stu, score, score);
		this.stuName=stu;
		this.score=score;
	}
	//setter getter 추가
	public void setStuName(String stuName) {
		this.stuName=stuName;
	}
	public void setScore(int score) {
		this.score=score;
	}
	public String getStuName() {
		return this.stuName;
	}
	public int getSocre() {
		return this.score;
	}
	//부모의 writedata를 오버라이딩해서 학생명과 점수를 추가
	@Override
	public void writeData() {
		super.writeData();
		System.out.println("학생명: " + this.stuName);
		System.out.println("점수: " + this.score);
		System.out.println("==============================");
		
	}
	//맨위에 학교명도 추가
	
	
	
}

public class Ex5Inheri {
	public static void main (String[] args) {
		//1. 디폴트 생성자로 생성후 메서드 호출
		Student s1= new Student();
		s1.writeData();
		//2. 명시적 생성자로 생성후 메서드 호출
		Student s2= new Student("이효리", 100);
		s2.writeData();
		//3. 1번째의 학생명과 점수만 변경후 다시 출력해보기
		//생성을 다시하면 또하나의 주소값이 생기므로 생성하지 않고 참조변수를 이용하여 변경 
		s1.setStuName("유재석");
		s1.setScore(50);
	}

}
