package day1029;

public class Ex3StudentTest {

	public static void main(String[] args) {
		
         Ex3Student.schoolName="쌍용교육센터";
         
         //학생2명의 정보를 초기화
         Ex3Student stu1=new Ex3Student();
         Ex3Student stu2=new Ex3Student();
         
         stu1.name="조성진";
         stu1.age=26;
         
         stu2.name="백진욱";
         stu2.age=25;
         
         System.out.println("**클래스 멤버값 출력**");
         System.out.println("학교명: "+Ex3Student.schoolName);
         
         System.out.println("학생1정보");
         System.out.println("이름:" +stu1.name);
         System.out.println("나이: "+stu1.age);
         
         System.out.println("학생2정보");
         System.out.println("이름: "+stu2.name);
         System.out.println("나이: "+stu2.age);
	}

}
