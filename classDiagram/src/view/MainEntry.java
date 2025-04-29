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
			System.out.println("=======================");
			System.out.println("1. 상품 리스트");
			System.out.println("2. 상품 추가");
			System.out.println("3. 상품 수정");
			System.out.println("4. 상품 삭제");
			System.out.println("0. 종료");
			System.out.println("=======================");
			
			int mainMenu = sc.nextInt();
			sc.nextLine();
			
			switch(mainMenu) {
			case 1: pc.productList(); break;
			case 2: // 상품 추가
			    System.out.print("추가할 상품 코드 입력: ");
			    int pCode = sc.nextInt();
			    sc.nextLine();
			    
			    System.out.print("추가할 상품명 입력: ");
			    String pName = sc.nextLine();
			    
			    System.out.print("추가할 상품 가격 입력: ");
			    int pPrice = sc.nextInt();
			    sc.nextLine(); // 버퍼 클리어

			    pc.insertProduct(new Product(pCode, pName, pPrice));
			    break;
			case 3: // 상품 수정
			    System.out.print("수정할 상품 코드 입력: ");
			    int updateCode = sc.nextInt();
			    sc.nextLine();
			    
			    System.out.print("새 상품명 입력: ");
			    String updateName = sc.nextLine();
			    
			    System.out.print("새 가격 입력: ");
			    int updatePrice = sc.nextInt();
			    sc.nextLine();
			    
			    pc.updateProduct(updateCode, updateName, updatePrice);
			    break;

			case 4: // 상품 삭제
			    System.out.print("삭제할 상품 코드 입력: ");
			    int deleteCode = sc.nextInt();
			    sc.nextLine();
			    
			    pc.deleteProduct(deleteCode);
			    break;
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
			System.out.println("======= 상품 목록 =======");
			System.out.println("상품코드 \t상품명 \t가격");
			
			for (Product p : plist) {
				System.out.println(p);
			}
		}
	
} // MainEntry
