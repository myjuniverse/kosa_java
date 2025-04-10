package ex06.whileDowhile;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		
//		int su;
//		char grade=' ', yn=' ';
//		Scanner sc = new Scanner(System.in);
//		
//		while (true) { // 무한루프
//
//			do {
//				System.out.print("당신의 점수 입력 : ");
//				su = sc.nextInt();
//			} while (su < 0 || su > 101);
//
//			System.out.println("\n당신의 점수 " + su + "\n");
//
//			// 탈출구문
//			System.out.println("계속 입력하실래요?(y/n)");
//			yn = sc.next().charAt(0);
//			if (yn == 'n' || yn == 'N')
//				break;
//		}
		
//		문제] 이름 입력 받고, 국어,영어,전산 점수 입력 받아서 
//		총점, 평균, 학점까지 구하는 프로그램 작성
//		점수 (0~100) 점 사이값만 입력 받기
//		무한루프 이용해서 원하는 만큼 입력 받기
//		
//		이도연님의 성적표**
//		국어 : 100, 영어 : 100, 전산 : 100
//		총점 : 300, 평균 : 100.0  학점 : A
		
		int kor, eng, com, tot;
		String name = null;
		double avg = 0;
		char grade=' ', yn=' ';
		Scanner sc = new Scanner(System.in);
		
		while (true) { // 무한루프
			
			System.out.print("이름을 입력하세요 : ");
			name = sc.nextLine();
			
			do {
				
				System.out.print("국어 점수 : ");
				kor = sc.nextInt();
				
				System.out.print("영어 점수 : ");
				eng = sc.nextInt();
				
				System.out.print("전산 점수 : ");
				com = sc.nextInt();
				
				if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || com < 0 || com > 100) 
					System.out.println("잘못된 점수가 있습니다. 0~100 사이의 점수를 다시 입력하세요.\n");
				
			} while (kor < 0 || kor > 100 || eng < 0 || eng > 100 || com < 0 || com > 100);
			
			tot = kor + eng + com;
			avg = (double)tot / 3;
			
			if (avg >= 90) grade = 'A';
	        else if (avg >= 70) grade = 'B';
	        else if (avg >= 50) grade = 'C';
	        else if (avg >= 30) grade = 'D';
	        else grade = 'F';
			
			System.out.println("\n" + name + "님의 성적처리");
			System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
			System.out.printf("\tavg: %.2f \t grade: %c", avg, grade);
			

			// 탈출구문
			System.out.print("\n계속 입력하실래요?(y/n)");
			String ans = sc.next();
			
			yn = sc.next().charAt(0);
			if (yn == 'n' || yn == 'N')
				break;
			
//			if (ans.toLowerCase("n") || ans.toUpperCase().equals("N")) break;
			if (ans.equalsIgnoreCase("n")) // 대소문자 구분 없이 비교
				break;
			
		}
		
		
		
		
		
	}
}
