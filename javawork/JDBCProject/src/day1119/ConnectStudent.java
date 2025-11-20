package day1119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectStudent {

	static String ORACLE_URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public void connectStudent() {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select name, height, grade from student order by name asc";
		try {
			conn=DriverManager.getConnection(ORACLE_URL,"hnkim","a1234");
			System.out.println("오라클 서버 연결 성공");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("이름\t학년\t신장");
			System.out.println("-----------------------");
			
			while(rs.next()) { //true반환, 더이상데이터 없으면 false
				//db로부터 데이터 가지고와
				System.out.println(rs.getString("name")+"\t"+rs.getInt("grade")+"학년\t"+rs.getInt("height"));
				
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectStudent stu= new ConnectStudent();
		stu.connectStudent();
	}

}
