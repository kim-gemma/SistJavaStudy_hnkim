package day1117_jdbcstart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTest_01 {

	//변수로 드라이버,url
	//static final String Driver="oracle.jdbc.driver.OracleDriver";굳이 안넣어도 됨 
	
	
	static final String ORACLE_URL="jdbc:oracle:thin:@localhost:1521:XE";
	//이 주소는 공식 1521 정해진것  오라클 디비에서 정해진것  오라클 풀버전이면 orcl 풀버전 아니라서 XE버전임 

	//드라이버 연결은 따로 안해주어도 가능하다
	/*public ConnectTest_01() {
		try {
			Class.forName(Driver);
			System.out.println("오라클 드라이버 연결성공!!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/

	//메서드..오라클과 자바를 연결(본인의 계정,비번도 작성)
	public void getConnectEmp()
	{
		//커넥션 3가지 객체로 자바와 오라클꼐정이어줌
		Connection conn=null; //메서드하나하나 마다 오라클과 자바 연결 매번! 전역으로 빼면 안되나 커넥션은 공유하면 안됨
		Statement stmt=null; 
		ResultSet rs=null;

		try {
			
			conn=DriverManager.getConnection(ORACLE_URL, "angel", "a1234"); //파일과 연결하려면 exception과정을 거쳐야함 빨간 밑줄
			// 이걸 커넥션 연결하는 메서드를 만들면 지역변수로 안써도 됨
			System.out.println("클라우드의 오라클 서버에 연결성공!!!");

			String sql="select empno,ename,job from emp order by ename"; //사원명 오름차순 정렬
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);


			System.out.println("***Emp 데이타 가져오기");
			System.out.println("사원번호\t사원명\t직무\t급여");
			System.out.println("-----------------------------------------------");

			//여러줄의 데이타를 읽어올경우는 while문으로 가져온다
			//rs.next():다음데이타 읽어오면서 true반환 ,더이상데이타가 없으면 false 반환
			while(rs.next())
			{
				//db로부터 데이타 가져오기
				int empno=rs.getInt("empno"); //열번호 가능 1
				String name=rs.getString("ename"); //테이블에서 ename을 읽어온다
				String job=rs.getString("job"); //열번호 3도 가능

				System.out.println(empno+"\t"+name+"\t"+job);
			}



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("클라우드의 오라클 연결실패!!!"+e.getMessage());
		}finally {
			//자원의 역순으로 반환
			try {
				//왜 반납을 해야하는가 파일도 버퍼리더 파일리더 닫은 것처럼 디비, 파일은 자바에서 중요한 자원으로 봄 자원 같은 내용이 반납 필수이다 수많은 자원을 열면 오류 보안 떄문에 닫는것
				//개발자로써 역순으로 자원을 반납하는거다 메모리 누수떄문에 
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	//test계정의 Sawon테이블 조회
	public void getConnectSawon()
	{
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from sawon order by num desc";//모든컬럼 num의 내림차순 조회
		
		try {
			conn=DriverManager.getConnection(ORACLE_URL, "test", "a1234");
			
			System.out.println("서버연결성공!!!");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			
			System.out.println("**사원 정보 출력**");
			System.out.println("=========================================");
			System.out.println("사원번호\t이름\t성별\t부서\t급여\t입사일자");
			System.out.println("=========================================");
			
			while(rs.next())
			{
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String buseo=rs.getString("buseo");
				int pay=rs.getInt("pay");
				//String ipsa=String.valueOf(rs.getDate("ipsa"));
				
				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay+"\t"+rs.getDate("ipsa"));
				
			}
					
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConnectTest_01 test1=new ConnectTest_01();
		//test1.getConnectEmp();
		test1.getConnectSawon();

	}
}
