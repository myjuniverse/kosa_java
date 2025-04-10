package ex02.datatype;

public class MainEntry {
	
	static int num; // static type, 자동초기화
	static String str; // 정수형: 0, 실수형: 0.0, 문자형: null
	
	public static void main(String[] args) { // 시작점
		
		System.out.println(num);
		System.out.println(str);
		
		int x = 99; // 지역변수는 반드시 초기화하고 사용 ex) int x; (에러)
		System.out.println(x);
		
		int su = 30;
		System.out.println(su); // 4byte
		System.out.println(100); // int
		
		long num= 200;
		System.out.println(num); // 8byte
		System.out.println(1000); // long
		
		double d = 12.34;
		System.out.println(d); // 8byte
		System.out.println(34.56); // double
		System.out.println(5.67f); // 4byte float
		
		float f = 12.34f; // 선언한 변수 뒤에 f/F 작성
		System.out.println(f); // 대입시 뒤에부터 인식
		
	}
	
	
}
