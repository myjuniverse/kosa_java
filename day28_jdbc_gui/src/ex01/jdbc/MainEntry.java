package ex01.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) {
		
		Connection conn = ConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;
				
		try {
			stmt = conn.createStatement();
			// SQL구문, HTML Tag는 Java/Jsp/Servlet 에서 문자열 취급한다.
//			String sql ="CREATE TABLE KOSADB (NAME VARCHAR2(20), AGE NUMBER)"; 
			StringBuffer sb = new StringBuffer();
//			sb.append("IF EXISTS TABLE DROP TAVLE KOSADB");
//			sb.append("CREATE TABLE KOSADB (NAME VARCHAR2(20), AGE NUMBER)");
			
//			stmt.executeUpdate(sql);
//			stmt.executeUpdate(sb.toString()); // 반환값이 없는 경우
			
			String sql = "INSERT INTO KOSADB VALUES('jun', 26)";
			int result = stmt.executeUpdate(sql);
			
			sql = "SELECT * FROM KOSADB";
			rs = stmt.executeQuery(sql);
			
			System.out.println(result + "개 추가");
			
			while (rs.next()) {
				System.out.println("name: " + rs.getString(1) + "\tage:" + rs.getString(2));
			}
			
//			sql = "DROP TABLE KOSADB";
//			result = stmt.executeUpdate(sql);
//			System.out.println("DROP TABLE" + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(conn);
		}
		
	}
}
