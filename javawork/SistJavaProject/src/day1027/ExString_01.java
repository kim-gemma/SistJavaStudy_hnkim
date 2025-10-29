package day1027;

public class ExString_01 {

	public static void main(String[] args) {
		// 문자열에 관한 함수_String객체의 메서드
		
		String str1="apple";
		String str2="Apple";
		String str3="Happy Monday!!!";
		String str4="    Happy day   ";
		
		//길이
		System.out.println("str3의 길이: "+str3.length());
		System.out.println("str4의 길이: "+str4.length());
		//str4의 공백을 제거후 길이
		System.out.println("str4 공백제거후 길이" +str4.trim().length()); //앞뒤공백제거
		
		//인덱스
		System.out.println("str3에서 M의 인덱스: "+str3.indexOf("M"));
		System.out.println("str4에서 d의 인덱스: "+str4.indexOf('d'));
		
		//str4의 day
		System.out.println("str4의 day추출: "+str4.substring(10, 13));
		
		//equals ..같으면 true,다르면 false
		System.out.println("문자열 비교: "+str1.equals(str2));
		System.out.println("대소문자 구분없나? "+str1.equalsIgnoreCase(str2));
		
		//a.compareTo(b)
		//a와 b가 같을경우 0
		//a가 작을경우  -값
		//a가 클경우  +값
		System.out.println(str1.compareTo(str2)); //32(a(97)pple A(65)pple)
		System.out.println(str1.compareTo(str1)); //0
		System.out.println("kiwi".compareTo("orange"));
		System.out.println("김".compareTo("윤"));
		
		//endsWith
		System.out.println(str3.endsWith("Happy"));
		
		//문자열 분리:  split
		//배열선언
		String str5="이태주:김민지:조성진:허현";
		
		System.out.println("str5를 컴마로 분리해서 출력");
		String [] arr=str5.split(":");
		System.out.println("분리된 이름갯수: "+arr.length);  //4
		//출력
		for(int i=0;i<arr.length;i++)
			
			System.out.println(i);
     
	}

}
