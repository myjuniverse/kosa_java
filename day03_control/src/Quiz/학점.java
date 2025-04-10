package Quiz;

import java.util.Scanner;

public class 학점 {
	public static void main(String[] args) {
		
		System.out.print("jumsu input = ");
		int jumsu = new Scanner(System.in).nextInt();
		char grade = 0;
		
		// if A, B, C, D, E 학점
		
		if (jumsu <= 100 && jumsu >= 90) {
			System.out.println("A");
		} else if (jumsu < 90 && jumsu >= 70) {
			System.out.println("B");
		} else if (jumsu < 70 && jumsu >= 50) {
			System.out.println("C");
		} else if (jumsu < 50 && jumsu >= 30) {
			System.out.println("D");
		} else if (jumsu < 30 && jumsu >= 0) {
			System.out.println("E");
		} else {
			System.out.println("점수를 다시 입력해주세요");
		}
		
//		switch (jumsu/10) {
//		case 10: grade='A'; break;
//		case 9: grade='B'; break;
//		case 8: grade='C'; break;
//		case 7: grade='D'; break;
//		case 6: grade='E'; break;
//		default: grade='F'; break;
//		}
		
		grade = switch (jumsu/10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'E';
		default -> 'F'; 
		};
		
		int jumsu1 = 0;
		
		do {
			System.out.println("jumsu1 input = ");
			jumsu1 = new Scanner(System.in).nextInt();
		} while (jumsu1 < 0 || jumsu1 > 100);
		
		
//		System.out.print("year input = ");
//		int year = new Scanner(System.in).nextInt();
//		
//		// 연도를 입력받아서
//		// 윤년/평년 판정 프로그램
//		// 
//		
//		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}
		
		// 평균 60점, 과락 40점 불합격, 아니면 합격
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("전산 점수 : ");
		int com = sc.nextInt();
		
		int tot = kor + eng + com;
		double avg = tot / 3.0;
		
		
		
//		if (avg >= 60) { // 평균 60점 이상
//			if (kor >= 40 && eng >= 40 && com >= 40) { // 모든 과목 합격
//				System.out.println("\n" + name + "님의 성적처리");
//				System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
//				System.out.printf("\tavg: %.2f\n", avg);
//				System.out.println("모든과목 합격");
//			} else {
//				if (kor <= 40 && eng >= 40 && com >= 40) { // kor 과락
//					System.out.println("\n" + name + "님의 성적처리");
//					System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
//					System.out.printf("\tavg: %.2f\n", avg);
//					System.out.println("or 과락 불합격");
//				} else if (kor >= 40 && eng <= 40 && com >= 40) { // eng 과락
//					System.out.println("\n" + name + "님의 성적처리");
//					System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
//					System.out.printf("\tavg: %.2f\n", avg);
//					System.out.println("eng 과락 불합격");
//				} else if (kor >= 40 && eng >= 40 && com <= 40) { // com 과락
//					System.out.println("\n" + name + "님의 성적처리");
//					System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
//					System.out.printf("\tavg: %.2f\n", avg);
//					System.out.println("com 과락 불합격");
//				}
//			}
//		} else {
//			System.out.println("\n" + name + "님의 성적처리");
//			System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
//			System.out.printf("\tavg: %.2f\n", avg);
//			System.out.println("평균 미달 불합격");
//		}
		
		if (avg >= 60) { // 평균 60점 이상
			if (kor >= 40 && eng >= 40 && com >= 40) { // 모든 과목 40점 이상
				System.out.println("\n" + name + "님의 성적처리");
				System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
				System.out.printf("\tavg: %.2f\n", avg);
				System.out.println("모든과목 합격");
			} else { // 평균 60점 미만
			System.out.printf("\tavg: %.2f\n", avg);
			
			if (kor < 40) System.out.println("kor과목 과락 불합격");
			if (eng < 40) System.out.println("eng과목 과락 불합격");
			if (com < 40) System.out.println("com과목 과락 불합격");
			} 
		} else {
			// 평균미달
		}
		
		
	}
}