package day1022;

public class IfTest_02 {

	public static void main(String[] args) {
		// 조건 5 (A,B,C,D,F)
		int score = 88;
		char grade;

		if (score > 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'c';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("학점은" + grade + "입니다");

		// 삼항연산자 이용하여 학점 구하기
		grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';
		System.out.println("삼항연산자 학점은" + grade + "입니다");
	}

}
