package Quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		
		// kor, eng, com, name --> total, average
		Scanner sc = new Scanner(System.in);
		char grade = 0;
		int kor = 0, eng = 0, com = 0;
		
//		System.out.print("이름을 입력하세요 : ");
//		String name = sc.nextLine();
//		
//		System.out.print("국어 점수 : ");
//		int kor = sc.nextInt();
//		
//		System.out.print("영어 점수 : ");
//		int eng = sc.nextInt();
//		
//		System.out.print("전산 점수 : ");
//		int com = sc.nextInt();
		
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		int tot = kor + eng + com;
		double avg = tot / 3;
		
		do {
			System.out.print("국어 점수 : ");
			kor = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			eng = sc.nextInt();
			
			System.out.print("전산 점수 : ");
			com = sc.nextInt();
			
		} while (kor < 0 || kor > 100 || eng < 0 || eng > 100 || com < 0 || com > 100);
			
		switch ((int)avg/10) { // switch (tot/30)
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F'; break;
		}
		
		System.out.println("\n" + name + "님의 성적처리");
		System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
		System.out.printf("\tavg: %.2f \t %c", avg, grade);
		
//		if (avg >= 90) grade = 'A';
//        else if (avg >= 70) grade = 'B';
//        else if (avg >= 50) grade = 'C';
//        else if (avg >= 30) grade = 'D';
//        else grade = 'F';
		
		switch ((int)avg/10) { // switch (tot/30)
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F'; break;
		}
		
		
		sc.close();
		
		
	}
}
