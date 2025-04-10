package quiz;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		// 로또 번호 생성
		Random rd = new Random();
		TreeSet num = new TreeSet<>();
		
		// 로또 번호 출력
		// 1부터 45까지의 숫자 중에서 중복 없이 6개의 숫자를 랜덤하게 생성
		while (num.size() <= 6) {
			num.add(rd.nextInt(45)+1);
		}
		System.out.print(num);
		
	}
}