package Quiz;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int[] a = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			// 소문자면 대문자로 변경
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32); // a - A = 32
			}

			a[ch - 'A']++; // 'A' 아스키코드 65 c-a=2 -> 2+1 abc
		}

		int max = 0;
		char result = '?';

		for (int i = 0; i < 26; i++) {
			if (a[i] > max) {
				max = a[i]; // 최댓값
				result = (char) (i + 'A'); // (char)(2 + 65'A') = (char)(67) = 'C'
			} else if (a[i] == max) {
				result = '?'; // 동점
			}
		}

		System.out.println(result);
	} // main
}
