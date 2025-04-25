package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * DB 연결 정보 반복적인 코딩을 해결
 * 다른 클래스에서 아래 코드 구현을 하지 않도록 설계
 * 
 * 이런식으로 사용
 * ConnectionHelper.getConnection("mysql") or ("oracle")....
 * dsn -> data source name
 */
public class ConnectionHelper {
	// method(접근자: public, static)
	public static Connection getConnection(String dsn) {
		
		Connection conn = null;
		
		try {
			if (dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/kosaDB", "msa", "mysql");
			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "msa", "oracle");
//				System.out.println("oracle connection sucess");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		
		Connection conn = null;
		
		try {
			if (dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/kosaDB", userid, pwd);
			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", userid, pwd);
//				System.out.println("oracle connection 22 sucess");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void menu() {
		System.out.println("\n========= JDBC QUERY =========");
		
		System.out.println("\t0. rollback");
		System.out.println("\t1. 전체보기");
		System.out.println("\t2. 추가");
		System.out.println("\t3. 수정");
		System.out.println("\t4. 삭제");
		System.out.println("\t5. 조건 검색 (ex> gno)");
		System.out.println("\t6. 종료");
		System.out.println("\t7. commit");
		System.out.println("==============================");
		
		System.out.print("\t메뉴 선택: ");
		
	}
	
	

	
	
}