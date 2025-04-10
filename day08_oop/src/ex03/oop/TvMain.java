package ex03.oop;

import java.util.Scanner;

public class TvMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 색상과 채널을 입력해주세요: ");
		TV tv = new TV(sc.next(), sc.next());
		
		System.out.print("2. 색상과 채널을 입력해주세요: ");
		TV tv2 = new TV(sc.next(), sc.next());
		
		System.out.print("3. 색상과 채널을 입력해주세요: ");
		TV tv3 = new TV(sc.next(), sc.next());
		
		System.out.println(tv.toString());
		System.out.println(tv2.toString());
		System.out.println(tv3.toString());
		
		
	}
}
