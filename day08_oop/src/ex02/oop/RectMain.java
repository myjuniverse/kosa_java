package ex02.oop;

import java.util.Scanner;

public class RectMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.print("x좌표: ");
		rect.setX(sc.nextInt());
		System.out.print("y좌표: ");
		rect.setY2(sc.nextInt());
		System.out.print("x2 좌표: ");
		rect.setX2(sc.nextInt());
		System.out.print("y2 좌표: ");
		rect.setY2(sc.nextInt());
		
		System.out.println(rect.toString());
		
	}
}
