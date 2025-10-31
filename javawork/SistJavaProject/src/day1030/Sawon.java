package day1030;

/****쌍용 직원 급여현황***


가족수당:  가족당 5만원 (단 4인이상은 무조건 20만원)
시간수당:  초과근무시간당 3만원 (10시간이상은 무조건 30만으로 통일)
=============================================================================
사원명	급여       가족수     초과근무시간      가족수당    초과근무수당   총급여
=============================================================================
홍길동  1200000     5           12           200000    300000      1700000




===========================================
Sawon 클래스 (멤버클래스)


모든 멤버변수는 private
사원명: sname
급여:pay
가족수:familySu
초과근무시간: timeSu


전체: setter & getter


메서드3개
getFamilySudang()
getTimeSudang()
getTotalPay()




SawonMain 클래스


몇명의 사원인지 입력후 해당사원에대한 이름,급여,가족수,시간수를 입력받아서
출력할것!!!! */

public class Sawon {
//사원정보를 저장하고 계산하는 모델 클래스

	private String sname;
	private int pay;
	private int familySu;
	private int timeSu;
	//디폴트 생성자 숨어있음
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getFamilySu() {
		return familySu;
	}
	public void setFamilySu(int familySu) {
		this.familySu = familySu;
	}
	public int getTimeSu() {
		return timeSu;
	}
	public void setTimeSu(int timeSu) {
		this.timeSu = timeSu;
	}
	
	//가족수당계산 메서드
	public int 	getFamilySudang()
	{
		int fs=0;
		if(familySu>=4)
			fs=200000;
		else
			fs=familySu*50000;
		
		return fs;
	}
	
	//시간외수당계산 메서드
	public int getTimeSudang()
	{
		int ts=0;
		
		if(timeSu>=10)
			ts=300000;
		else
			ts=timeSu*30000;
		
		return ts;
	}

	
	//총급여계산 메서드
	public int getTotalPay()
	{
		int tp=pay+getFamilySudang()+getTimeSudang();
		
		return tp;
	}
	
    //제목출력 메서드 (정적메서드)
	//static → 객체를 생성하지 않고 클래스 이름으로 바로 호출 가능
	public static void getTitle()
	{
		System.out.println("****쌍용 직원 급여현황***");
		System.out.println();
		System.out.println("==========================================================");
		System.out.println("사원명\t급여\t가족수\t시간외근무\t가족수당\t시간외수당\t총급여");
		System.out.println("===========================================================");
	}
	
	
	
	
}
