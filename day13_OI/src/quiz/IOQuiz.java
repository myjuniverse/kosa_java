package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOQuiz {
	public static void main(String[] args) throws IOException {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("연산자 입력(+, - , *, /, %): ");
			String op = br.readLine();
			
			System.out.print("x 입력: ");
			int x = Integer.parseInt(br.readLine());
			System.out.print("y 입력: ");
			int y = Integer.parseInt(br.readLine());
		
		
			switch(op) {
			case "+": System.out.println(x + op + y + " = " + (x + y)); break;
			case "-": System.out.println(x + op + y + " = " + (x - y)); break;
			case "*": System.out.println(x + op + y + " = " + (x * y)); break;
			case "/": System.out.println(x + op + y + " = " + (x / y)); break;
			case "%": System.out.println(x + op + y + " = " + (x % y)); break;
			default: System.out.println("올바른 연산자를 입력해주세요"); break;
			}
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
			
		
	}
}