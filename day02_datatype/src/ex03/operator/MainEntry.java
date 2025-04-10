package ex03.operator;

// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		
//		// 1. 최우선연산자: () : 괄호, [] : 배열, . : 도트
//		
//		System.out.println(3 + 4 * 5); // 23
//		System.out.println((3 + 4) * 5); // 35
//		
//		// 2. 단항연산자: 증감 ==> ++, -- .....
//		
//		int x = 10, y;
//		y = x++; // 후위연산: 대입먼저, 연산나중
//		y = ++x; // 전위연산: 연산먼저, 대입나중
//		
//		System.out.println("x = " + x + "\ny = " + y);
//		
//		// 2-1. 단항연산자: 부정 ==> ~ .....
//		int x = -10, y;
//		y = ~x; // 비트부정: -|원래값 + 1| ==> 출력 결과
//		
//		System.out.println("x = " + x + "\ny = " + y);
		
		// 3. 산술연산자: +, -, *, /, %, ^ .....
		int x = 10, y = 20;
		int gob = x*y;
		
		System.out.println("x * y = " + gob);
		System.out.println("\n--------------------------");
		
		// 정수 (+, -, *, /, %, ^ .....) 정수 = 정수
		System.out.println("7 / 3 = " + 7/3); // 몫
		System.out.println("7 % 3 = " + 7%3); // 나머지
		
		System.out.println("7 / 3 = " + 7/3); // 2
		System.out.println("7 / 3.0 = " + (7/3.0)); // 2.3333333333333335
		System.out.println("7. / 3.0 = " + (7./3.0)); // 2.3333333333333335
		
	}
}
