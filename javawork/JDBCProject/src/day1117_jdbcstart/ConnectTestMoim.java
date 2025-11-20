package day1117_jdbcstart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectTestMoim {
	// url
	static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	// 조회
	public void getConnectMoim() {
		System.out.println("회원번효 회원명 회원주소 연락처 직업 가입일");
		System.out.println("----------------------------------------------------");

		String sql = "select * from moim order by name"; // 이름의 오름차순

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(ORACLE_URL, "test_1", "a1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.println(rs.getInt("no") + "\t" + rs.getString("name") + "\t" + rs.getString("addr") + "\t"
						+ rs.getString("hp") + "\t" + rs.getString("job") + "\t" + rs.getString("gaipday"));
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

	// 삭제
	public void getDeleteMoim() {
		//삭제할 번호 입력후 삭제
		Scanner sc= new Scanner(System.in);
		int no;
		System.out.println("삭제할 변호를 입력하시오");
		no=Integer.parseInt(sc.nextLine()); 
		// 숫자를 입력받을 때 nextLine()으로 문자열 전체를 읽고,
		// Integer.parseInt()로 정수로 변환한다.
		// → nextInt()를 쓰면 개행문자(\n)가 버퍼에 남아서 다음 입력에 문제가 생길 수 있으므로
		// 실무에서는 nextLine() + parseInt() 조합을 더 안정적으로 사용한다.
		String sql="delete from moim where no="+no;
		
		
		Connection conn=null;
		
		Statement stmt=null;
		// SQL 문장을 실행하기 위한 객체
		// ※ DELETE, UPDATE, INSERT 같은 DML은 ResultSet이 필요 없음
		
		//db연결
		try {
			conn=DriverManager.getConnection(ORACLE_URL, "test_1","a1234");
			//sql문 전달
			stmt=conn.createStatement();
			
			//서버에 업데이트
			//int 반환은 하나가 삭제가 됐다 0이면 삭제가 될게 없다  execute(sql)은 불린 반환 삭제가 되었다 안되었다
			//DELETE / UPDATE / INSERT = executeUpdate() 사용
			//반환값 int = 영향받은 행 수
			//0이면 삭제할 데이터가 없음
			//execute()는 SELECT 여부 판단용이므로 DML에는 안 씀
			//여긴 전부 자바 객체 3개가 늘 필요하나 SPRING 가면 안필요하고 
			//execute(sql); 이거 하면 롤백 안돼 서버에서 전체삭제됨
			stmt.execute(sql);
			System.out.println("선택한 회원 삭제됨");
//			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		// 조회 삭제를 선택해서 할수있게
		ConnectTestMoim moim = new ConnectTestMoim();
		Scanner sc = new Scanner(System.in);
		int n;

		while (true) {
			System.out.println("***oracle DB연습문제_test_1계정의 moim테이블***");
			System.out.println("1.조회    2.삭제   9.종료");
			n = Integer.parseInt(sc.nextLine());

			if (n == 1)
				moim.getConnectMoim();
			else if (n == 2)
				moim.getDeleteMoim();
			else if (n == 9) {
				System.out.println("프래그램 종료");
				break;
			}

		}
	}

}
