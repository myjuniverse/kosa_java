package Quiz;

public class ScoreScanner {
	public static void main(String[] args) {
		
		// kor, eng, com, name --> total, average
		
		int kor = 90, eng = 88, com = 100, tot;
		String name = "Jun";
		double avg = 0;
		char grade = 0;
		
		tot = kor + eng + com;
		avg = tot / 3;
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		
		if (avg >= 90) grade = 'A';
        else if (avg >= 70) grade = 'B';
        else if (avg >= 50) grade = 'C';
        else if (avg >= 30) grade = 'D';
        else grade = 'F';
		
		
		System.out.println(name + "님의 성적처리");
		System.out.print("kor : " + kor + "\teng : " + eng + "\tcom : " + com + "\ntot : " + tot);
		System.out.printf("\tavg: %.2f \t grade: %c", avg, grade);
		
		
		
		
	}
}
