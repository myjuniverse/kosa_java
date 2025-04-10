package ex01.scanner;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		System.out.print("x, y, str, str2 = ");
//		int x = new Scanner(System.in).nextInt();
//		int y = new Scanner(System.in).nextInt();

		String str = new Scanner(System.in).next(); // 공백 인식 불가
		String str2 = new Scanner(System.in).nextLine(); // 공백 인식 가능
		// 문자 먼저 입력
		
//		System.out.println(x + ", " + y + ", " + str);
		System.out.println(str + ", " + str2);
		
		
		
		
		
		
		
	}
}
