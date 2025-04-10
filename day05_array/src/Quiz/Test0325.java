package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Test0325 {
	public static void main(String[] args) {
		
//		문제1] 업/다운 게임 프로그램 작성 (난수 이용)
//		1~100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를줘서 입력 받는다.
//		그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
//		Random rand = new Random();
//		int ran = rand.nextInt(100) + 1; // 1 ~ 100
//		System.out.println(ran);
		
//		for (int i = 1; i <= 5; i++) {
//			System.out.print("input num: ");
//			int num = sc.nextInt();
//			
//			if (num > ran) { // 난수보다 큼
//				System.out.println("down");
//			} else if (num < ran) { // 난수보다 작음
//				System.out.println("up");
//			} else { // 같을때
//				System.out.println("정답입니다. \n입력한수: " + num + " 난수: " + ran );
//				break;
//			}
//		}
//		System.out.println("정답은 " + ran + "입니다.");
/* ---------------------------------------------------------------------------- */
		// 문제2] 로또 프로그램
		// 1~45까지 숫자 중 6개 추출
		
		
//		for (int i = 1; i <= 6; i++) {
//			
//			int random = rand.nextInt(45) + 1; // 1 ~ 45
//
//			
//		}
/* ---------------------------------------------------------------------------- */
//		배열 여러개 데이터 중에서 7의 개수를 찾기 // a[i]는 정수 값
//		int[] a = new int[] {7,3,7,8,1,9,7, 100, 12, 7, 33, 7};
//		int count = 0;
//		int sum = 0;
//		
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == 7) {
//				count ++;
//			}	
//		}
//		System.out.println("7의 개수: " + count);
//		
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		System.out.println("총합: " + sum);
/* ---------------------------------------------------------------------------- */
//		문제3] 기상청 근무
//		특정달(30일 기준) 강수량 평균(소수점 2자리까지 출력) 구하는 프로그램 작성
		
//		1.2 0 10. 0.5
//		int num = 0;
//		int sum = 0;
//		
//		System.out.print("입력할 강수량의 수 ");
//		num = sc.nextInt();
//		
//		int[] weather = new int[num];
//		
//		for (int i = 0; i < weather.length; i++) {
//			sum += weather[i];
//			
//			System.out.println(weather[i]);
//			double avg = sum / weather.length;
//			System.out.println(avg);
//		}
		
//		int su = 3, sum = 0;
//		double avg = 0;
//		double[] arr = new double[su];
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			System.out.println((i+1) + "일 강수량 입력: ");
//			arr[i] = new Scanner(System.in).nextDouble();
//			sum += arr[i];
//			avg = (double)sum / arr.length;
//			
//		}
//		
//		System.out.printf("평균 강수량: %.2f", avg);
/* ---------------------------------------------------------------------------- */
//		2차원 배열에 임의적인 숫자 입력 받아서 합 출력 (todo)
		
//		double[] arr = new double[su];
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			System.out.println((i+1) + "일 강수량 입력: ");
//			arr[i] = new Scanner(System.in).nextDouble();
//			sum += arr[i];
		
//		a[i][j] = x + i;
//		a[i][j] = x += 5;
		
//		System.out.print("숫자를 입력해주세요: "); // 12개?
//		int num = sc.nextInt();
////		Random rand = new Random();
////		int ran = rand.nextInt(10) + 1; // 1 ~ 10
////		System.out.println(ran);
//		
//		int sum = 0;
//		int[][] a = new int[num][num];
//		System.out.println("---");
//		//
//		
//		for (int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				a[i][j] = new Scanner(System.in).nextInt();
//				System.out.print(a[i][j] + " ");
//				sum += a[i][j];
//			}
//		}
		
		
//		Random rand = new Random();
//		int ran = rand.nextInt(10) + 1; // 1 ~ 10
//		
//		for(int i = 1; i <= ran; i++) {
//			
//		}		
/* ---------------------------------------------------------------------------- */
//		행의 합이 들어가게
//		int[][] arr =  {{3, 10, 2, 8},
//						{7, 15, 5, 3},
//						{0, 0, 0, 0}};
//		
//		// a[0][0] + a[1][0] = a[2][0] 10
//		// a[0][1] + a[1][1] = a[2][1] 25
//		// a[0][2] + a[1][2] = a[2][2] 7
//		// a[0][3] + a[1][3] = a[2][3] 11
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (i == 0) {
//					arr[2][j] = arr[i][j] + arr[i+1][j];
//				}
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
/* ---------------------------------------------------------------------------- */
//		문제4] 성적처리 프로그램을 배열 이용할것 
//		7명의 성적을 입력 받아서 총점, 평균, 평점 까지 구하는 프로그램 작성
//		무한루프 이용해서 원하는 만큼 입력 받기
//		subjext[7][4] 인원수, 과목수, 총점
		
				
//		1차원
//		String[] names = new String[7]; // 7명
//		int[] scores = new int[3]; // 3개 점수 입력
//		int count = 0;
//		
//
//		while (count < 7) {
//			System.out.println((count + 1) + "번째 학생 정보 입력]");
//
//			System.out.print("이름: ");
//			names[count] = sc.next();
//			
//			for (int j = 0; j < scores.length; j++) { // 점수 입력
////				if (j == 0) System.out.print("국어: ");
////				else if (j == 1) System.out.print("영어: ");
////				else System.out.print("전산: ");
//				String subject = (j == 0) ? "국어: " : (j == 1) ? "영어: " : "전산: "; 
//				
//				
//				while (true) { // 7명 미만 입력
//					System.out.print(subject);
//					scores[j] = sc.nextInt();
//
//					if (scores[j] >= 0 && scores[j] <= 100) break;
//					System.out.println("0~100 사이의 점수를 입력해주세요.");
//				}
//			}
//
//			// 총점, 평균, 평점 계산
//			int tot = scores[0] + scores[1] + scores[2];
//			double avg = tot / 3.0;
//			char grade;
//
//			if (avg >= 90) grade = 'A';
//			else if (avg >= 70) grade = 'B';
//			else if (avg >= 50) grade = 'C';
//			else if (avg >= 30) grade = 'D';
//			else grade = 'F';
//
//			// 결과 출력
//			System.out.println("\n[성적 결과]");
//			System.out.println("이름: " + names[count]);
//			System.out.println("국어: " + scores[0] + ", 영어: " + scores[1] + ", 전산: " + scores[2]);
//			System.out.println("총점: " + tot + ", 평균: " + String.format("%.2f", avg) + ", 평점: " + grade 
//								+ "\n------------------");
//			
//			count++;
//			// System.out.println("\n7명 모두 입력 완료! 프로그램을 종료합니다.");
//			// sc.close();
//		}
		
//		2차원
//		Scanner 상단에 있음
//		1. 인원수 4명, 과목수 3명, 이름 배열 변수 선언
		
		int[][] score = new int[4][3]; // arr[인원][과목]
		String[] name = new String[4];
		
//		2. 반복해서 이름/점수 입력 받고 배열에 점수 넣기
		for (int i = 0; i < score.length; i++) {
			name[i] = sc.next();
			System.out.print("국어 점수: ");
			score[i][0] = sc.nextInt();
			System.out.print("영어 점수: ");
			score[i][1] = sc.nextInt();
			System.out.print("전산 점수: ");
			score[i][2] = sc.nextInt();	
		} // end for		
		
//		3. 총점, 평균, 학점, 석차 변수 선언
		int[] total = new int[4];
		double[] avg = new double[4];
		char[] grade = new char[4];
		int[] rank = new int[4];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				total[i] += score[i][j];
			} // end for j
			
			avg[i] = total[i] / 3.0;

			// 학점
			if (avg[i] >= 90) grade[i] = 'A';
			else if (avg[i] >= 80) grade[i] = 'B';
			else if (avg[i] >= 70) grade[i] = 'C';
			else if (avg[i] >= 60) grade[i] = 'D';
			else if (avg[i] >= 50) grade[i] = 'E';
			else grade[i] = 'F';
			
			// 석차
			for (int j = 0; j < score.length; j++) {
				rank[j] = 1;
				for (int k = 0; k < score.length; k++) {
					if (avg[j] < avg[k]) rank[j]++;
				} // end for k
			} // end for j
			
		} // end for i
		
//		4. 반복문 돌며 n명 출력하기
//			4-1) 총점, 평균, 학점, 석차
//			4-3) 결과 메세지
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s님의 총점: %d\t평균: %.2f\t학점: %c\t석차: %d\n",
								name[i], total[i], avg[i], grade[i], rank[i]);
		}
		

