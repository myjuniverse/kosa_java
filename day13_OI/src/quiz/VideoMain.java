package quiz;

import java.util.Scanner;

public class VideoMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		VideoController vc = new VideoController();
		int select;

		while (true) {
			System.out.println("====== 비디오 ======");
			System.out.println("1.추가   2. 수정   3. 삭제   4. 출력  5. 대여 0. 종료");
			System.out.print("번호 선택하세요. (0~5번 중에서만 선택) : ");
			select = sc.nextInt();
			sc.nextLine();

			switch (select) {
			case 1: vc.addVideo(); break;
			case 2: vc.updateVideo(); break;
			case 3: vc.deleteVideo(); break;
			case 4: vc.listVideo(); break;
			case 5: // 대여 
				break;
			case 0:
				System.out.println("종료합니다.");
				System.exit(0); // 프로그램 강제 종료
			default:
				System.out.println("잘못 선택하셨습니다. 없는 번호 입니다.( 0~5번 중에서만 선택)\n");
				break;
			} // switch end
		} // while end
		
		
	}
}