package day1031_1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingBasic extends JFrame{
	
	//변수
	Container cp;
	
	//버튼
	JButton btn1;
	
	//생성
	public SwingBasic(String title) {
		super(title);
		cp=this.getContentPane();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 닫기
		this.setBounds(200, 100, 500, 300);
		cp.setBackground(new Color(255,155,100));
		
		//버튼생성
		btn1=new JButton("버튼1");
		
		//프레임에 버튼 추가_BorderLayout이 기본
		this.add("North", btn1); //첫글자 반드시 대문자
		this.add("South", new JButton("아래쪽"));
		this.add("East", new JButton("오른쪽"));
		this.add("West", new JButton("왼쪽"));
		this.add("Center", new JButton("가운데"));
		
		//버튼1에 속성
		btn1.setBackground(Color.red);
		btn1.setForeground(Color.yellow);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingBasic("스윙연습_1");
		

	}

}
