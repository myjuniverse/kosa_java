package ex01.sort;

public class BubbleSort {
	public static void main(String[] args) {

		int[] a = {7, 3, 5, 2, 8};
		int temp;
		
		System.out.print("sort 전 출력: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				
				if (a[j] > a[j+1]) { // -> 오름차순 / a[j] < a[j+1] -> 내림차순
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;			
				} // end if
				
			} // j end
		} // i end
		
		System.out.print("\n\nsort 후 출력: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		
	} // main
}
