package ex03.exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("x, y = ");
		int x = 0, y = 0, result;
			
		result = x / y; // 에러발생 상황
		System.out.println(result);
		
		if (y == 0) {
			System.out.println("0으로 나눌수 없습니다.");
			System.exit(0); //
		}
		
		
		
		
		
	}
}
