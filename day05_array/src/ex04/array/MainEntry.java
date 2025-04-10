package ex04.array;

public class MainEntry {
	public static void main(String[] args) {
		
		// 1. 
		char[] ch; // 배열 선언
		ch = new char[4]; // 배열생성, 메모리에 할당
		
		// 2.
		char[] ch2 = new char[5]; // 배열선언 및 생성
		
		// 배열 초기화
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		// 3.
//		char[] ch3 = {'j', 'a', 'v', 'a', 's', 'q', 'l'};
		char[] ch3 = new char [] {'j', 'a', 'v', 'a', 's', 'q', 'l'};
		
		// 배열의 길이(크기)
		System.out.println("배열의 길이: " + ch.length); // 4
		System.out.println("배열의 길이: " + ch2.length); // 5
		System.out.println("배열의 길이: " + ch3.length); // 7
		
		System.out.println();
		
		// 배열의 내용
//		System.out.println(ch[2]);
		for (int i = 0; i < ch3.length; i++) {
			System.out.print(ch3[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
	} // main
}
