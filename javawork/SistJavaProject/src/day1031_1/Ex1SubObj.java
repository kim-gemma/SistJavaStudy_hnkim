package day1031_1;

import day1031.ExSuperObj;

public class Ex1SubObj extends ExSuperObj{

	private String addr;
	
	public Ex1SubObj(String name, int age, String addr) {
		super(name,age);
		this.addr=addr;
	}
	
	//메서드
	public void writeData() {
		System.out.println("이름: "+this.name);
		System.out.println("나이: " + this.age);
        System.out.println("주소: " + this.addr);
	}
}
