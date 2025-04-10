package ex03.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println("1.---------------------");
		// 1. 각자의 클래스로 객체 생성한 형태
		new Circle().show("원");
		
		Rect r = new Rect();
		r.show("Rect");
		
		Triangle t = new Triangle();
		t.show("삼각형");
		
		System.out.println("2.---------------------");
		// 2. Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("Circle");
		
		sh = new Rect();
		sh.show("사각형");
		
		sh = new Triangle();
		sh.show("triangle");
		
		System.out.println("3.---------------------");
		// 3. 배열 이용
//		Shape ss = new Shape(); // *자체적으로 객체 생성 불가*
		Shape[] s = new Shape[3]; // 배열 선언 및 생성
		s[0] = new Circle();
		s[1] = new Rect();
		s[2] = new Triangle();
		
		String[] names = {"Circle", "Rect", "Triangle"};
		
		for (int i = 0; i < s.length; i++) {
			s[i].show(names[i]);
		}
		
		
		
	} // main
}
