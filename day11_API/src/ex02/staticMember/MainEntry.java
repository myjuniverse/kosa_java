package ex02.staticMember;

class Atm {
	int count; // instance member
	static int total; // static member - 초기화 1회만..., 이전에 있는 값을 가져온다.
	
	public Atm(int amount) { // 생성자 생성
		count += amount;
		total += amount;
	}
	// static member 에서 일반 멤버변수는 사용할 수 없다.
	public static void view() {
		total += 100;
//		count += 100; // error
	}
	
	public void disp() {
		count += 50;
		total += 50;
		System.out.println("count: " + count);
		System.out.println("total: " + total);
	}
	
} // Atm end



public class MainEntry {
	public static void main(String[] args) {
		
		System.out.println(Atm.total);
		Atm at = new Atm(1000); // c: 1000, t: 1000
		at.disp();
		
		System.out.println("------");
		Atm at2 = new Atm(1000); // c: 1000, t: 2000
		at2.disp();
		
		System.out.println("------");
		Atm at3 = new Atm(1000); // c: 1000, t: 3000
		at3.disp();
		
		
		
	}
}
