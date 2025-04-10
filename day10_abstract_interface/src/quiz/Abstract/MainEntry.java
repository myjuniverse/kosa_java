package quiz.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		
		// 1. 자기 자신으로 객체 생성
		Subway s = new Subway();
		s.show();
		System.out.println(s.str);
		
		// 2. 부모 인터페이스로 객체 생성
		Trans t = new Bus();
		t.show();
		System.out.println(t.str);
		
		
	}
}
