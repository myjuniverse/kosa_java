package ex07.foreach;

public class MainEntry {
	public static void main(String[] args) {

/*
 * 확장(개선된) for문
 * 		for (자료형 변수명 : 컬렉션명 or 배열명) {
 * 			반복구문;
 * 		}
 * 		------------------------------------
 *		for (초기값; 조건; 증감식) {
 *			반복구문;
 *		}
 */
		
		int[] arr = {1, 2, 4, 5, 78, 50};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//			if (i == 3) break;
//		}
		
//		인덱스 번호 내림차순출력
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
//		for (int item : arr) {
//			System.out.print(item + " ");
//		}
		
		
		
		
		
		
	} // main
}
