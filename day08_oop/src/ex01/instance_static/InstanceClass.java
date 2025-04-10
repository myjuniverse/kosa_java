package ex01.instance_static;

class Bclass {
	int x, y;
	
	// instance method
	public void setDate(int xx, int yy) {
		System.out.println(xx + " " + yy);
	}
	
} // Bclass

public class InstanceClass {
	public static void main(String[] args) {
		Bclass b = new Bclass(); // 객체 생성, 메모리 할당, 생성자 자동 함수 호출
		
		b.setDate(22, 55); 
//		Bclass. -- 하고 부를수없음
		
	} // main
}

/*
	instant method: 객체 생성 후 사용(메모리 상에 할당이 되어야함)
	
	ex) Scanner sc = new Scaner(System.in);
	int. x = sc.nextInt(); → 인스턴스 메서드
*/