package ex06.fileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
			
		File src = new File("C:\\Windows\\hh.exe");
		File dist = new File("C:\\MSA_th2\\1_Java\\Data\\hhCopy.dat");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int cnt;
		
		try {
			fis = new FileInputStream(src); // 파일입력 바이트스트림 연결
			fos = new FileOutputStream(dist); // 파일출력 바이트스르림 연결
			bis = new BufferedInputStream(fis); // 버퍼 입력스트림 연결
			bos = new BufferedOutputStream(fos); // 버퍼 출력스트림 연결
			
			while ((cnt = bis.read()) != -1) {
				bos.write((char)cnt);
					
			}
			System.out.println("파일 복사 성공");
			
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일복사 오류 발생");
//			e.printStackTrace();
		}
		
		
		
		
		
	}
}