package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet<>();
		
		int[] score = { 100, 20, 66, 70, 53, 10, 99, 100, 70};
		
		for (int i = 0; i < score.length; i++) {
//			set.add(score[i]);
			set.add(new Integer(score[i]));
		}
		System.out.println(set); // [10, 20, 53, 66, 70, 99, 100] 순서 O 중복 X

		System.out.println("50보다 작은값: " + set.headSet(50));
		System.out.println("50보다 큰값: " + set.tailSet(50));
		
		
	}
}