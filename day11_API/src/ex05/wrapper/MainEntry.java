package ex05.wrapper;

class Point { }

public class MainEntry {
	public static void main(String[] args) {
		Integer Ia = new Integer(10);
		Integer Ib = new Integer("10");
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		
		System.out.println(Ia);
		System.out.println(Ia.getClass().getName() + '@' + Integer.toHexString(Ia.hashCode())); // java.lang.Integer@a
		
		int x = 777;
		double y = 5.5;
		System.out.println(x + ", " + y); // 777, 5.5
		y = x; // 묵시적 형변환
		x = (int)y; // 명시적 형변환
		System.out.println(x + ", " + y); // 777, 777.0
		
		// Boxing vs UnBoxing
		int c = Ia; // jdk 4.x 이전에 사용하던 메서드
		int d = Ib; // jdk 5.x 이후부터 autoboxing/unboxing
		int num = Integer.parseInt(su);
		System.out.println(c + num); // 40
		System.out.println(c + d);
		System.out.println(Ia.MAX_VALUE);
		
		Double dd = 12.34;
		System.out.println(dd.MIN_VALUE);
		c = (int)dd.doubleValue();
		System.out.println("혛변환 c의 값? " + c);
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111" , 2);
		System.out.println(f);
		System.out.println(e + 20);
		
		int xx = 3; // stack memory
		Integer yy = new Integer(3); // Heap meemory
		xx = yy; // autoboxing/unboxing
		
		
		
		
		
		
		
	}
}

/*
	Weapper class: 기본 자료형에 대응되는 클래스형 자료형
	
	기본자료형: int float double char
	
	클래스형(레퍼런스 또는 참조형) 자료형 Integer Float Double Character
*/