package ex07.breakContinue;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		
//		break
//		for (int i = 1; i < 10; i++) {
//			if (i == 7) break; // 가장 가까이 있는 구문 탈출
//			System.out.println("hello" + i);
//		}
		
//		continue
//		for (int i = 1; i < 10; i++) {
//			if (i == 7) continue; // 시작점으로 돌린다. for -> 증감식으로, while/do~while -> 조건식으로 이동한다.
//			System.out.println("hello" + i);
//		}
		
		
		for (int i = 0; i < 101; i ++) {
//			if (i % 2 == 0) continue; // 홀수 출력
			if (i % 2 != 0) continue; // 짝수 출력
			System.out.print(i + "\t");
		}
		
		
		
		
		
	} // main
} // MainEntry class
