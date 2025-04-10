package ex06.Inheritance;

import java.util.Scanner;

public class Triangle extends Shape {

	public Triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 값: ");
		this.w = sc.nextInt();
		
		System.out.print("높이 값: ");
		this.h = sc.nextInt();
		
	}
	
	@Override
	public double calc() {
		this.result = (w * h * 0.5);
		return result;
	}
	
	@Override
	public void show() {
		System.out.println("밑변: " + w + ", 높이: " + h + ", 삼각형 넓이: " + calc());
	}
	
	
}
