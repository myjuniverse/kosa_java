package ex05.inheritance;

public class Rectangle extends Point {
	int x2, y2;
	
	public Rectangle() {
		x2 = y2 = 100;
		System.out.println("Rectangle ---");
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void disp() {
		super.disp();
		System.out.println(", ..." + x2 + ", " + y2);
	}
	
}
