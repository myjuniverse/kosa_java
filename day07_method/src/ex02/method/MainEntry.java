package ex02.method;

public class MainEntry {
	
	// 1. 매개변수 X / 리턴타입 X
	
	public static void info() {
		System.out.println("Jun");
		System.out.println("010-1234-1234");
		System.out.println("Seoul");
	}
	
	public static void line() {
		System.out.println("-------------------------");
	}
	
	// 2. 매개변수 O, 리턴타입 X
	public static void plus(int x, int y, String msg) { // 함수 정의부(구현부)
	
		System.out.println("add = " + (x + y));
		int sum = x + y;
		System.out.println("sum = " + sum);
		System.out.println(msg);
	}
	
	// 
	public static void su(int x) { // 함수 정의부(구현부)
		
		if (x < 0) x = -x;
		System.out.println(x);
		
	}
	
	public static void main(String[] args) { // 시작점
		
		su(-5);
		su(10);
		su(0);
		
		plus(4, 5, "plus method"); // 함수 호출
		
		line();
		System.out.println("start");
		info();
		System.out.println("end");
		
		
	} // main
	
	
}
