package ex03.returnValue;

public class MainEntry {
	public static void main(String[] args) {
		// return; 제어권넘김
		
		int x = 5;
		System.out.println(x);
		x *= 100;
		
		if (x == 500) {
			return; // 제어권 넘김
		}
		
		System.out.println(x);
		System.out.println("-----");
		
		
		
		
		
	}
}
