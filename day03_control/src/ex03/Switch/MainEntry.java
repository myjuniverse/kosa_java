package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
//		System.out.print("point = ? (1, 2, 3)");
//		int point = new Scanner(System.in).nextInt();
		
//		switch (point) {// long형을 제외한 정수형(byte, int, short), 문자형(char) / 실수형 X
//		case 1: // 값 - 숫자, '문자', "문자얄"
//			System.out.println("포인트 점수 1점입니다.");
//			break;
//		case 2: 
//			System.out.println("포인트 점수 2점입니다.");
//			break;
//		case 3: 
//			System.out.println("포인트 점수 3점입니다.");
//			break;
//		default: // 생략가능 하지만 에러처리 메세지 넣으면 좋음
//			System.out.println("없는 포인트 입니다.");
//		} // switch end
//		System.out.println("main end");
	
		System.out.println("도시를 선택하세요 (s, d, b, j)");
		String ch = new Scanner(System.in).next();
		
		switch (ch) {
		case "s": System.out.println("서울"); break;
		case "d": System.out.println("대구"); break;
		case "b": System.out.println("부산"); break;
		case "j": System.out.println("제주"); break;
		default: System.out.println("잘못 입력하셨습니다."); System.exit(0);
		}
		
		
		
		
	}
}