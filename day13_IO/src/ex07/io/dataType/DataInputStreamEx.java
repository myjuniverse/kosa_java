package ex07.io.dataType;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamEx {
	public static void main(String[] args) throws Exception {
		
		
		File file = new File("text");
		FileInputStream fis = new FileInputStream(file); // 예외발생
		DataInputStream dis = new DataInputStream(fis);
		
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		dis.close();
		fis.close();
		
		
	}
}
