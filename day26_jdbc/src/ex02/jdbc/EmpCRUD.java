package ex02.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpCRUD {
	static Connection conn;
	static PreparedStatement ps;
	static ResultSet rs;
	
	public static void connection() {
		// 연결 메서드 
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
					"msa", "oracle");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			if (rs != null) rs.close();
//			if (ps != null) ps.close();
		}
		
		
	}
	
	// selectAll
	static void selectAll() throws SQLException {
		
		String sql = "SELECT * FROM EMP";
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		
		// 반환값이 있는 경우 executeQuery() - select
		System.out.println("사번\t이름\tjob\t\t매니저번호\t입사일\t\t급여\t커미션\t부서번호");
		
		while(rs.next()) {
			int empno = rs.getInt(1);
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int mgr = rs.getInt(4);
			Date hiredate = rs.getDate("hiredate");
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);
			
			System.out.println(empno + "\t" + ename + "\t" + job + "\t" + mgr + "\t"+
							hiredate + "\t" + sal + "\t" + comm + "\t" + deptno);
		} // end while
	} 
		
	
	// selectByNo() - empno
	static void selectByNo(Scanner sc) throws SQLException {
		System.out.print("\n사번을 입력하세요: ");
		String sql = "SELECT * FROM EMP WHERE EMPNO = ?";
		ps = conn.prepareStatement(sql);
		ps.setInt(1, sc.nextInt());
		
		rs = ps.executeQuery();
		
		// 반환값이 있는 경우 executeQuery() - select
		System.out.println("사번\t이름\tjob\t\t매니저번호\t입사일\t\t급여\t커미션\t부서번호");
		
		while(rs.next()) {
			int empno = rs.getInt(1);
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int mgr = rs.getInt(4);
			Date hiredate = rs.getDate("hiredate");
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);
			
			System.out.println(empno + "\t" + ename + "\t" + job + "\t" + mgr + "\t"+
							hiredate + "\t" + sal + "\t" + comm + "\t" + deptno);
		} // end while
	}

	// insert
	public static void insert() {
		
	}

	// update
	public static void update() {
		
	}

	// delete
	public static void delete() {
		
	} 
	
	
	
	
	
	
}
