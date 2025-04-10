package ex03.operator;

// 최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		
		// 4. shift 연산자: <<, >>, <<<
//		int x = 8, result;
//		result = x << 2; // left shift: 원래값 * 2^bit수 ==> 8 * 4 = 32
//		result = x >> 3; // right shift: 원래값 / 2^bit수 ==> 8 * 8 = 1
//		
//		
//		System.out.println("x : " + x + "\nresult : " + result);
		
		// 5. 관계연산자: >, <, >=, <=, ==, !=
		
		int x = 20, y = 200;
		
		if(x != y) {
			System.out.println("같지않다.");
		} else {
			System.out.println("같다.");
		}
		
		if(x == y) {
			System.out.println("같다.");
		} else {
			System.out.println("같지않다.");
		}
		
		
	}
}