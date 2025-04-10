package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

// List: 순서 O, 중복 O
public class VectorEx2 {
	public static void main(String[] args) {
	
		int i;
		Date date = new Date();
		Vector v = new Vector(3, 5); // (초기용량=3, 증가용량=5)
		
		// 꺼내올때 형변환 필요
		v.addElement("자바"); // string
		v.addElement(new Double(10.2)); // double
		v.addElement(date); // object(객체)
		
		System.out.println("-----------3개 객체 추가-----------");
		System.out.println("size: " + v.size() + " capacity: " + v.capacity()); // 3 3
		
		for (i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
		
		System.out.println("-----------10개 객체 추가-----------");
		System.out.println("size: " + v.size() + " capacity: " + v.capacity()); // 13 13
		
		
		System.out.println("-----------Vector 내용 출력-----------");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) { // 요소가 있니
			System.out.print(enu.nextElement() + " "); // 대괄호 없이 값만 출력
			// 출력: 자바 10.2 Fri Apr 04 10:27:08 KST 2025 0 1 2 3 4 5 6 7 8 9
		}
		
		System.out.println("-----------객체 내용 포함 확인-----------");
		if (v.contains("자바")) { // "자바" 가 있니
			System.out.println("자바 문자열 포함되어있음");
		} else {
			System.out.println("자바 미포함");
		}
		
		System.out.println("10.2 객체 위치: " + v.indexOf(10.2)); // 10.2 객체 위치: 1
		System.out.println("입력 시간: " + date);
		System.out.println();
		System.out.println(v.get(v.indexOf(date))); // Fri Apr 04 10:32:53 KST 2025
		System.out.println(v.get(2)); 
		
		// date object delete
		v.removeElementAt(v.indexOf(date));
		System.out.println("-----------------------");
		System.out.println("size: " + v.size() + " capacity: " + v.capacity()); // 12 13
		System.out.println(v); // [자바, 10.2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		for(i = 0; i < v.size(); i++) {
//			v.removeElementAt(i);
//			v.remove(i); // 인덱스 번호
			v.remove(10.2); // 해당 요소 이름 데이터 삭제
//			v.remove("자바");
//			v.removeAllElements(); // [], size: 0
			
		}
		System.out.println("-----------------------");
		System.out.println("size: " + v.size() + " capacity: " + v.capacity()); // 6 13
		System.out.println(v); // [10.2, 1, 3, 5, 7, 9] 지워지면서 앞으로 댕겨짐
		
		System.out.println("-----------------------");
		v.setElementAt("java", 3);
		System.out.println(v); // [자바, 0, 1, java, 3, 4, 5, 6, 7, 8, 9]
		
		v.trimToSize();
		System.out.println("size: " + v.size() + " capacity: " + v.capacity()); // 11 11
		
		v.setSize(2); // 크기를 강제로 2로 조정
		System.out.println(v); // [자바, 0]
		System.out.println("size: " + v.size() + " capacity: " + v.capacity()); // 2 11
		
		
		
		
		
		
	}
}