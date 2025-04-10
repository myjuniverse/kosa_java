package quiz;

import java.io.IOException;
import java.util.Scanner;

public class BmiMain {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		BmiController bc = new BmiController();
		int select;
		
		while (true) {
			System.out.println("====== bmi ======");
			System.out.println("1.추가   2. 수정   3. 삭제   4. 출력  5. 저장  6. 저장파일출력 0. 종료");
			System.out.print("번호 선택하세요. (0~6번 중에서만 선택) : ");
			select = sc.nextInt();
			sc.nextLine();

			switch (select) {
			case 1: bc.insertBmi(); break;
			case 2: bc.updateBmi(); break;
			case 3: bc.deleteBmi(); break;
			case 4: bc.listBmi(); break;
			case 5: bc.saveBmi(); break;
			case 6: bc.loadBmi(); break;
			case 0:
				System.out.println("종료합니다.");
				System.exit(0); // 프로그램 강제 종료
			default:
				System.out.println("잘못 선택하셨습니다. 없는 번호 입니다.( 0~6번 중에서만 선택)\n");
				break;
			} // switch end
		} // while end
		
		
	} // main
} // class