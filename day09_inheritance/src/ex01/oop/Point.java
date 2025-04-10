package ex01.oop;

public class Point {
	private int x, y;
	
	public Point() {
		this(100, 200); // 첫줄에 위치해야함 괄호는 생성자 함수일 뿐
						// this는 자기자신
//		this.x = x;
//		this.y = y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
