package day1119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	String driver="oracle.jdbc.driver.OracleDriver";
	static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	
	

	public DbConnect() {
		try {
			Class.forName(driver);
			System.out.println("오라클 드라이버 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("오라클 드라이버 실패");
		    // 주의: 드라이버 로드 오류가 발생하면 → ojdbc11.jar(or ojdbc8.jar) 파일을
            //       프로젝트의 lib 폴더에 추가하고, Build Path에 등록해야 한다.
		}
	}
	

	//오라클 서버 연결 메서드(connection)
	public Connection getDbConnect() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(ORACLE_URL, "hyun","a1234");
			System.out.println("오라클 서버 연결"); //드라이버가 아니라 서버야!!
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오라클 서버연결 실패"+ e.getMessage());
		}
		
		return conn;
	}
	
	//close 메서드 만들기
	//오버로딩가능하다 인자값만 다르면 자바는
	public void dbClose(ResultSet rs, Statement stmt, Connection conn) {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dbClose( Statement stmt, Connection conn) {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dbClose( PreparedStatement pstmt, Connection conn) {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
