package day1104;

/*
 StudentInfo _멤버클래스
StudentInfoMain - 멤버클래스를 생성하여 위의 이미지처럼 출력하시오


static 멤버 변수명   :  schoolName
멤버변수명   :  name,java,html
멤버 메서드 : setter & getter 메서드 구현


1.두과목의 합계를 반환하는 메서드  getTotal()
2.두과목의 평균을 반환하는 메서드  getAverage()
3.평균에 대해서  90 이상이면 “장학생”
  80 이상이면  “합격”
  나머지는 “불합격” 을 반환하는 메서드   getPungga()
 
메인메서드에서 사원예제처럼   학교이름 입력받아 schoolName 에 넣고
인원수 입력받아 인원수만큼 이름,java,html 점수를 입력후
 
출력은
학교명 : 청담고등학교
 
이름	     Java  HTML    총점       평균         평가
이영자 	90       81	    171        85.5       합격

 */

/*
프로그램 시작
   ↓
main() 실행
   ↓
학교명, 학생수 입력
   ↓
StudentInfo.setSchoolName()
   ↓
배열 생성 (stu[])
   ↓
for문으로 학생 입력
   ├─ new StudentInfo()
   ├─ setName()
   ├─ setJava()
   └─ setHtml()
   ↓
출력문 (학교명, 헤더)
   ↓
for문(getStudentInfo)
   ├─ getName(), getJava(), getHtml()
   ├─ getTotal()
   ├─ getAverage()
   └─ getPungga()
   ↓
모든 학생 출력 완료
   ↓
프로그램 종료
 */
import java.util.Scanner;

class StudentInfo{
	
	private static String schoolName; //static은 객체가 아니라 클래스에 속함 클래스변수
	private String name; // 인스턴스 변수
	private int java;
	private int html;
	
	//setter getter
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		StudentInfo.schoolName = schoolName; 
		//학교 전체 이름판 -학생 전체가 공유하는 정보
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		//개벌 학생 ID카드 -각자다름
		//this는 객체 자신을 가리킴
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	
	//getTotal
	public int getTotal()
	{
		return java+html;
	}
	
	//getAverage
	public double getAverage()
	{
		return getTotal()/2.0;
	}
	
	//getPungga
	public String getPungga()
	{
		if(getAverage()>=90)
			return "장학생";
		else if(getAverage()>=80)
			return "합격";
		else
			return "불합격";
	}
	
}
//////////////////////////////////////
public class StudentInfoMain {

	//출력
	public static void getStudentInfo (StudentInfo sinfo)
	{
		System.out.println(sinfo.getName()+"\t"+sinfo.getJava()+"\t"+sinfo.getHtml()+"\t"
	     +sinfo.getTotal()+"\t"+sinfo.getAverage()+"\t"+sinfo.getPungga());
	}
	
	
	public static void main(String[] args) {
		// 생성해서 인원수만큼 입력후 출력
		Scanner sc=new Scanner(System.in);
		int inwon;
		StudentInfo [] stu;
		
		System.out.println("입력할 학생수는?");
		inwon=Integer.parseInt(sc.nextLine());
		System.out.println("학교명?");
		String schoolName=sc.nextLine();
		
		StudentInfo.setSchoolName(schoolName); //입력한 학교명으로 초기값
		
		//그인원수만큼 StudentInfo배열 할당
		stu=new StudentInfo[inwon];
		
		//그인원수만큼 입력
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+" 번 학생 이름");
			String name=sc.nextLine();
			System.out.println("자바점수와 HTML 점수입력");
			int java=Integer.parseInt(sc.nextLine());
			int html=Integer.parseInt(sc.nextLine());
			
			//i번째 StudenInfo생성
			stu[i]=new StudentInfo();
			
			//setter메서드에 입력한 값으로 초기화
			stu[i].setName(name);
			stu[i].setJava(java);
			stu[i].setHtml(html);
		}
		
		System.out.println("**결과출력**");
		System.out.println("학교명: "+StudentInfo.getSchoolName());
		System.out.println("학생명\tJava\tHtml\t총점\t평균\t평가");
		System.out.println("------------------------------------------------");
		for(StudentInfo s:stu)
			getStudentInfo(s);
		

	}

}