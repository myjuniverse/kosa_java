package ex03.Abstract;

public class Triangle extends Shape {
	int y = 20;
	
	@Override
	public double calc(double x) {
		result = (x * y) / 2;
		return result;
	}

	@Override
	public void show(String name) {
		calc(5.4);
		System.out.println(result + "크기의 " + name + "이 그려젔습니다.");

	}

}
