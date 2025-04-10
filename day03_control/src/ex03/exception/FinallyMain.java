package ex03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyMain {
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
		} catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.err.println("finally 무조건 처리됨");
		}
		
	}
}
