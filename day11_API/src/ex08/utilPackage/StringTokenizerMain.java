package ex08.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		
//		StringTokenizer token = new StringTokenizer("카리나/ 윈터 & / |닝닝", "/"); 
//				new StringTokenizer("카리나 윈터 닝닝");
//		
//		while (token.hasMoreElements()) { // 토큰이 있다면 true
//			System.out.println(token.nextElement());
//		}
/* -------------------------------------------------------------------- */
		StringTokenizer token = new StringTokenizer("사과=10|초콜렛=3|샴페인=1", "=|", true);
		
//		while (token.hasMoreElements()) {
//			System.out.print(token.nextElement()); // 사과=10|초콜렛=3|샴페인=1
//			String str = token.nextToken();
//			if (str.equals("=")) System.out.print("\t");
//			else if (str.equals("|")) System.out.print("\n");
//			else System.out.println(str);
//		}
		
		// 교수님 코드 참고
		String[] str = token.nextToken().split("|");
		for (int i = 0; i < str.length; i++) {
			System.out.println();
		}
		
		
		
		
	}
}