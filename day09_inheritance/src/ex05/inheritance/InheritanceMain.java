package ex05.inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.disp();
		System.out.println("--------------------");
		
		Circle c2 = new Circle(55);
		c2.disp();
		System.out.println("--------------------");
		
		Rectangle r = new Rectangle();
		r.disp();
		
		
		
	}
}
