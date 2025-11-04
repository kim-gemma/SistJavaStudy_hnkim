package day1104;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEvent extends JFrame implements ActionListener{
	
	Container cp;
	JButton btn1,btn2;
	
	 public SwingEvent(String title) {
		super(title);
		cp= this.getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 닫기
		this.setBounds(200, 100, 500, 300);
		cp.setBackground(new Color(255, 155, 100));
		
		//디자인 호출
		initDesign();
		
		this.setVisible(true);
	 }
	 
	 //디자인
	 public void initDesign(){
		 //기본디자인은 border레이아웃이므로 FlowLayout 으로 바꿀거면 레이아웃변경
		 this.setLayout(new FlowLayout());
		 //버튼생성
		 btn1=new JButton("배경색을 핫핑크로 변경");
		 btn2=new JButton("배경색을 회색으로 변경");
		 //프레임에 추가
		 this.add(btn1);
		 this.add(btn2);

		 //btn1,btn2 이벤트를 출예정 표시 해줘야됨
		 btn1.addActionListener(this);
		 btn2.addActionListener(this);
	 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEvent("스윙이벤트연습_#1");
	}

	//이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트가 발생한 객체(버튼)를 Object 타입으로 반환받게
		Object ob =e.getSource(); 
		if(ob==btn1) {
			//배경색 핫핑크
			cp.setBackground(Color.magenta);
		}
		else if (ob==btn2) {
			cp.setBackground(Color.gray);
		}
	}

}
