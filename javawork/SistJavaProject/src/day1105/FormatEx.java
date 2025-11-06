package day1105;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatEx {

	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
		//날짜,시간 원하는 양식에 맞게 출력
		//HH:24시간 MM:월  mm:분
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		System.out.println(sdf1.format(date));
		
		//a:오전/오후  hh:12시간표시
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		//EEE:월 EEEE:월요일
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy년 MM월 dd일 HH시mm분");
		System.out.println(sdf4.format(date));
		
		//숫자를 문자열로 변환하여 출력(컴마나 소수점 지정가능)
		int money=9859400;
		double num=1254.478500;
		
		NumberFormat nf1=NumberFormat.getCurrencyInstance(); //화폐단위랑 컴마제공
		System.out.println(nf1.format(money));
		
        NumberFormat nf2=NumberFormat.getInstance();//컴마제공
        System.out.println(nf2.format(money));
        System.out.println(nf2.format(num));
	}

}
