package ex02.textPackge;

import java.text.ChoiceFormat;
import java.util.Iterator;

public class ChoiceFormatEx {
	public static void main(String[] args) {
	
		//
//		double[] limits = {50, 60, 70, 80, 90}; // 낮은 값부터 큰 값의 순서로 적어줌
//		String[] grade = {"F", "D", "C", "B", "A"};
		
//		ChoiceFormat form = new ChoiceFormat(limits, grade);
		
//		for (int i = 0; i < score.length; i++) {
//			System.out.println(score[i] + " : " + form.format(score[i]));
//		}

		
		// pattern
		String pattern = "50#F|60#D|70#C|80#B|90#A";
		
		int[] score = {100, 95, 70, 55, 60, 70};
		
		ChoiceFormat form = new ChoiceFormat(pattern); // pattern
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + " : " + form.format(score[i]));
		}

		
	}
}