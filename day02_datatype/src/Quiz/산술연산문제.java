package Quiz;

public class 산술연산문제 {
	public static void main(String[] args) {
		
		// 연산자 /, % 이용해서 만원 몇장, 천원 몇장, 백원 몇개 십원 몇개인지 출력
		// 1. 변수 선언
		int pay = 567890;
		
		// 2. 메세지 출력 및 입력값 받기
		// 3. 처리(계산)
		// 4. 결과값 출력(화면)
		
		System.out.println("만원 : " + pay/10000 + "장"); // 56
		System.out.println("천원 : " + (pay%10000)/1000  + "장"); // 7
		System.out.println("오백원 : " + (pay%1000)/500  + "개");
		System.out.println("백원 : " + (pay%1000)/100 + "개"); // 8
		System.out.println("십원 : " + (pay%100)/10 + "개"); // 9
		
		
//		System.out.println("[result]");
//
//        int[] money = {10000, 1000, 100, 10};
//        for (int i = 0; i < money.length; i++) {
//
//            System.out.printf("%d원: %d개 \n", money[i], pay/money[i]);
//
//            pay %= money[i];
//        }
        
	}
}
