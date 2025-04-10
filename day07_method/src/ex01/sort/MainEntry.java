package ex01.sort;

import java.util.Arrays;

public class MainEntry {
	public static void main(String[] args) {
		
		int[] a = {4, 2, 6, 8, 3};
		System.out.print("sort 전 출력: ");
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		Arrays.sort(a); // 정렬 알고리즘이 이미 내부적으로 처리 되어 있는 메서드
		
		System.out.print("\n\n오름차순 - sort 후 출력: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\n\n내림차순 - sort 후 출력: ");
		for(int i = a.length - 1; i >= 0 ; i--) {
			System.out.print(a[i] + " ");
		}
		
		
		
		
	} // main
}
