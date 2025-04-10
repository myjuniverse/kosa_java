package ex05.For;

public class MainEntry {
	public static void main(String[] args) {
	
//		for (int i = 1; i <= 3; i++) {
//			System.out.print(i + "\t");
//		}
		
//		int a = 1;
//		for (; a <= 5;) { // 초기값, 증감식 생략가능
//			System.out.print(a + "\t");
//			a++;
//		}
		
//		int a, b;
//		for (a = 1, b = 2; a <= 10; a++, b+=2) { // 초기값, 증감식 2개 이상 가능, 조건은 오직 1개
//			System.out.print(b + "\t");
//		}
		
		int a = 1, b = 2;
		for (; ;) { // 무한루프 - 탈출구문 (조건이 빠진 순간 무한루프)
			System.out.print(b + "\t");
			b++;
			if (b == 10) break;
		}
		
	
	
	}
}
