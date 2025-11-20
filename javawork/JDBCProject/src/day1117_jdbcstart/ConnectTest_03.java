package day1117_jdbcstart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectTest_03 {

	// 변수로 드라이버,url
	// static final String Driver="oracle.jdbc.driver.OracleDriver";
	static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	// 부서별 인원수와 평균급여 최고급여 최저급여(화폐단위,천단위)
	public void getGroupSawon() {
		Connection conn = null; // 오라클과 연결하는 통로
		Statement stmt = null; // sql 실행담당
		ResultSet rs = null; // SELECT 결과 저장 및 읽기
//		executeQuery(sql) 실행 → DB에서 결과 테이블을 가져옴
//		ResultSet rs 안에 저장
//		rs.next() 반복하면서
//		각 컬럼값을 꺼내서 출력

		String sql = "select buseo,count(buseo) count,to_char(avg(pay),'L999,999,999') avgpay"
				+ ",to_char(max(pay),'L999,999,999') maxpay, to_char(min(pay),'L999,999,999') minpay "
				+ "from sawon group by buseo";

		try {
			conn = DriverManager.getConnection(ORACLE_URL, "hnkim", "a1234"); // 오라클에 로그인
			System.out.println("오라클 계정연결성공!!");
			stmt = conn.createStatement(); // sql실행준비
			rs = stmt.executeQuery(sql); // SELECT 실행, 결과는 ResultSet rs에 저장됨

			System.out.println("**부서별 사원 리스트**");
			System.out.println("부서별\t인원수\t평균급여\t최고급여\t최저급여");
			System.out.println("-----------------------------------------------");

			while (rs.next()) { // SELECT 컬럼명대로 데이터를 꺼내는 것.
				String boseo = rs.getString("buseo");
				int count = rs.getInt("count");
				String avgpay = rs.getString("avgpay");
				String maxpay = rs.getString("maxpay");
				String minpay = rs.getString("minpay");

				System.out.println(boseo + "\t" + count + "명\t" + avgpay + "원\t" + maxpay + "원\t" + minpay + "원\t");
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

	// join
	public void getMyBeadal() {
		// 주문번호 주문자명 주문음식명 가격 음식정명 음식점 위치 배달자주소
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select o.onum, o.clientname, f.foodname, f.foodprice, " + "f.shopname, f.shaploc, o.clientaddr "
				+ "from orderapp o join foodshop f on o.fno = f.fno " + "order by o.onum asc";

		try {
			conn = DriverManager.getConnection(ORACLE_URL, "test_1", "a1234");
			System.out.println("계정연결!!!");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			System.out.println("**부서별 사원 리스트**");
			System.out.println("주문번호\t주문자명\t주문음식명\t가격\t음식점명\t음식점\t위치\t배달자주소");
			System.out.println("-----------------------------------------------");

			while (rs.next()) {
				int onum = rs.getInt("onum");
				String clientname = rs.getString("clientname");
				String foodname = rs.getString("foodname");
				int foodprice = rs.getInt("foodprice");
				String shopname = rs.getString("shopname");
				String shaploc = rs.getString("shaploc");
				String clientaddr = rs.getString("clientaddr");

				System.out.println(onum + "\t" + clientname + "\t" + foodname + "\t" + shopname + "\t" + shaploc + "\t"
						+ clientaddr);

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
		ConnectTest_03 ct = new ConnectTest_03();
//		ct.getGroupSawon();
		ct.getMyBeadal();

	}

}
