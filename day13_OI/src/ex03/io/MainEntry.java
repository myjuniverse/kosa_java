package ex03.io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) 
					throws IOException { // 예외처리 위임 -JVM

//		try {
			InputStream is = System.in; // 표준입력
			System.out.print("단일 문자 입력: ");
			
			int su = is.read()-48; // 예외발생 '0'~'9': 48~57 (ASCII code)
//			System.out.println((char)su);
			is.read();
			is.read();
			int su2 = is.read()-48;
			
			
			System.out.println(su + su2);	
			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}
}