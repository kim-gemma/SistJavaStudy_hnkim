package day1021;

public class OperTest_12 {

	public static void main(String[] args) {
		//비교(관계)연산자: >크다,<작다,>=크거나같다,<=작거나같다, ==,!=
		//논리연산자: &&(ADN), ||(OR),!{NOT)
		
		int a=5,b=3,c=3;
		
		//결과값이 true,false
		System.out.println(a>b); //t
		System.out.println(a==b); //f
		System.out.println(!(a==b)); //t
		System.out.println(a!=b); //t
		System.out.println(a>b&&b>c); //f
		System.out.println(a>b||b>c); //t
	}

}
