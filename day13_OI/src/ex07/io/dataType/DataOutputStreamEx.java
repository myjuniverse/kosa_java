package ex07.io.dataType;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	public static void main(String[] args) throws IOException {
		
		File file = new File("text");
		FileOutputStream fos = new FileOutputStream(file); // 예외발생
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65); // 'A'
		dos.writeShort(100);
		dos.writeInt(50000);
		dos.writeLong(222222222);
		dos.writeFloat(12.45f);
		dos.writeDouble(9.9);
		dos.flush(); // buffer 비움
		
		System.out.println("text.txt 파일에 " + dos.size() + "byte save");
	
		
		
	}
}