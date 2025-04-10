package ex00.Instanceof;

class A { int a; }

class B extends A { int b; }

public class MainEntry {
	public static void main(String[] args) {

		A a = new A();
		
//		B aa = new A(); // 자식 객체로 부모 생성 불가능
		
		B b = new B();
		A bb = new B(); // 부모 객체로 자식 생성 가능
		
		// instanceof: 객체간의 비교 (앞에 있는게 뒤에 있는게 되니)?
		System.out.println("a instanceof A: " + (a instanceof A)); 
		System.out.println("b instanceof A: " + (b instanceof A)); 
		System.out.println("a instanceof B: " + (a instanceof B)); // false 
		System.out.println("b instanceof B: " + (b instanceof B)); 
		
		
		
		
		
	}
}