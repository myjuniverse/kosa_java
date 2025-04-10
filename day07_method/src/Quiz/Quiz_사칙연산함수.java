package Quiz;

import java.util.Scanner;

public class Quiz_사칙연산함수 {
	public static void main(String[] args) {
		// x, y 입력받아서 add(), sub() --> 일반, mul(), div() --> 리턴 만들기 + - * /
		Scanner sc= new Scanner(System.in);
		int x, y;
		char op = ' ';
		
		while(true) {
			System.out.print("x = ");
			x = sc.nextInt();
			System.out.print("y = ");
			y = sc.nextInt();
			System.out.print("연산자를 선택하세요 [+, -, *, /, 0(종료)]: ");
			op = sc.next().charAt(0);
			
			switch(op) {
				case '+': add(x, y); break;
				case '-': sub(x, y); break;
				case '*': System.out.println(mul(x, y)); break;
				case '/': 		
					if (y == 0) {
						System.out.print("0으로 나눌수 없습니다."); System.exit(0);
					} else div(x, y);
					System.out.println(div(x, y)); break;
				case '0': System.out.print("종료합니다.");
							System.exit(0);
				default: System.out.println("다시 선택해주세요.");
			}
		}
		
		
	} // main
	
	public static void add(int x, int y) {
		int add = x + y;
		System.out.println(add);
	}
	
	public static void sub(int x, int y) {
		int sub = x - y;
		System.out.println(sub);
	}
	
	public static int mul(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
//		if( y == 0 ) System.out.print("0으로 나눌수 없습니다."); System.exit(0);
		return (x / y);
	}

}
