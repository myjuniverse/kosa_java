package ex01.sort;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		
/*
 * 기준이 있다.
 * 작은것이 앞으로 온다. 
 * 
 * 
 * 
 */
		int[] a = {7, 3, 5, 2, 8};
		int temp;
		
		System.out.print("sort 전 출력: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i] > a[j]) { // 교환 ->오름차순 / a[i] < a[j]: 내림차순
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;			
				} // end if
				
			} // j end
		} // i end
		
		System.out.print("\n\nsort 후 출력: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		
	} // main
}
