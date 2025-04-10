package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

// set: 순서 X 중복 허용 X
public class MainEntry {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>(); // new HashSet<>(); 생략가능
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("마우스");
		
		System.out.println("요소 개수: " + hs.size()); // 4 -> 중복 허용 X
		System.out.println(hs); // [컵, 볼펜, 키보드, 마우스] -> 순서 X
		/* ------------------------------ */
		HashSet<Integer> hs2 = new HashSet<>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add("String"); 타입제한
		
		System.out.println(hs2); // [3, 100, 1000]
		/* ------------------------------ */
		HashSet hs3 = new HashSet<>();
		hs3.add(12.34);
		hs3.add(300);
		hs3.add("string");
		
		System.out.println(hs3); // [12.34, string, 300]
		/* ------------------------------ */
		Iterator it = hs3.iterator();		
		
		// 값만 꺼낸다 (순서 X)
		while (it.hasNext()) {
			System.out.print(it.next() + " "); // 12.34 string 300 
		}
		it = hs.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " "); // 12.34 string 300 
		}
			
		
	}
}