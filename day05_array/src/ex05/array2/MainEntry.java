package ex05.array2;

public class MainEntry {
	public static void main(String[] args) {
		
		// 1.
		int[][] a = new int[2][3]; // 행크기, 열크기
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		// 2.
		int[][] a2 = new int[][] {{1, 2, 3},{4, 5, 6}}; // 초기화
		
		// 3.
		int[][] a3 = {{1, 2, 3},{4, 5, 6}}; // 초기화
		
		// 배열 값 출력
		System.out.println("a3[0][2] = " + a3[0][2]);
		System.out.println("a3[1][1] = " + a3[1][1]);
		System.out.println("/* --------------------------- */");
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a3[i][j] + " \n");
			}
		}
		System.out.println("/* --------------------------- */");
		
		System.out.println("행크기: " + a3.length); // 행크기
		System.out.println("열크기: " + a3[0].length); // 열크기
		System.out.println("열크기: " + a3[1].length); // 열크기
		
		for (int i = 0; i < a3.length; i++) {
			for (int j = 0; j < a3[i].length; j++) {
				System.out.print(a3[i][j] + " ");
			}
		}
		
		
		
		
	} // main
}
