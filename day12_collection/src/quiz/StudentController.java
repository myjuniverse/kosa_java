package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController extends Student {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Student> stdList = new ArrayList<Student>(); 
	
	public StudentController() { }
	
	// 입력
	public void input() {
		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("주소: ");
		address = sc.nextLine();
		System.out.print("번호: ");
		phone = sc.nextLine();
		
		stdList.add(new Student(name, address, phone));
		System.out.println("학생 정보가 추가되었습니다.\n");
	}
	
	// 수정
	public void update() {
		
		// 등록된 학생이 없을때
		if(stdList.size() == 0) {
			System.out.println("---------------------------------------------");
			System.out.println("\t    등록된 학생이 없습니다.");
			System.out.println("---------------------------------------------\n");
			 return;
		}
		
		// 등록된 학생이 있을때
		view();
		
		System.out.print("수정할 학생의 번호를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		if (n < 0 || n >= stdList.size()) {
            System.out.println("잘못된 번호입니다.\n");
            return;
        }
		
		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("주소: ");
		address = sc.nextLine();
		System.out.print("번호: ");
		phone = sc.nextLine();
		
//		Student s = stdList.get(n);
//        s.setName(name);
//        s.setAddress(address);
//        s.setPhone(phone);
		
		for (int i = 0; i < stdList.size(); i++) {
		    Student std = (Student) stdList.get(i);
		    if (n == i) {
		    	stdList.set(i, new Student(name, address, phone));
		    }
		} // end for	
        
        System.out.println("학생 정보가 수정되었습니다.\n");
	}
	
	// 삭제
	public void delete() {
		
		// 등록된 학생이 없을때
		if(stdList.size() == 0) {
			System.out.println("---------------------------------------------");
			System.out.println("\t    등록된 학생이 없습니다.");
			System.out.println("---------------------------------------------\n");
			 return;
		}
		
		// 등록된 학생이 있을때
		view();
		
		System.out.print("삭제할 학생의 번호를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		if (n < 0 || n >= stdList.size()) {
            System.out.println("잘못된 번호입니다.\n");
            return;
        }

        stdList.remove(n);
        System.out.println("학생 정보가 삭제되었습니다.\n");
	}
	
	// 리스트 출력
	public void view() {
		System.out.println("\n[학생 정보]");
		System.out.println("---------------------------------------------");
		
		if(stdList.size() == 0) {
			System.out.println("\t    등록된 학생이 없습니다.");
			System.out.println("---------------------------------------------\n");
			 return;
		}
		
		for (int i = 0; i < stdList.size(); i++) {
			Student std = stdList.get(i);
			System.out.println("  " + i + "   " + std.name + "    "
					+ std.address + "     " + std.phone);
		}
		System.out.println("---------------------------------------------\n");
		
		
	}
	
}