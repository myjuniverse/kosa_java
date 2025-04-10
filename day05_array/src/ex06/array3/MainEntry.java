package ex06.array3;

import java.util.Random;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][][] arr = new int[2][3][4];
		
//		System.out.println(arr.length); // 면 크기
//		System.out.println(arr[0].length); // 행 크기
//		System.out.println(arr[0][0].length); // 열 크기
		
		// 임의적인 데이터 입력 받아서 출력하는 프로그램
		
		Random rand = new Random(); // 객체생성, 메모리에 할당, 생성자함수 자동호출
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					
					arr[i][j][k] = rand.nextInt(50) + 1;
					System.out.print(arr[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		
	} // main
}
