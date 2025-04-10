package ex01.collection.set;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
	public static void main(String[] args) {

		ArrayList list = new ArrayList<>(10);
		list.add(new Integer(4));
		list.add(new Integer(10));
		list.add(new Integer(33));
		list.add(new Integer(24));
		list.add(new Integer(4));
		list.add(new Integer(12));
		
		ArrayList list2 = new ArrayList<>(list.subList(1, 4)); // 1포함 4미만
		System.out.println("list2 가 list에 포함되어있니: " + list.containsAll(list2));
		
		print(list, list2);
		list2.add(34);
		
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		
		System.out.println("list2 가 list에 포함되어있니: " + list.containsAll(list2)); // list2 가 list에 포함되어있니
		
		for (int i = list2.size()-1; i >= 0 ; i--) {
			if (list.contains(list2.get(i))) {
				list2.remove(i);
			}
			print(list, list2);
		}
		
		
	}

	public static void print(ArrayList list, ArrayList list2) {
		System.out.println("list: " + list);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}