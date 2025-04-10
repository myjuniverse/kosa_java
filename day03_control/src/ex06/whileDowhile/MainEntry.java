package ex06.whileDowhile;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
//		int a = 1; // 반드시 변수 초기화
//		
//		while (a <= 3) {
//			System.out.print(a + "\t");
//			a++; 
//		}
		
//		int cnt = 0;
//		do {
//			System.out.println(cnt);
//			cnt++;
//		} while (cnt < 10);
//		System.out.println("Done.");
		
		
		// 구구단 출력
//		System.out.print("단 입력 : ");
//		int dan = new Scanner(System.in).nextInt();
//		int i = 1;
//		do {
//			System.out.println(dan + "*" + i + "=" + dan*i);
//			i++;
//		} while(i < 10);
		
		int dan = 1;
		int i = 1;
		do {
			// 안쪽
			do {
				System.out.println(dan + "*" + i + "=" + dan*i);
				i++;
			} while(i < 10);
			dan++; // ?
			i = 1;
			System.out.println();
		} while (dan < 10);
			
		
		
		
		
		
		
		
		
		
		
	}
}
