package day1119;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectMyClub {

	DbConnect mydb=new DbConnect();
	Scanner sc =new Scanner(System.in);
	
	//insert 최소 5명입력후
	//회원가입하기 회원명 주소 직업 핸드폰
	//인서트 성공후 항상 developer가서 확인할것!!
	public void insertMyclub() {
		System.out.println("***회원가입하기***");
		System.out.println("회원명?");
		String name=sc.nextLine();
		System.out.println("주소?");
		String addr=sc.nextLine();
		System.out.println("직업?");
		String job=sc.nextLine();
		System.out.println("핸드폰?");
		String hp=sc.nextLine();
		
		String sql="insert into myclub values(seq4.nextval,'"+name+"','"+addr+"','"+job+"','"+hp+"',sysdate)";
		System.out.println(sql);
		Connection conn=mydb.getDbConnect();
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);  //sql문 실행
			
			System.out.println("MyClub_회원 가입 성공!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			mydb.dbClose(stmt, conn);
		}
	}
	
	//select
	public void selectMyclub() {
	
	String sql="select * from myclub order by cname";
		
		System.out.println("\t**전체 MyClub회원 명단**");
		System.out.println();
		System.out.println("회원번호\t회원명\t주소\t직업\t전화번호\t가입일");
		System.out.println("---------------------------------------------------");
		Connection conn=mydb.getDbConnect();
		Statement stmt=null;
		ResultSet rs=null;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getInt("cno")+"\t"+rs.getString("cname")+"\t"
						+rs.getString("caddr")+"\t"
						+rs.getString("cjob")+"\t"
						+rs.getString("chp")+"\t"
						+rs.getDate("gaipday"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			mydb.dbClose(rs, stmt, conn);
		}
	}
	
	//delete
	public void deleteMyclub() {
		System.out.println("삭제할 회원번호를 입력해주세요");
		int delNum=Integer.parseInt(sc.nextLine());
		String sql="delete from myclub where cno="+delNum;
		
		Connection conn=mydb.getDbConnect();
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
			//stmt.execute(sql); boolean 값
			
			int a =stmt.executeUpdate(sql); //int값.. 즉 시퀀스가 없으면 0을 반환
			
			if(a==0)
				System.out.println(delNum+"번 회원은 명단에 없습니다.");
			else 
				System.out.println(delNum+"번 회원은 삭제되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			mydb.dbClose(stmt, conn);
		}
	}
	
	//update
	public void updateMyclub() {
		System.out.println("***회원수정하기***");
		System.out.println("수정하려는 회원번호는?");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("수정하려는 회원명?");
		String name=sc.nextLine();
		System.out.println("수정하려는 주소?");
		String addr=sc.nextLine();
		System.out.println("수정하려는 직업?");
		String job=sc.nextLine();
		System.out.println("수정하려는 핸드폰?");
		String hp=sc.nextLine();
		String sql="update myclub set cname='"+name+"',caddr='"+addr+"',cjob='"+job+"',chp='"+hp+"'";
		
		System.out.println(sql);
		Connection conn=mydb.getDbConnect();
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
		int a =stmt.executeUpdate(sql); //int값.. 즉 시퀀스가 없으면 0을 반환
			
			if(a==0)
				System.out.println(num+"번 수정할 회원이 없습니다.");
			else 
				System.out.println(num+"번 회원은 수정됐다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// 반복문으로 1.회원가입 2.회원조회 3.회원삭제 4.회원정보수정 9.종료
		ConnectMyClub mc=new ConnectMyClub();
		
		while(true) {
			Scanner sc =new Scanner(System.in);
			System.out.println("my클럽 연습");
			 System.out.println(" 1.회원가입 2.회원조회 3.회원삭제 4.회원정보수정 9.종료");
			 int selectNum=Integer.parseInt(sc.nextLine());
			 if(selectNum==1)
				 mc.insertMyclub();
			 else if( selectNum==2)
				 mc.selectMyclub();
			 else if(selectNum==3)
				 mc.deleteMyclub();
			 else if(selectNum==4)
				 mc.updateMyclub();
			 else if (selectNum==9) {
				 System.out.println("종료!!!");
				 break;
			 }
				 
		}
	}

}
