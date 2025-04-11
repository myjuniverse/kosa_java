package ex04.network.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest { // Socket 1개 필요
	public static void main(String[] args) {
		
		Socket s = null;
		
		try {
			s = new Socket("192.168.230.23", 9000); // server ip & port number
			// I		/		O
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			
			System.out.print("보낼 문자열 입력: ");
			String str = new Scanner(System.in).nextLine();
//			String str = "안녕하세요 server";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}