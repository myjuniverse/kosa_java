package ex03.operator;

//최단산쉬관논삼대콤
//논
public class OperatorTest2 {
	public static void main(String[] args) {
		
		// 6. 논리연산자: AND(&, &&), OR(|, ||), XOR(^), not(!)
		// 2진논리 ==> 결과: 값, 10진논리 ==> 결과: TRUE/FALSE
		
//		int x = 4, y = 7;
//		
//		System.out.println(x & y);
//		System.out.println(x | y);
//		System.out.println(x ^ y);
		
		int x = 10, y = 20, z = 30;
		boolean flag = false;
		
		// && 연산은 둘다 참이어야 실행
		flag = (x < y) && (y < z);
		System.out.println(flag);
		
		flag = (x > y) && (y > z);
		System.out.println(flag);
		
		// || 연산은 하나만 참이어도 TRUE
		flag = (x > y) || (y > z);
		System.out.println(flag);
		
		flag = (x > y) || (y < z);
		System.out.println(flag);
		
		
		
		
	}
}
