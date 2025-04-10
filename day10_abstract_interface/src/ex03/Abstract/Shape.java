package ex03.Abstract;

public abstract class Shape { // Super class, abstract class
	
	protected double result = 0;
	
	public abstract double calc(double x);
	public abstract void show(String name);
	
	public void view() {
		System.out.println("Super class Shape");
	}
	
}
