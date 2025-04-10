package quiz;

import java.util.Scanner;

public class QuizString {
	public static void main(String[] args) {
/*		문제1] String str = " ";
		임의적인 문자열 입력 받아서 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램 작성
		
		Character.isUpperCase() 대문자 인지 확인
		Character.isLowerCase() 소문자 인지 확인
		Character.toUpperCase() 문자 값을 대문자 변환
		Character.toLowerCase() 문자 값을 소문자 변환
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("대소문자 혼합하여 입력: ");
		String str = sc.nextLine();
		String result ="";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (Character.isUpperCase(ch)) { // 대문자인지 확인
				result += Character.toLowerCase(ch); // 소문자로 변환
			} else {
				result += Character.toUpperCase(ch); // 대문자로 변환
			}
		}
		System.out.println(result);
		
		
/*		문제2]  String str = "ABC def kbsmbc 123 BB";
		주어진 문자열에서 대문자 개수와 소문자 개수 출력하는 프로그램 작성
		
		if (Character.isUpperCase(ch)) { 대문자 이면 ++
        	upper++;
    	} else if (Character.isLowerCase(ch)) { 소문자 이면 ++
        	lower++;
    	}
*/
		
		String st = "ABC def kbsmbc 123 BB";
		int upper = 0;
		int lower = 0;
		
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			} else if (ch >= 'a' && ch <='z') {
				lower++;
			} 
		}
		System.out.println("대문자: " + upper + "개");
		System.out.println("소문자: " + lower + "개");
		
		
	}
	
}