// ----------- 내가 짜다가 막힌거
//		int kor[] = new int[3], 
//			eng[] = new int[3],
//			com[] = new int[3],
//			tot[] = new int[3];
		
//		int[] score = new int[3];
//		
//		while (true) {
//			
//			for (int i = 1; i < 8; i++) {
//				System.out.print("성적을 차례대로 입력해주세요: ");
//				score[i] = sc.nextInt();
//			}
			
			
			// 탈출구문
//			System.out.print("\n계속 입력하실래요?(y/n)");
//			String ans = sc.next();
//			
//			yn = sc.next().charAt(0);
//			if (yn == 'n' || yn == 'N')
//				break;
//			
////			if (ans.toLowerCase("n") || ans.toUpperCase().equals("N")) break;
//			if (ans.equalsIgnoreCase("n")) // 대소문자 구분 없이 비교
//				break;
//		}
		
// ----------- 내가 짜다가 막힌거
//		int kor[] = new int[7], 
//			eng[] = new int[7],
//			com[] = new int[7],
//			tot[] = new int[7];
//		String[] name = new String[7];
//		double avg = 0;
//		char grade=' ', yn=' ';
//		int count = 0;
//		
//		while (count < 7) { // 무한루프
//			
//			System.out.print("이름을 입력하세요 : ");
//			name = sc.nextLine();
//			
//			
//			do {
//				
//				System.out.print("국어 점수 : ");
//				kor = sc.nextInt();
//				
//				System.out.print("영어 점수 : ");
//				eng = sc.nextInt();
//				
//				System.out.print("전산 점수 : ");
//				com = sc.nextInt();
//				
//				if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || com < 0 || com > 100) 
//					System.out.println("잘못된 점수가 있습니다. 0~100 사이의 점수를 다시 입력하세요.\n");
//				
//			} while (kor < 0 || kor > 100 || eng < 0 || eng > 100 || com < 0 || com > 100);
//			
//			tot = kor + eng + com;
//			avg = (double)tot / 3;
//			
//			if (avg >= 90) grade = 'A';
//	        else if (avg >= 70) grade = 'B';
//	        else if (avg >= 50) grade = 'C';
//	        else if (avg >= 30) grade = 'D';
//	        else grade = 'F';
//			
//			System.out.println("\n" + name + "님의 성적처리");
//			System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
//			System.out.printf("\tavg: %.2f \t grade: %c", avg, grade);
//			
//
//			// 탈출구문
//			System.out.print("\n계속 입력하실래요?(y/n)");
//			String ans = sc.next();
//			
//			yn = sc.next().charAt(0);
//			if (yn == 'n' || yn == 'N')
//				break;
//			
////			if (ans.toLowerCase("n") || ans.toUpperCase().equals("N")) break;
//			if (ans.equalsIgnoreCase("n")) // 대소문자 구분 없이 비교
//				break;
//			
//		}
		
		
/* ---------------------------------------------------------------------------- */
		
		
		
/* ---------------------------------------------------------------------------- */
		
		
		
	} // main
}
