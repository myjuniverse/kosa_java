package ex02.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("번호 입력(1. 전체출력 / 2. 검색 출력 / 3. ): ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1: EmpCRUD.selectAll(); break;
			case 2:	EmpCRUD.selectAll();
					EmpCRUD.selectByNo(sc); break;
			case 3:	EmpCRUD.insert(); break;
			case 4:	EmpCRUD.selectAll();
					EmpCRUD.update();
					break;
			case 5:	EmpCRUD.selectAll();
					EmpCRUD.delete();
					break;
			case 0: System.out.println("종료합니다."); System.exit(0);
			default:
			    System.out.println("잘못된 번호입니다.");
				
			}
			
		}
		
	}


}
