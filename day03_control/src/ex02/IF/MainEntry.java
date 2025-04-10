package ex02.IF;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 객체생성, 메모리할당, 생성자함수 자동호출
		
		System.out.print("input data : ");
//		int num = sc.nextInt();
		int num = new Scanner(System.in).nextInt();
		
//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
		
//		String str = (num % 2 == 0) ? "짝수" : "홀수";
//		System.out.println(str);
		
		if(num > 0) {
			System.out.println("양수");
		} else if(num > 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
	}
}
