package ex01.Abstract;

abstract class Shape { // abstract class, Super class
	double result = 0;
	
	public abstract double calc(); // abstract method
	public abstract void drow();
	
	public void show() {
		System.out.println("Super class Shape call");
	}
	
} // Shape end


class Circle extends Shape {

	double r= 5.0;
	
	@Override
	public double calc() { // Sub class
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void drow() {
		calc();
		System.out.println("원의 넓이: " + result + " 인 원을 그렸습니다.");
		
	}
	
} // Circle end

class Rectangle extends Shape {
	
	int w = 4;
	int h = 5;

	@Override
	public double calc() {
		result = w * h;
		return result;
	}

	@Override
	public void drow() {
		calc();
		System.out.println("사각형의 넓이: " + result + "인 사각형을 그렸습니다.");
	}
	
} // Rectangle end

public class MainEntry {
	public static void main(String[] args) {
		
//		Shape sh = new Shape(); // 자체적으로 객체 생성할 수 없음
//		Shape sh = new Circle(); // 상속 받은 자손 클래스로는 객체 생성 가능
		
		Circle c = new Circle();
		c.drow();
		
		Rectangle r = new Rectangle();
		r.drow();
		
		Shape sh = new Circle();
		sh.drow();
		
		sh = new Rectangle();
		sh.drow();
		
		
	}
}
