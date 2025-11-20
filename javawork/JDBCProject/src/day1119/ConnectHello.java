package day1119;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectHello {
	
	DbConnect db=new DbConnect();
	
	//insert
	public void insertHello() {
		Scanner sc= new Scanner(System.in);
		
		//hello 테이블에 입력할 데이터..
		System.out.println("당신의 이름은?");
		String name=sc.nextLine();
		//나이는 string  int 상관없다
		System.out.println("당신은 나이는?");
		int age= Integer.parseInt(sc.nextLine());
	
		//입력된 이름과 나이가 sql문의 변수로 들어가야 하므로 입력아래에 이어야 한다!!
		//insert into hello VALUES(seq4.nextval, '홍길동', 33, sysdate);
		String sql="insert into hello VALUES(seq4.nextval, '"+name+"', "+age+", sysdate)";
		System.out.println(sql);
		
		//db연결
		Connection conn=db.getDbConnect();
		
		//statement
		Statement stmt =null;
		try {
			stmt=conn.createStatement();
			stmt.execute(sql);
			System.out.println("**db에 추가 성공!!!!!!!!!!!**");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(stmt, conn);
		}
		
	}
	
	//select
	public void selectHello()
	{
		System.out.println("시퀀스\t회원명\t나이\t등록일");
		System.out.println("=========================================");
		
		String sql="select * from hello order by num"; //시퀀스의 오름차순
		
		Connection conn=db.getDbConnect();
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);  //executeQuery메서드 이용해서 결과는 Resultset으로 얻는다
			
			//2개이상일땐 while
			while(rs.next())
			{
				System.out.println(rs.getInt("num")+"\t"
			                      +rs.getString("name")+"\t"
			                      +rs.getInt("age")+"\t"
			                      +rs.getDate("writeday"));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
		
	} 
	
	//delete
	public void deleteHello()
	{
		//삭제할 번호 입력후 그번호를 변수로 받아서 삭제
		Scanner sc=new Scanner(System.in);
		System.out.println("삭제할 번호를 입력하세요");
		int delnum=Integer.parseInt(sc.nextLine());
		
		String sql="delete from hello where num="+delnum;
		
		//db연결
		Connection conn=db.getDbConnect();
		
		//sql문 전달
	    Statement stmt=null;
	    
	    try {
			stmt=conn.createStatement();
			//stmt.execute(sql);
			int a=stmt.executeUpdate(sql);  //성공한 레코드의 갯수 반환
			
			if(a==0)
				System.out.println("***없는 데이타 번호입니다***");
			else  //삭제되면 1이 반환
			    System.out.println("***삭제되었습니다***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}finally {
			db.dbClose(stmt, conn);
		}
		
	}
	
	//1.수정_수정하려는 하나의 데이터 조회
	//num을 인자로 받아 데이타가 있으면 true,데이타가 없으면 false를 반환해주는 메서드
	public boolean isOneData(int num)
	{
		boolean flag=false;
		
		String sql="select * from hello where num="+num;
		
		Connection conn=db.getDbConnect();
		Statement stmt=null;
		ResultSet rs=null;
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			//데이타가 1개 if
			if(rs.next())
				flag=true;
			else
				flag=false;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, stmt, conn);
		}
		
		return flag;
	}
	
	//2.수정_update
	public void updateHello()
	{
		//시퀀스를 입력하여 해당 시퀀스의 이름과 나이를 수정한다
		Scanner sc=new Scanner(System.in);
		
		System.out.println("수정할 번호를 입력하세요");
		int updateNum=Integer.parseInt(sc.nextLine());
		
		//위의 boolean을 반환하는 메서드를 만든후 수정하려는 번호가 존재하는지 미리 체크해본다
		if(!isOneData(updateNum))
		{
			System.out.println("해당번호는 존재하지 않습니다");
			return; //메서드 종료
		}
		
		System.out.println("수정할 이름을 입력하세요");
		String updateName=sc.nextLine();
		System.out.println("수정할 나이를 입력하세요");
		int updateAge=Integer.parseInt(sc.nextLine());
		
		//update hello set name='김흥민',age=42 where num=2;
		String sql="update hello set name='"+updateName+"',age="+updateAge+" where num="+updateNum;
		System.out.println(sql);
		
		//db연결
		Connection conn=db.getDbConnect();
		//sql문
		Statement stmt=null;
		
		try {
			stmt=conn.createStatement();
			int a=stmt.executeUpdate(sql);
			if(a==0)
				System.out.println("수정할 데이타가 존재하지 않음");
			else
				System.out.println("***수정됨***");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(stmt, conn);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConnectHello hello=new ConnectHello();
		
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("1. insert 2.select 3.delete 4.update 9.exit");
			System.out.println("-======================================");
			n=Integer.parseInt(sc.nextLine());
			
			if(n==1) 
				hello.insertHello();
			else if(n==2) {
				hello.selectHello();
			}
			else if(n==3) {
				hello.deleteHello();
			}
			else if(n==4) {
				hello.updateHello();
			}
			else if (n==9) {
				System.out.println("프로그램 종료!!!");
				break;
			}
		}
		
		
	}

}
