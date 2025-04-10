package ex02.oop;

class Point { // extends Object 상속 받고 있었음
	
	int x, y; // 멤버변수 - 접근지정자(제한자): private < default < protected < public 
	
	// 멤버함수
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
	
	public void setData(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public void display() {
//		System.out.println(x + ", " + y);
		System.out.println(getX() + " " + getY());
	}
	
	
} // Point class


public class MainEntry {
	public static void main(String[] args) { // main은 public이 들어간 클래스에서 생성해야함
		Point pt = new Point();
		
		
		
		pt.setX(100);
		pt.setY(200);		
		
		pt.display();
		
//		pt.setData(3, 2);
//		System.out.println(pt);
//		
//		pt.setX(55);
//		System.out.println(pt.getX());
		
//		System.out.println(pt.toString()); // 주소값 출력 pt = pt.toString
		
		
	
	} // main
	
}
