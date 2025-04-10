package Quiz;

import java.util.Scanner;

public class Test0324 {
	public static void main(String[] args) {
		
//		과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int n = sc.nextInt();
//		int sum = 0;
//
//		for (int i = 1; i <= n; i++) {
//		    for (int j = 1; j <= i; j++) {
//		    	System.out.print(j + " ");
//		    	sum += j;
//		    }
//		}
//		System.out.println("결과: " + sum);

/* ---------------------------------------------------------------------------- */
//		과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?   5
//		for (int i = 1; i <= n; i++) {
//		    if (i % 2 == 0) {
//		        sum += i;
//		    } else {
//		        sum -= i;
//		    }
//		}
//		System.out.println(sum);
//		
		
//		과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 = ?  7.07		
//		double total = 0;
//		
//		for (int i = 1; i <= n; i++) {
//			total += (double)i / (i + 1);
//        }
//
//		total += (double)9 / 10;
//
//        System.out.printf("결과: %.2f\n", total);
		
        
//		12345
//		12345
//		12345
//		for (int i = 1; i < 4; i++) { // 몇줄
//			for (int j = 1; j < 6; j++) { // 몇개
//				System.out.print(j);
//			}
//			System.out.println();
//		}
        
//		****
//		****
//		****
//		****
//		for (int i = 1; i < 5; i++) {
//			for (int j = 1; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		*
//		**
//		***
//		****
//		for (int i = 1; i < 5; i++) { // 줄수
//			for (int j = 1; j <= i; j++) { // 별개수
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		   *
//		  **
//		 ***
//		**** 4-4=0
//		for (int i = 1; i <= 4; i++) { // 줄수
//			for (int j = 1; j <= 4-i; j++) { // 공백 (줄 수가 늘어날수록 공백은 줄어듦)
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) { // 별개수
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		****
//		***
//		**
//		*
//		for (int i = 1; i < 5; i++) {
//			for (int j = i ; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		****
//		 ***
//		  **
//		   *
//		for (int i = 4; i >= 1; i--) {
//			for (int j = 1; j <= 4-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
/* ---------------------------------------------------------------------------- */
//		과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 = ?  7.07
//		double total = 0;
//		
//		for (int i = 1; i <= n; i++) {
//			total += (double)i / (i + 1);
//        }
//
//		total += (double)9 / 10;
//
//        System.out.printf("결과: %.2f\n", total);
/* ---------------------------------------------------------------------------- */
//		문제] 사칙연산 프로그램 작성(예외처리하기)
//		숫자 2개 입력 받고, 연산자(+, -, *, /) 1개 입력 받아서
//			while (true) {
//
//			System.out.print("x, y, op = ");
//			int x = sc.nextInt();
//			if (x == 0)break;
//			int y = sc.nextInt();
//			String op = sc.next();
//
//			try {
//				switch (op) {
//				case "+":
//					System.out.println(x + op + y + " = " + (x + y));
//					break;
//				case "-":
//					System.out.println(x + op + y + " = " + (x - y));
//					break;
//				case "*":
//					System.out.println(x + op + y + " = " + (x * y));
//					break;
//				case "/":
//					if (y == 0) {
//						System.out.println("0으로 나눌 수 없습니다.");
//					} else {
//						System.out.println(x + op + y + " = " + (x / y));
//					}
//					break;
//				case "%":
//					if (y == 0) {
//						System.out.println("0으로 나눌 수 없습니다.");
//					} else {
//						System.out.println(x + op + y + " = " + (x % y));
//					}
//					break;
//				default:
//					System.out.println("올바른 연산자를 입력하세요 (+, -, *, /, %)");
//				}
//			} catch (Exception e) {
//				System.out.println("예외 발생");
//			}
//		}
		
//		sc.close();
//		System.out.println("프로그램 종료!");
		
        
        
	} // main
} // Test0324 class
