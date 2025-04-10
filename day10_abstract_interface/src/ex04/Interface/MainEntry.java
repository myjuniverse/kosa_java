package ex04.Interface;

interface A { // interface - abstract method, final field만 갖는다.
	int x = 9;
	final int y = 77;
	char ch = 'A';
	
	// 추상메서드 abstract 생략가능함 - 무조건 추상메서드임
	public void show();
	public abstract void disp();
//	public void view() { } // error
	
} // A end

interface B {
	void view();
} // B end

interface C {
	String name = "good";
	public void draw();
} // C end

interface D extends B {
	void dview();
} // D end

/**  */

class Rect implements D {

	@Override
	public void view() { // B
	}

	@Override
	public void dview() { // D
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
} // Rect end

/**  */

class Shape {

} // Shape end

class Circle implements C {

	@Override
	public void draw() {
//		name ="jun"; 값 변경 불가
		System.out.println(name + "입니다.");
	}
	
} // Circle

/**  */
class Multi extends Shape implements B, C, A { // 해당하는 클래스 옆에는 클래스부터 상속하고 인터페이스 implements

	@Override
	public void show() { // A
		System.out.println("show method call");
	}

	@Override
	public void disp() { // A
		System.out.println("disp method call");
	}

	@Override
	public void draw() { // C
		System.out.println("draw method call");
	}

	@Override
	public void view() { // B
		System.out.println("view method call");
	}
	
} // Multi end


public class MainEntry {
	public static void main(String[] args) {
		
//		A a = new A(); interface는 클래스 아님 - 객체 생성 안됨
		Multi m = new Multi();
		m.show();
		m.disp();

		System.out.println("----");
		B b = new Multi();
		b.view();
		
	}
}
