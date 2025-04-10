package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Object[] objArr = {"1", new Integer(1), "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set); // [1, 1, 2, 3, 4] 타입이 다를땐 다른값으로 인식된다.
		
		
	}
}