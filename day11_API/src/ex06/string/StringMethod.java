package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "hello java";
		String s2 = "SEOUL";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s2.replace("EO", "korea")); // SkoreaUL
		System.out.println(s2); // SEOUL
		
//		s2 = s2.replace("EO", "korea");
//		System.out.println(s2); // SkoreaUL
		System.out.println("------------------------");
		
		s1 = s1 + s2;
//		s1 = s1.concat(s2); // 문자열결합
		System.out.println(s1);
		System.out.println("------------------------");
		
		String s3 = new String(" aaa tt dd  fb   ");
		System.out.println(s3);
		System.out.println(s3.length());
		s3 = s3.trim(); // 공백제거(중간공백 제거는 불가)
		System.out.println(s3.length());
		System.out.println("------------------------");
		
//		String s4 = new String("ab defg ka5533");
//		String[] s5 = s4.split(" ");
//		for (int i = 0; i < s5.length; i++) {
//			System.out.println(s5[i]);
//		}
		
		String s4 = new String("ab /defg ka5/   533");
		String[] s5 = s4.split("/");
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		
		String s6 = "010-1233-4333";
		String[] s7 = s6.split("-");
		for (int i = 0; i < s7.length; i++) {
			System.out.println(s7[i]);
		}
		
		String s8 = "12314216poep lsdfsk 4532523 kmlfmkds";
		char ch = s8.charAt(8);
		System.out.println(ch);
		
		s8 = s8.substring(5, 7);
		System.out.println(s8);
		
		System.out.println("------------------------");
		System.out.println("소문자로 출력: " + s2.toLowerCase()); 
		System.out.println("소문자로 출력: " + s1.toUpperCase()); 
		
		char[] ch2 = s1.toCharArray();		
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(ch2[i] + " ");
		}
		
		
		
		
		
		
		
	}
}