package ex02.oop;

public class Rectangle {
	int x;
	int y;
	int x2;
	int y2;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
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
	
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", x2=" + x2 + ", y2=" + y2 + "]";
	}
	
	

}
