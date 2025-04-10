package ex02.method;

public class MethodEx2 {

	// 4. 매개변수 O, 리턴타입 O
//	public static int num(int x) {
//		System.out.println("x = " + x);
//		return x;
//	}
	
//	public static String name(int x, String irum) {
//		return irum;
//	}
	
//	public static double value(int x, int y, double d) {
//		return x + y + d;
//	}
	
//	public static double value(double x, double y, double d) {
//		return x + y + d;
//	}
	
	public static String display(int x, String name) {
		for (int i = 0; i < x; i++) {
			System.out.print(x + " " + name + "\t");
		}
		return name;
	}
	
	public static void main(String[] args) {
		System.out.println(display(5, "&"));
		System.out.println(display(4, "*"));
		display(4, "*");
//		System.out.println(value(1, 2, 12.34));
//		System.out.println(num(23));
		
//		String str = name(20, "jun");
//		System.out.print(str);
		
	}
	

}
