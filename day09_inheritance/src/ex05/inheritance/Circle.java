package ex05.inheritance;

public class Circle extends Point {
	private int r;
	
	public Circle(int r) {
		super(5, 4); // 반드시 첫줄에 와야함
		this.r = r;
		System.out.println("매개변수 1개");
	}
	
	public Circle(int x, int y) {
		x = y = 999;
		System.out.println("매개변수 2개");
	}
	
	public Circle() {
		super(22);
		r = 5;
	}
	
	public void disp() {
		super.disp(); // Point
		System.out.println(", " + r);
	}
	
}
