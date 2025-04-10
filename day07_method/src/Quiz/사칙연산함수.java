package Quiz;

import java.util.Scanner;

public class 사칙연산함수 {
	public static void main(String[] args) {
		// x, y 입력받아서 add(), sub() --> 일반, mul(), div() --> 리턴 만들기 + - * /
		Scanner sc= new Scanner(System.in);
		int x, y;
		
		System.out.print("x = ");
		x = sc.nextInt();
		
		do {
			System.out.print("y = ");
			y = sc.nextInt();
		} while (y == 0);
		
		add(x, y);
		sub(x, y);
		mul(x, y);
		
		
		if (y == 0) {
			System.out.print("0으로 나눌수 없습니다.");
		}
		else div(x, y);
			System.out.println(div(x, y));
		
//		try {
//			div(x, y);
//			System.out.println(div(x, y));
//		} catch (Exception e) {
//			System.out.print("0으로 나눌수 없습니다.");
////			e.printStackTrace();
//		}
	} // main
	
	public static void add(int x, int y) {
		int add = x + y;
	}
	
	public static void sub(int x, int y) {
		int sub = x + y;
	}
	
	public static int mul(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
//		if( y == 0 ) System.out.print("0으로 나눌수 없습니다."); System.exit(0);
		return (x / y);
	}

}
