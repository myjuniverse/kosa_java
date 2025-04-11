package ex02.textPackge;

import java.util.TreeSet;

public class ComparatorMain {
	public static void main(String[] args) {
		
		TreeSet set1 = new TreeSet(); // 오름차순 정렬
		TreeSet set2 = new TreeSet(new UserDesending()); // 사용자가 만든 내림차순 클래스 객체 전달
		
		int[] score = {100, 56, 78, 45, 80, 99, 45};
		
		for (int i = 0; i < score.length; i++) {
			set1.add(score[i]);
			set2.add(score[i]);
		}
		
		System.out.println(set1); // [45, 56, 78, 80, 99, 100] 오름차순 중복 제거
		System.out.println(set2); // [100, 99, 80, 78, 56, 45] 내림차순 중복 제거
		
		
		
	}
}