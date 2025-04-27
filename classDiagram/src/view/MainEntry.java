package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ProductController;
import model.vo.Product;

public class MainEntry {
	private Scanner sc = new Scanner(System.in);
	private ProductController pc = new ProductController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("=====================");
			System.out.println("1. 상품 리스트");
			System.out.println("2. 상품 주문");
			System.out.println("3. 상품 수정");
			System.out.println("4. 상품 삭제");
			System.out.println("0. 종료");
			System.out.println("=====================");
			
			int mainMenu = sc.nextInt();
			sc.nextLine();
			
			switch(mainMenu) {
			case 1: pc.productList(); break;
			case 2: pc.insertProduct(new Product()); break; // 수정 필요
			case 3: pc.updateProduct(null, null, mainMenu); break; // 수정 필요
			case 4: pc.deleteProduct(null); break; // 수정 필요
			case 0: System.out.println("종료합니다."); System.exit(0);
			default: System.out.println("다시 입력해주세요."); break;
			}
		
		} // while
	} // mainMenu()
	
	//-------------------- 응답화면 --------------------
		public void displaySuccess(String message) {
			System.out.println(message);
		}

		public void displayFail(String message) {
			System.out.println("\n서비스 요청 실패 : " + message);
		}
		
		public void displayNoData(String message) {
			System.out.println("\n" + message);
		}

		public void displaypList(ArrayList<Product> plist) {
			System.out.println("========== 상품 목록 ==========");
			System.out.println("상품코드 \t상품명 \t\t가격");
			
			for (Product p : plist) {
				System.out.println(p);
			}
		}
	
} // MainEntry
