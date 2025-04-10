package Quiz;

import java.util.Scanner;

public class ScoreArray1 {
	public static void main(String[] args) {
		
		int INWON = 3;
		Scanner sc = new Scanner(System.in);

		int[] num = new int[INWON];
		int[] kor = new int[INWON]; // 국어
		int[] eng = new int[INWON]; // 영어
		int[] com = new int[INWON]; // 전산
		int[] total = new int[INWON]; // 총합
		double[] avg = new double[INWON]; // 평균
		String[] name = new String[INWON]; // 이름
		char[] grade = new char[INWON]; // 등급

		double avgall = 0.0;
		int totalall = 0;

		// input
		for (int i = 0; i < INWON; i++) {
			System.out.println("========================");

			System.out.print(" 번호 입력: ");
			num[i] = sc.nextInt();
			System.out.print(" 이름 입력: ");
			name[i] = sc.next();
			System.out.print(" 국어점수 입력: ");
			kor[i] = sc.nextInt();
			System.out.print(" 영어점수 입력: ");
			eng[i] = sc.nextInt();
			System.out.print(" 전산점수 입력: ");
			com[i] = sc.nextInt();
			
			// 총점/평균/학급총,평균 처리
			total[i] = kor[i] + eng[i] + com[i]; // 개별 총점
			avg[i] = total[i] / 3.0; // 개별평균
			totalall += total[i]; // 전체 총점

			// 평점 구하기
			switch ((int) (avg[i] / 10)) {
				case 10:
				case 9: grade[i] = 'A'; break;
				case 8: grade[i] = 'B'; break;
				case 7: grade[i] = 'C'; break;
				case 6: grade[i] = 'D'; break;
				default: grade[i] = 'F';
			} // end switch
		} // end for

		avgall = (double) totalall / INWON; // 전체평균

		System.out.println("========================");

		// output
		for (int i = 0; i < INWON; i++) {
			System.out.println("========================");
			System.out.printf(
					"번호: %d\n이름: %s님의 성적표****\n" + "국어: %d\t영어: %d\t전산: %d\n"
							+ "총점: %d\t평균: %.2f\t학점: %c\n",
					num[i], name[i], kor[i], eng[i], com[i], total[i], avg[i], grade[i]);
			System.out.println("========================");
		} // end for

		System.out.println("========================");
		System.out.printf(" 학급 총점: %d\n 학급 평점: %.2f \n", totalall, avgall);
		System.out.println("========================");

		sc.close(); // Scanner 닫기
        
        
	} // main
}