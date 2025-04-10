package ex05.inheritance;
// private < default < protected < public
// private - 같은 클래스 안에 있어야 사용 가능
// default - 같은 패키지안에 있으면 사용 가능
// protected - 다른 패키지(ex03)에 있어도 사용 가능

class Point2 { // 부모클래스
	protected int x, y;
}

class Circle2 extends Point2 { // 자손클래스
	int r;
	
	public void disp() {
		System.out.println(x + ", " + "y" + ", " + r);
	}
}


public class MainEntry {
	public static void main(String[] args) {
		
		Circle2 c = new Circle2();
		
		
	}
}
