package ex01.instance_static;

class Aclass {
	int x, y;
	
	 // static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + " " + yy);
	}
	public static void Str(String...x) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
	}
	
} // Aclass

public class StaticClass {
	public static void main(String[] args) {
		Aclass a = new Aclass(); // 객체생성, 메모리에 할당, 생성자 함수 자동호출
		
		a.setData(20, 30); // object.methodName();
		Aclass.setData(100, 500); // ClassName.methodName();
		
		a.x = 99;
		Aclass.setData(3, 4);
		
		a.Str("Hello", "World");
		
	}
}
/*
	static method: 객체 생성 없이 바로 사용 가능함

	ex) Math.random()
	호출방법 > 클래스명.메서드명();
			객체명.메서드명();
 */