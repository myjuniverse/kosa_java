package ex02.oop;

import java.util.Scanner;





public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person ps = new Person();
		
		System.out.print("이름: ");
		ps.setName(sc.next());
		System.out.print("나이: ");
		ps.setAge(sc.nextInt());
		System.out.print("전화번호: ");
		ps.setPhone(sc.next());
		
		ps.display();
		
		
		
	}
}
