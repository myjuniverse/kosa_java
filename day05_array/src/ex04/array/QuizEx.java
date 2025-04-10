package ex04.array;

import java.util.Scanner;

public class QuizEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int[] arr = new int[5]; // new 라고 쓰는것들: Heap에 저장
//		
//		// 임의적인 데이터 입력 받아서 출력하는 프로그램
//		
//		System.out.print("입력: ");
//		
//		for (int i = 0; i < arr.length; i++) {
//			int num = sc.nextInt();
//			arr[i] = num;
//			System.out.print(arr[i] + " ");
//		}
		
		int[][] arr = new int[2][3]; // 객체생성 -> 메모리에 할당, 생성자함수 자동 호출
		System.out.println(arr.length); // 행의 길이
		System.out.println(arr[0].length); // 열의 길이
//		
//		 0  1행 2행 3행
//		1열  ㅁ  ㅁ  ㅁ
//		2열  ㅁ  ㅁ  ㅁ
		
		System.out.print("입력: ");
		
		for (int i = 0; i < arr.length; i++) { // 행 크기
			for (int j = 0; j < arr[i].length; j++) { // 열 크기
				arr[i][j] = sc.nextInt();
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	} // main
}
