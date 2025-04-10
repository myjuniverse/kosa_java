package ex03.operator;

//최단산쉬관논삼대콤
//삼
public class OperatorTest3 {
	public static void main(String[] args) {
		
		// 7. 삼항(조건)연산자: (조건) ? 참: 거짓;
		
		int num = 10;
		String str;
		
		str = (num % 2 == 0) ? "짝" : "홀";
		str = (num % 2 != 0) ? "짝" : "홀";
		
		System.out.println(num + " : " + str);
		
		/* -------------------------------- */
		
		int x = 3, y = 5, z = 7, result1, result2;
		
		result1 = (x > y) ? x : y;
		result2 = (x > y) ? x :
								(y > z) ? y : z;
		
		System.out.println(result1);
		System.out.println(result2);

		/* -------------------------------- */
		
		int a, b, c, d;
		a = b = c = d = 10;
		int su = -3;
		String st;
		
		st = ((su % 2 != 0) && (su < 0)) ? "홀수 & 음수" :
														((su % 2 != 0) && (su < 0)) ? "홀수 & 양수" : "짝수 & 양수";
		
		System.out.println(su + " : " + st);
		
		
	}
}
