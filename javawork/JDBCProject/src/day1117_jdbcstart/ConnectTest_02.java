package day1117_jdbcstart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTest_02 {

	//url
	static final String ORACLE_URL="jdbc:oracle:thin:@localhost:1521:XE";
	public void getConnectFoodShop()
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from foodshop order by foodname";
		
		try {
			conn=DriverManager.getConnection(ORACLE_URL, "test", "a1234");
			
			System.out.println("오라클 test계정 연결성공!!!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("***FoodShop 테이블 출력***");
			System.out.println("음식번호\t음식명\t음식가격\t매장명\t매장위치");
			System.out.println("----------------------------------------------------");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("fno")+"\t"
						+rs.getString("foodname")+"\t"
						+rs.getInt("foodprice")+"\t"
						+rs.getString("shopname")+"\t"
						+rs.getString("shoploc"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
	
	
	//Q.성별 인원수와 평균나이
	//성별   인원수   평균나이
	//여자    6       33세
	//남자    4       26세
	
	public void getConnectPerson()
	{
		String sql="select gender,count(*) count ,avg(age) avgage  from person group by gender";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		//오라클연결
		try {
			conn=DriverManager.getConnection(ORACLE_URL, "test", "a1234");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("성별\t인원수\t평균나이");
			System.out.println("-----------------------------------");
			while(rs.next())
			{
				String gender=rs.getString("gender");
				int count=rs.getInt("count");
				int avgAge=rs.getInt("avgage");
				
				System.out.println(gender+"\t"+count+"명\t"+avgAge+"세");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
	
	//angel계정의 교수테이블
	//직급별 최고급여  최소급여_ 급여는 화폐단위와 천단위구분기호 붙힐것~~~
	public void getConnectProfessor()
	{
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ConnectTest_02 test2=new ConnectTest_02();
        //test2.getConnectFoodShop();
        //test2.getConnectPerson();
	}

}
