package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftVO;

// controller
public class GiftController {
	// 연결, CRUD 
	static Scanner sc = new Scanner(System.in);
	static Connection conn = null;
	static Statement st = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	// connect
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			st = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄기
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} // connect()
	
	// close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(st);
			CloseHelper.close(ps);
			CloseHelper.close(conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// menu
	public static void menu() throws SQLException {
		GiftVO vo = new GiftVO();
		
		while (true) {
			System.out.println();
			ConnectionHelper.menu();
			
			switch (sc.nextInt()) {
			case 0: System.out.print("commit 하시겠습니까?(Y: commit / N: rollback) ");
					if (sc.next().equalsIgnoreCase("y")) {
						conn.commit();
						selectAll(vo.getClassName()); // "Gift"
					} else {
						conn.rollback();
						selectAll(vo.getClassName());
					}
					break;
			case 1: selectAll(vo.getClassName()); break;
			case 2: insert(); selectAll(vo.getClassName()); break;
			case 3: update(vo.getClassName()); break;
			case 4: delete(vo.getClassName()); break; // 인자값 없는 상태로도 만들수 있음
			case 5: selectByGno(vo.getClassName()); break;
			case 6: close(); System.out.println("종료합니다."); System.exit(0); break;
			case 7: conn.commit(); System.out.println("성공적으로 완료되었습니다."); break;
			default:
			} // end switch
		} // end while
	} // menu()
	
	
	// rollback
	public static void rollback() {
		
	}
	
	// selectAll
	public static void selectAll(String className) throws SQLException {
//		rs = st.executeQuery("SELECT * FROM " + className);
//		ResultSetMetaData rsmd = rs.getMetaData(); // 해당 테이블에 대한 정보
//		int count = rsmd.getColumnCount();
//		
//		while (rs.next()) {
//			for (int i = 1; i <= count; i++) { // 각 타입별로 출력하기
//				switch (rsmd.getColumnType(i)) {
//				case Types.NUMERIC:
//				case Types.INTEGER:
//					System.out.println(rsmd.getColumnName(i) + ":" + rs.getInt(i) + " ");
//					break;
//				case Types.FLOAT:
//					System.out.println(rsmd.getColumnName(i) + ":" + rs.getFloat(i) + " ");
//					break;
//				case Types.DOUBLE:
//					System.out.println(rsmd.getColumnName(i) + ":" + rs.getDouble(i) + " ");
//					break;
//				case Types.CHAR:
//					System.out.println(rsmd.getColumnName(i) + ":" + rs.getString(i) + " ");
//					break;
//				case Types.DATE:
//					System.out.println(rsmd.getColumnName(i) + ":" + rs.getDate(i) + " ");
//					break;
//				default:
//					System.out.println(rsmd.getColumnName(i) + ":" + rs.getString(i) + " ");
//					break;
//				} // switch
//			} // for
//			System.out.println();
//		} // while
		
		rs = st.executeQuery("SELECT * FROM " + className);
		System.out.println("상품번호  상품명\t\t최저가\t최고가");

		while (rs.next()) {
			int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_start = rs.getInt("g_start");
			int g_end = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t\t" + g_start + "\t" + g_end);
		}
	}
	
	// insert
	public static void insert() throws SQLException {
		String sql = "INSERT INTO GIFT VALUES(?, ?, ?, ?)";
		ps = conn.prepareStatement(sql);
		
		System.out.print("상품번호: ");
		ps.setInt(1, sc.nextInt());
		
		System.out.print("상품명: ");
		ps.setString(2, sc.next());
		
		System.out.print("최저가: ");
		ps.setInt(3, sc.nextInt());
		
		System.out.print("최고가: ");
		ps.setInt(4, sc.nextInt());
		
		ps.executeUpdate();
		System.out.println("추가 완료되었습니다.");
	}
	
	// update
	public static void update(String className) throws SQLException {
		selectAll(className);
		
		
		String sql = "UPDATE " + className + " SET gno = ?, gname = ?, g_start = ?, g_end = ? WHERE gno = ?";
		ps = conn.prepareStatement(sql);
		
		System.out.print("수정할 상품번호: ");
		ps.setInt(5, sc.nextInt());
		
		System.out.print("상품번호: ");
		ps.setInt(1, sc.nextInt());
		
		System.out.print("상품명: ");
		ps.setString(2, sc.next());
		
		System.out.print("최저가: ");
		ps.setInt(3, sc.nextInt());
		
		System.out.print("최고가: ");
		ps.setInt(4, sc.nextInt());
		
		ps.executeUpdate();
		System.out.println("수정 완료되었습니다.");
	}
	
	// delete
	public static void delete(String className) throws SQLException {
		selectAll(className);
		
		String sql = "DELETE " + className + " WHERE gno = ?";
		ps = conn.prepareStatement(sql);
		
		System.out.print("삭제할 상품번호: ");
		ps.setInt(1, sc.nextInt());
		
		ps.executeUpdate();
		System.out.println("삭제되었습니다.");
	}
	
	// select ~ where
	public static void selectByGno(String className) throws SQLException {

		System.out.print("검색할 상품번호: ");
		String sql = "SELECT * FROM " + className + " WHERE gno = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, sc.nextInt());
		
		rs = ps.executeQuery();
		
		System.out.println("상품번호  상품명\t\t최저가\t최고가");

		while (rs.next()) {
			int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_start = rs.getInt("g_start");
			int g_end = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t\t" + g_start + "\t" + g_end);
		}
		
	}
	
	// commit
	
	
	
}