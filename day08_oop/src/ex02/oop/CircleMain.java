package ex02.oop;

import java.util.Scanner;

class Circle {
	int x, y, r;
	
//	public Circle() { // 생성자함수 - 디폴트 생성자함수
//		x = y = 100;
//		r = 5;
//	}
	
	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public int getX() {
		return x; 
	}

	public void setX(int xx) {
		x = xx;
	}
	public int getY() {
		return y; 
	}

	public void setY(int yy) {
		y = yy;
	}
	public int getR() {
		return r; 
	}

	public void setR(int rr) {
		r = rr;
	}
	
	public void display() {
		System.out.println("좌표 = (" + getX() + ", "+ getY() + ")" 
										+ "\nr = " + getR() + "\ncircle = " + 2*getR()*3.14);
	}
	
}


public class CircleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Circle ci = new Circle(2);
		Circle ci = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
//		System.out.print("x좌표: ");
//		ci.setX(sc.nextInt());
//		System.out.print("y좌표: ");
//		ci.setY(sc.nextInt());
//		System.out.print("반지름: ");
//		ci.setR(sc.nextInt());
		
		ci.display();
		
	}
	
}