package ex04.apiObject;

class Rectangle {
	int x, y;
	
	public void disp() {
		System.out.println("x: " + x + " y: " + y);
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	public String toString() {
//		return "x: " + x + " y: " + y;
//	}
}

public class TostringMain {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
//		r.disp();
		System.out.println(r);
		
	}
}
