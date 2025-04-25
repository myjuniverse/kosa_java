package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "msa", "oracle");

		// 3. 사용 (DML 명령어 - Insert) - PreparedStatement
		System.out.println("GIFT TABLE UPDATE: 상품번호 / 상품명 / 최저가 / 최고가");

		String sql = "UPDATE GIFT SET GNO = ?, GNAME = ?, G_START = ?, G_END = ? WHERE GNO = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(5, sc.nextInt());
		ps.setInt(1, sc.nextInt());
		ps.setString(2, sc.next());
		ps.setInt(3, sc.nextInt());
		ps.setInt(4, sc.nextInt());

		int result = ps.executeUpdate(); // 반환값이 없는 경우 - insert, update, delete

		System.out.println(result + "개 데이터 수정 성공");

		// 4. 닫기 (자원 반환)
		ps.close();
		conn.close();
		
		
		
	}
}
