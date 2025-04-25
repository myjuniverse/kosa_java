package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftInsert3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@127.0.0.1:1521:xe", 
				"msa", "oracle");
		
		// 3. 사용 (DML 명령어 - Insert) - PreparedStatement
		System.out.println("GIFT TABLE INPUT: 상품번호 / 상품명 / 최저가 / 최고가");
		
		String sql = "INSERT INTO GIFT VALUES(?, ?, ?, ?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, sc.nextInt());
		ps.setString(2, sc.next());
		ps.setInt(3, sc.nextInt());
		ps.setInt(4, sc.nextInt());
		
		int result = ps.executeUpdate(); // 반환값이 없는 경우 - insert, update, delete
		
		System.out.println(result + "개 데이터 추가 성공");
		
		// 4. 닫기 (자원 반환)
		ps.close();
		conn.close();
		
		
	}
}
