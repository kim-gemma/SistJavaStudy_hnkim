package day1031;

public class Ex2Emp {
	String empName;
	int salary;
	
	
	//셍상자
	public Ex2Emp(String name, int sal) {
		this.empName=name;
		this.salary=sal;
	}
	
	//출력메서드
	public String getEmp() {
		String s= empName+","+salary; //쉼표로 이어붙여 하나의 문자열로 만드는 코드
		return s;
	}
	
	//public String getEmp(); // 추상메서드
}
