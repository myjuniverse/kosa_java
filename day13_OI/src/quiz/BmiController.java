package quiz;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BmiController extends Bmi {
	
//	문제] 비만도 측정 프로그램 작성 - collection, file, io 이용하기
//	추가 / 삭제 / 출력 / 수정 / 저장 처리할것
//	
//	몸무게, 키를 입력 받아서  BMI 계산하기
//	BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) ); 
//	
//	남 : (신장cm - 100) X 0.9
//	여 : (신장cm - 100) X 0.85
//	-
//	판정>
//	18.5 미만 저체중
//	18.5 ~ 22.9  정상
//	23.0 ~ 24.9  과체중
//	25.0  이상 비만 
//	
//	결과] 
//	이도연님 저체중이시네요. 살 좀 찝시다.
//	OOO님 과체중이십니다. 그만 먹자!
//	XXX님 정상이시네요. 유지하세요!!
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Bmi> arrList = new ArrayList<Bmi>();
	
	public void calBmi() {
		bmiCal = weight / ((height / 100.0) * (height / 100.0));
	}

	public void insertBmi() {
		
		System.out.print("이름: ");
		name = sc.nextLine();
		
		System.out.print("키: ");
		height = sc.nextInt();
		sc.nextLine();
		
		System.out.print("몸무게: ");
		weight = sc.nextInt();
		sc.nextLine();
		
		calBmi();
		
		arrList.add(new Bmi(name, height, weight, bmiCal));
		System.out.println("회원 정보가 추가되었습니다.");
	}

	public void updateBmi() {
		
		if(arrList.size() == 0) {
			System.out.println("---------------------------------------------");
			System.out.println("\t    등록된 회원이 없습니다.");
			System.out.println("---------------------------------------------\n");
			 return;
		}
		
		listBmi();
		
		System.out.print("수정할 회원의 번호를 입력하세요: ");
		int n = sc.nextInt();
		
		if (n < 0 || n >= arrList.size()) {
            System.out.println("잘못된 번호입니다.\n");
            return;
        }
		
		// 항목별 수정기능
		System.out.print("수정하고 싶은 항목을 선택해주세요(1. 이름 / 2. 키 / 3. 몸무게): ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 수정하는 방법이.. 흠..
		switch (num) {
		case 1:
			System.out.print("이름: ");
			name = sc.nextLine();
			
			Bmi b = arrList.get(0); 
			b.setName(name);               
		case 2:
			System.out.print("키: ");
			height = sc.nextInt();
			sc.nextLine();
			calBmi();
			
			b = arrList.get(1); 
			b.setName(name);
		case 3:
			System.out.print("몸무게: ");
			weight = sc.nextInt();
			sc.nextLine();
			calBmi();
		default:
			
		}
		
		for (int i = 0; i < arrList.size(); i++) {
			Bmi bmi = arrList.get(i);
			if (n == i) {
				arrList.set(i, new Bmi(name, height, weight, bmiCal));
			}
		}
		System.out.println("회원 정보가 수정되었습니다.\n");
		
	}

	public void deleteBmi() {
		
		if(arrList.size() == 0) {
			System.out.println("---------------------------------------------");
			System.out.println("\t    등록된 회원이 없습니다.");
			System.out.println("---------------------------------------------\n");
			 return;
		}
	
		listBmi();
		
		System.out.print("삭제할 회원의 번호를 입력하세요: ");
		int n = sc.nextInt();
		
		if (n < 0 || n >= arrList.size()) {
            System.out.println("잘못된 번호입니다.\n");
            return;
        }
		arrList.remove(n);
		System.out.println("회원 정보가 삭제되었습니다.\n");
	}

	public void listBmi() {
		
		System.out.println("\n[회원 정보]");
		System.out.println("---------------------------------------------");

		if (arrList.isEmpty()) {
		    System.out.println("\t    등록된 회원이 없습니다.");
		    System.out.println("---------------------------------------------\n");
		    return;
		}

		for (int i = 0; i < arrList.size(); i++) {
		    Bmi b = arrList.get(i);
		    String result = "";

		    if (b.getBmiCal() < 18.5) result = "저체중";
		    else if (b.getBmiCal() <= 22.9) result = "정상";
		    else if (b.getBmiCal() <= 24.9) result = "과체중";
		    else result = "비만";

		    System.out.println("  " + i + "  " + b.getName() + "  " + b.getHeight() + "cm  "
		            + b.getWeight() + "kg  " + "bmi: " + String.format("%.2f", b.getBmiCal()) + "  " + result);
		    
//		    System.out.printf("%-3s %-6s %-6s %-6s %-8s %s\n", "No", "이름", "키", "몸무게", "BMI", "상태");
//		    System.out.println("----------------------------------------------------");
//
//		    for (int i = 0; i < arrList.size(); i++) {
//		        Bmi b = arrList.get(i);
//		        String result = "";
//
//		        if (b.getBmiCal() < 18.5) result = "저체중";
//		        else if (b.getBmiCal() <= 22.9) result = "정상";
//		        else if (b.getBmiCal() <= 24.9) result = "과체중";
//		        else result = "비만";
//
//		        System.out.printf("%-3d %-6s %-6d %-6d %-8.2f %s\n",
//		            i, b.getName(), b.getHeight(), b.getWeight(), b.getBmiCal(), result);
//		    }
		    
		} // end for
		System.out.println("---------------------------------------------\n");
		


	}

	public void saveBmi() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos = null;
		File f = new File("bmi.txt");
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			
			for (Bmi b : arrList) {
				name = b.getName();
				height = b.getHeight();
				weight = b.getWeight();
				bmiCal = b.getBmiCal();
				
				oos.writeObject(name);
				oos.writeObject(height);
				oos.writeObject(weight);
				oos.writeObject(bmiCal);
			}
			
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			oos.close();
		}
		
	}

	public void loadBmi() throws IOException {
		File f = new File("bmi.txt");
		FileInputStream fis = null;
		ObjectInputStream bis = null;
		boolean con = true;
		
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);
			
			System.out.println("\n[회원 정보]");
			System.out.println("---------------------------------------------");
			
			while (con) {
				name = (String) bis.readObject();
				height = (int) bis.readObject();
				weight = (int) bis.readObject();
				bmiCal = (double) bis.readObject();
				
				System.out.println("  " + name + "  " + height + "cm  "
			            + weight + "kg  " + "bmi: " + String.format("%.2f", bmiCal));	
			}
			
		} catch (Exception e) {
			System.out.println("---------------------------------------------\n");
//			e.printStackTrace();
		} finally {
			bis.close();
		}
		
	}
	
	
	
	
	
	
	
} // class