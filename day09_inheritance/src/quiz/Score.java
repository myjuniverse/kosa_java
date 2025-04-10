package quiz;

import java.util.Scanner;

public class Score {
	int kor;
	int eng;
	int com;
	int total;
	double avg;
	char grade;

	public Score() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수: ");
		this.kor = sc.nextInt();
		
		System.out.print("영어 점수: ");
		this.eng = sc.nextInt();
		
		System.out.print("전산 점수: ");
		this.com = sc.nextInt();
	}
	
	public int total() {
		return this.total = kor + eng + com;
	}
	
	public double avg() {
		return this.avg = this.total / 3.0;
	}
	
	public char grade() {
		if(this.avg >= 90) {
			this.grade = 'A';
		} else if(this.avg >= 80) {
			this.grade = 'B';
		} else if(this.avg >= 70) {
			this.grade = 'C';
		} else if(this.avg >= 60) {
			this.grade = 'D';
		} else {
			this.grade = 'F';
		}
		
		return this.grade;
	}
	
	
	public void show() {
		System.out.print("국어점수: " + kor + "\t영어점수: " + eng + "\t전산점수: " + com
						+ "\n총합: " + total() + "\t평균: " + avg() + "\n등급: " + grade());
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	
}
