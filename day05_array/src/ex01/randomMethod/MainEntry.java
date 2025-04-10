package ex01.randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(Math.random()); // 난수 출력
		System.out.println((int)Math.random()); // 0 출력
		// Math.random() * n <= 0 ~ n-1 값 추출됨
		System.out.println(Math.random() * 5); // 0 ~ 5미만 값 출력
		System.out.println((Math.random() * 5) + 2); // 2 ~ 6미만 값 출력
		
		
		System.out.println();
		System.out.println((int)(Math.random() * 100) + 1); // 2 ~ 6미만 값 출력
		
		
		
	} // main
}
