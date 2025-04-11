package ex06.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("C:\\cat.jpg"); // 절대경로
		
		// 쓰기 객체 - OutputStream
		OutputStream os = new FileOutputStream("happycat.jpg");
		
		long start = System.currentTimeMillis(); // 시작 시간 저장
		byte[] buffer = new byte[1024 * 8]; //
		
		while (true) {
			int inputData = is.read(buffer); // buffer 크기 만큼 읽어들임
			if (inputData == -1) break;
			os.write(buffer, 0, inputData);
		}
		
		long end = System.currentTimeMillis(); // 끝난 시간 저장
		
		System.out.println(end - start); // 복사(작업)에 걸린 시간
		
		is.close();
		os.close();
		
		System.out.println("복사 성공");
		
		
	}
}