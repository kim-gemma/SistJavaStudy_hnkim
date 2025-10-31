package day1031;

public class Emp {

	private String name;
	private int pay;
	private int sudang;
	private static String empName; //회사명

	//setter(수정용_초기화)&getter(조회용)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getSudang() {
		return sudang;
	}

	public void setSudang(int sudang) {
		this.sudang = sudang;
	}

	public static String getEmpName() {
		return empName;
	}

	public static void setEmpName(String empName) {
		Emp.empName = empName;
	}
	
	//실수령액
	public int getNetPay()
	{
		// (pay + sudang)에 실수 연산(0.9)을 적용했으니, 형식을 맞추려면 double로 바꾸거나 0.9를 정수 계산에 맞게 조정해야 한다.
		int money=(int)((pay+sudang)*0.9);
		return money;
	}
	
	
}
