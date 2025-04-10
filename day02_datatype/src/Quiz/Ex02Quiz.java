package Quiz;

public class Ex02Quiz {
	public static void main(String[] args) {
	
		//시 : 분 : 초를 구하시오
		int num = 12345;
		
		// 1시간 = 60분 = 3600초

		System.out.println(num/3600 + "시 " + (num%3600)/60 + "분 " + (num%3600)%60 + "초");
		
	}
}