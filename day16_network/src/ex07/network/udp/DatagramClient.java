package ex07.network.udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		int port = 5000;
		String str;
		byte[] buffer = null;
		
		try {
			System.out.println("-- UDP File Client --");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("전송 대상(Server IP): ");
			String ipAddress = br.readLine(); // 192.168.230.178
			System.out.print("전송 파일(파일명.확장자): ");
			String fileName = br.readLine(); // test.txt
			
			File file = new File(fileName);
			
			if (!file.exists()) { // 파일 객체가 없다면
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(0);
			}
			str = "start";
			buffer = str.getBytes();
			ds = new DatagramSocket();
			InetAddress addr = InetAddress.getByName(ipAddress); // 문자열(192.13~)로 들어온거를 ip 주소로 바꿔서 넣겠다
			dp = new DatagramPacket(buffer, buffer.length, addr, port); 
			ds.send(dp); // 송신
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			buffer = new byte[65536];
			
			while (true) {
				int count = dis.read(buffer, 0, buffer.length);
				
				if (count == -1) break;
				dp = new DatagramPacket(buffer, count, addr, port);
				ds.send(dp);
			}
			str = "end";
			buffer = str.getBytes();
			
			dp = new DatagramPacket(buffer, buffer.length, addr, port);
			ds.send(dp);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}