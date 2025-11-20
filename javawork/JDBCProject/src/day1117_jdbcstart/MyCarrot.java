package day1117_jdbcstart;

import java.nio.file.spi.FileSystemProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyCarrot {
	
	// url
	static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	//조회
	public void getSelectMyCarrot() {
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs= null;
		
		String sql="select * from mycarrot";
		
		try {
			conn=DriverManager.getConnection(ORACLE_URL,"test_1","a1234");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("**당근리스트**");
			System.out.println("번호\t상품번호\t상품가격\t매너점수\t주소");
			System.out.println("-----------------------------------------------");
			
			while(rs.next()) {
			    System.out.println(
			        rs.getInt("cnum") + "\t"
			        + rs.getString("csangpum") + "\t"
			        + rs.getInt("cprice") + "\t"
			        + rs.getInt("cscore") + "\t"
			        + rs.getString("caddr")
			    );
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
	
	public void getDeleteMyCarrot() {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("삭제할 변호를 입력하시오");
		num= Integer.parseInt(sc.nextLine()); 
		
		String sql="delete from mycarrot where cnum="+num;
		Connection conn=null;
		Statement stmt =null;
		try {
			conn=DriverManager.getConnection(ORACLE_URL,"test_1","a1234");
			stmt=conn.createStatement();
			stmt.execute(sql);
			System.out.println("선택한 회원 삭제됨");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCarrot mt= new MyCarrot();
	
		
		Scanner sc= new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("***oracle DB연습문제_test_1계정의 mycarrot테이블***");
			System.out.println("1.조회    2.삭제   9.종료");
			n= Integer.parseInt(sc.nextLine());
			
			if(n==1) {
				mt.getSelectMyCarrot();
			}
			else if(n==2) {
				mt.getDeleteMyCarrot();
			}
			else if(n==9){
				System.out.println("프래그램 종료");
				break;
			}
			else {
				System.out.println("잘못입력했습니다");
			}
			
		}
	
	}

}
