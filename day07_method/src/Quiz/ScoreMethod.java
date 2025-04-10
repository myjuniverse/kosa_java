package Quiz;

import java.util.Scanner;

public class ScoreMethod {
	
//	문제] 성적처리 프로그램을 함수로 분리한다.
//	입력함수 input() - 이름, 국어, 영어, 전산 점수
//	출력함수 output()
//	총점_평균 구하는 함수 total_avg(~~ )
//	학점 구하는 함수 grade(~)
//	메인함수
	
	public static void main(String[] args) {
		
		String name = inputName();
	    int[] score = inputScore();
	    int total = total(score);
	    double avg = avg(score);
	    char grade = grade(avg);

	    output(name, score[0], score[1], score[2], total, avg, grade);
		
	} // main
	
//	입력함수 input() - 이름, 국어, 영어, 전산 점수
	public static String inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		return sc.next();
	}
	
	public static int[] inputScore() {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[3];
		
		System.out.print("국어점수: ");
		score[0] = sc.nextInt();
		System.out.print("영어점수: ");
		score[1] = sc.nextInt();
		System.out.print("전산점수: ");
		score[2] = sc.nextInt();
		
		return score;
	}
	
//	총점_평균 구하는 함수 total_avg(~~ )
	public static int total(int[] score) {
		return score[0] + score[1] + score[2];
	}
	
	public static double avg(int[] score) {
		return (score[0] + score[1] + score[2]) / 3.0;
	}
	
//	학점 구하는 함수 grade(~)
	public static char grade(double avg) {
		if (avg >= 90) return 'A';
		else if (avg >= 80) return'B';
		else if (avg >= 70) return 'C';
		else if (avg >= 60) return 'D';
		else return 'F';
	}
	
//	출력함수 output() -> void?
	public static void output(String name, int kor, int eng, int com
								,int total, double avg, char grade) {
		
		System.out.println("******** [ " + name + " ] 학생 점수 결과 ********");
		System.out.printf("[ 국어: %d ]\t[ 영어: %d ]\t[ 전산 : %d ]\t\n", kor, eng, com);
		System.out.printf("[ 총점: %d ]\t[ 평균: %.2f ]\t[ 학점 : %s ]\t", total, avg, grade);
		System.out.println("\n=========================================\n");
	}


} // class
