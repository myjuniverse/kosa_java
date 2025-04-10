package ex05.For;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		// 1~100까지 출력하는 프로그램 작성
//		for (int i = 1; i < 101; i++) {
//			System.out.print(i + " ");
//			if (i % 10 == 0) {
//				System.out.println();
//			}
//		}
		
//		int sum = 0, count = 0;
//		// 1~100까지 3의 배수의 갯수, 합 구하는 프로그램 작성
//		for (int i = 1; i < 101; i++) {
//			if (i % 3 == 0) {
//				count++; // count += 1;
//				sum += i;
//				System.out.print(sum + count);
//				
//			}
//		}
		
		// 구구단 출력
		System.out.print("단 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num * i);
		}
		
		
		
	}
}
