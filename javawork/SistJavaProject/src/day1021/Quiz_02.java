package day1021;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		/*당신의 이름은?
		 * 김효신
		 * 당신이 태어난 연도는?
		 * 1997
		 * 당신이 사는 지역은?
		 * 대전
		 * ================
		 * [김효신님의 개인정보]
		 * 지역: 대전
		 * 나이: 28세
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		Calendar cal=Calendar.getInstance();
		
		//변슈
		String name, city, myDdi;
		int myYear, myAge, curYear;
		
		
		 // 입력
        System.out.print("당신의 이름은? ");
        name = sc.nextLine();

        System.out.print("당신이 태어난 연도는? ");
        myYear = Integer.parseInt(sc.nextLine());
        //myYear = sc.nextInt();
        //sc.nextLine(); // 버퍼 비우기 (중요!)

        System.out.print("당신이 사는 지역은? ");
        city = sc.nextLine();

        //계산
        // 현재 연도 
        curYear = cal.get(Calendar.YEAR); //2025
    	// 나이 
        myAge = curYear - myYear;
        
        //띠 자바에서의 로직 순서는 원숭이띠0번째
        //원숭이 닭 개 돼지 쥐 소 호랑이 토끼 용 뱀 말 양(0~11)
        myDdi=myYear%12==0?"원숭이":
        	myYear%12==1?"닭":
        		myYear%12==2?"개":
        			myYear%12==3?"돼지":
        				myYear%12==4?"쥐":
        					myYear%12==5?"소":
        						myYear%12==6?"호랑이":
        							myYear%12==7?"토끼":
        								myYear%12==8?"용":
        									myYear%12==9?"뱀":
        										myYear%12==10?"말":"양";
        // 출력
        System.out.println("================");
        System.out.println("[" + name + "님의 개인정보]");
        System.out.println("지역: " + city);
        System.out.println("나이: " + myAge + "세");
        System.out.println("나의 띠: "+myDdi+"띠");
	}

}
