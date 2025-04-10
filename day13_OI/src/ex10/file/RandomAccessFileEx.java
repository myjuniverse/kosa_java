package ex10.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws Exception {
		
		// rw - employee.txt 파일이 없다면 생성하면서 기재하고, 있으면 기존 파일에 기재
		RandomAccessFile raf = new RandomAccessFile("employee.txt", "rw");
		
		for (int i = 0; i <= 100; i++) {
			raf.seek(i * 100);
			String str = "hello";
			raf.writeUTF(str);
			
		}
		
		for (int i = 0; i <= 100; i++) {
			raf.seek(i * 100);
			System.out.println(raf.readUTF());
		}
		
		System.out.println("string print success");
		raf.close();
		
	} // main
}