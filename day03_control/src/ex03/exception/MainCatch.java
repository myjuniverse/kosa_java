package ex03.exception;

import java.util.Scanner;

public class MainCatch {
	public static void main(String[] args) {
		
		System.out.println("x, y = ");
		int x, y, result;
		
		try {
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x / y; // 에러발생 상황
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
//			System.out.println("0으로 나눌수 없습니다."); // user message
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println("Exception");
		} 
		
			
		
		
	}
}
