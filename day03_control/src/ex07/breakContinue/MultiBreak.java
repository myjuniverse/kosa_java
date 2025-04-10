package ex07.breakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		
		boolean flag = true;
		
		first: {
			second :{
				third: {
					int k = 10;
					System.out.println("Before the break"); // 1
					
					if (flag) {
						break second; // break 식별자이름; (식별자 위치까지 탈출)
					}
					System.out.println("this wont execute"); // 2
				} // end third
				System.out.println("3번"); // 3
			} // end second
			System.out.println("4번"); // 4
		} // end first
		System.out.println("end"); // 5
		
		
/*
 *  식별자 1번 : {
 *  
 *  	식별자 2번 : {
 *  
 *  		break 식별자1;
 *  
 *  	}
 *  
 *  }
 *  
 * */
		
		
		
	}
}
