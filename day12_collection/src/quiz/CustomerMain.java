package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 고객추가(add) 고객삭제 (remove) 고객리스트출력(for enum...), 고객수정(set) 프로그램 종료(0)
		
		Customer c = new Customer();
		ArrayList list = new ArrayList<>(3);
		int no;
		String name = null;
		String address = null;
		String phone = null;
		boolean tf = true;
		
		while(tf) {
			System.out.print("\n번호를 선택해주세요\n");
			System.out.print("1.고객추가 / 2.고객삭제 / 3.고객수정 / 4.고객리스트출력 / 0.프로그램종료: ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				// 추가
				System.out.print("추가 고객번호: ");
				no = sc.nextInt();
				System.out.print("추가 고객이름: ");
				name = sc.next();
				System.out.print("추가 고객주소: ");
				address = sc.next();
				System.out.print("추가 고객번호: ");
				phone = sc.next();
				
				list.add(new Customer(no, name, address, phone));
				break;
			case 2:
				// 삭제
				if(list.size() == 0) {
					System.out.println("고객리스트가 비어있습니다.");
					break;
				}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				System.out.print("삭제할 고객 번호: ");
				no = sc.nextInt();
				
				
				for (int i = 0; i < list.size(); i++) {
				    c = (Customer) list.get(i);  // 다운캐스팅 필요 (제네릭 안 썼으니까)
				    if (c.no == no) {
				    	list.remove(i);
				    }
				}
				break;
			case 3:
				// 수정
				if(list.size() == 0) {
					System.out.println("고객리스트가 비어있습니다.");
					break;
				}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				System.out.print("수정 고객번호: ");
				no = sc.nextInt();
				System.out.print("수정 고객이름: ");
				name = sc.next();
				System.out.print("수정 고객주소: ");
				address = sc.next();
				System.out.print("수정 고객번호: ");
				phone = sc.next();
				
				for (int i = 0; i < list.size(); i++) {
				    c = (Customer) list.get(i);  // 다운캐스팅 필요 (제네릭 안 썼으니까)
				    if (c.no == no) {
				    	list.set(i, new Customer(c.no, name, address, phone));
				    }
				}
				break;
			case 4:
				// 리스트출력
				if(list.size() == 0) {
					System.out.println("고객리스트가 비어있습니다.");
					break;
				} else {
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
				}
				break;
			case 0:
				System.out.println("종료합니다.");
				tf = false;
				break;
			default:
				tf = false;
				break;
			} // end switch
		} // end while
		
		
		
	} // main
}