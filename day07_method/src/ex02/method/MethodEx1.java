package ex02.method;

import java.util.Scanner;

public class MethodEx1 {
	
	
	// 3. 매개변수 X, 리턴타입 O
	public static int show() {
		return 100;
	}
	
	public static int max() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int max = (x > y) ? x : y;
		return max;
//		if (x > y) return x;
//		else return y;
	}
	
	public static void name() {
		System.out.println("Jun");
	}

	public static void main(String[] args) {

		System.out.println(show()); // 출력의 책임이 호출한 쪽에 있음
		int su = show();
		System.out.println(su);
		
		name();
		
	} // main
}
