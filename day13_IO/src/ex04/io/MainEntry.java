package ex04.io;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
import java.io.*;

public class MainEntry {
	public static void main(String[] args) throws IOException{ // 예외처리 위임
			
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.print("character input: ");
//		String str = br.readLine(); // 예외발생, 여러개의 데이터 입력 받기
//		
//		System.out.println(str);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("character input: ");
		int str1 = Integer.parseInt(br.readLine());
		System.out.print("character input: ");
		int str2 = Integer.parseInt(br.readLine());
		
		
		System.out.println(str1 + str2);
		
		
	}
}