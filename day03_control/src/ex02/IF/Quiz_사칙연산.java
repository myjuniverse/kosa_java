package ex02.IF;

import java.util.Scanner;

public class Quiz_사칙연산 {
	public static void main(String[] args) {
		
//		문제] 사칙연산 프로그램 작성(예외처리하기)
//		숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서

		Scanner sc = new Scanner(System.in);
		
		System.out.print("x, y, op = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		String strop = sc.next(); // string -> stack 영역에 주소만 저장 / next 객체에는 단일한 문자를 뽑아내는것이 없음
//		char op = strop.charAt(0); 
//		if (op == '+')
		
		try {
			if (strop.equals("+")) System.out.println(x + strop + y + "=" + (x + y));
			else if (strop.equals("-")) System.out.println(x + strop + y + "=" + (x - y));
			else if (strop.equals("*")) System.out.println(x + strop + y + "=" + (x * y));
			else if (strop.equals("/")) System.out.println(x + strop + y + "=" + (x / y));
			else if (strop.equals("%")) System.out.println(x + strop + y + "=" + (x % y));
		} catch (Exception e) { // ArithmeticException
            System.out.println("0으로 나눌 수 없습니다.");
        } 
		
		
		
		
	}
}
