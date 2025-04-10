package ex02.Abstract;

public class Triangle extends Shape {

	int w = 8;
	int h = 6;

	@Override
	public double calc() {
		result = w * h * 0.5;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이: " + result + "인 삼각형을 그렸습니다.");
	}

}
