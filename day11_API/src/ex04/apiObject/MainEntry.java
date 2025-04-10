package ex04.apiObject;

class Point {
	
}


public class MainEntry {
	public static void main(String[] args) {
//		Point pt = new Point();
//		System.out.println("Point pt info");
//		System.out.println("class name: " + pt.getClass());
//		System.out.println("hash code(16진수): " + pt);
//		System.out.println("hash code(10진수): " + pt.hashCode());
//		System.out.println("Object String: " + pt);
//		System.out.println("Object String: " + pt.toString());
//		System.out.printf("10진수 주소: %d\n", 0x63961c42);
		
		System.out.println("-----------------------");
		Point pt2 = new Point();
		System.out.println("Point pt2 info");
		System.out.println("class name: " + pt2.getClass());
		System.out.println("hash code(10진수): " + pt2.hashCode());
		System.out.println("Object String: " + pt2.toString());
		System.out.printf("10진수 주소: %d\n", 0x63961c42);
		
		System.out.println("-----------------------");
		System.out.println("pt2.toString(): toString()의 의미 ");
		System.out.println(pt2.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));
		
		System.out.println("-----------------------");
		Point pt3 = new Point();
		if (pt2.hashCode() == pt3.hashCode()) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		Point pt4;
		pt4 = pt2;
		
		if (pt2.hashCode() == pt4.hashCode()) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		
		
		
	} // main end
}
