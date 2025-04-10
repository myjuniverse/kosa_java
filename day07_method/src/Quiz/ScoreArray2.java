package Quiz;

import java.util.Scanner;

public class ScoreArray2 {
	public static void main(String[] args) {
		
		// 1. 인원수 3명, 과목수 3명 변수 선언
		int SU = 3, NO = 3;
		int[][] arr = new int[SU][NO];  // 인원수, 과목수 
		String[] strName = new String[SU];
		Scanner sc = new Scanner(System.in);

		// 2. 반복해서 입력 받고 배열에 점수 넣기
		//input
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 학생 이름 입력: \n", i + 1);
			strName[i] = sc.next();
			
			for (int j = 0; j < arr[0].length; j++) {
				switch ( j ) {
					case 0:	System.out.print("국어점수 입력: ");	break;
					case 1:	System.out.print("영어점수 입력: ");	break;
					case 2:	System.out.print("전산점수 입력: ");	break;
				} // end switch
				
				arr[i][j] = sc.nextInt();
				
			} // j   end
		}  // i  end
		
		// 점수 총합, 등급 총합(?) 변수 선언
		int nSum = 0, nGrade = 0;
		double fAvg = 0;
		String strmsg = " ";
		char szGrade = ' ';
		
		// 반복분 돌며 3명 출력하기
		// 1. 점수
		// 2. 등급
		// 3. 결과 메세지
		for (int i = 0; i < arr.length; i++) {
			nSum = 0;
			fAvg = 0.0f;
			nGrade = 0;
			System.out.printf("[ %s ] 학생 점수 ==================\n ", strName[i]);
			for (int j = 0; j < arr[0].length; j++) {
				strmsg = " ";
				switch ( j ) {
					case 0:	strmsg = "국어 ";		break;
					case 1:	strmsg = "영어 ";		break;
					case 2:	strmsg = "전산 ";		break;
				} // end switch
				
				nSum += arr[i][j];
				System.out.printf("[ %s ] : %d \n", strmsg, arr[i][j]);
			} // end for j
			
			fAvg = (double) nSum / arr.length;
			nGrade = (int) fAvg / 10;
			switch (nGrade) {
				case 10:
				case 9:	szGrade = 'A';	break;
				case 8:	szGrade = 'B';		break;
				case 7:	szGrade = 'C';		break;
				case 6:	szGrade = 'D';	break;
				default:	szGrade = 'F';
			} // end switch
			
			System.out.println("\n**************** [ " + strName[i] + " ] 학생 점수 결과 ****************");
			System.out.printf("[ 총점: %d ]\t[ 평균: %.2f ]\t[ 학점 : %s ]\t", nSum, fAvg, szGrade);
			System.out.println("\n=================================================\n");
		} // end for i
		
		
	} // main
}