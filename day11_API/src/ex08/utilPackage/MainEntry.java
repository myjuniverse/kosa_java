package ex08.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); // system이 갖고 있는 날짜 얻어옴
//		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1); // 월은 0부터 시작 +1 필요
		System.out.println(c.get(Calendar.DATE));
		System.out.println("-----------------------------");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println(h +":" + m + ":" + s);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2024, 5, 2, 13, 22);
		if (c1.after(c2)) {
			System.out.println("2024/05/02 이후");
		} else if (c1.before(c2)) {
			System.out.println("2024/05/02 이전");
		} else if (c1.equals(c2)) {
			System.out.println("same");
		}
		
	}
}