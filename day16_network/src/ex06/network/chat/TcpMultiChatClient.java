package ex06.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {
	
	public static void main(String[] args) {
		if (args.length != 1) { // 닉네임을 안썼다면
			System.out.print("Usage: java Tcp TcpMultiChatClient nickname? ");
			System.exit(0);
		}
		
		try {
			String ip = "127.0.0.1"; // "127.0.0.1" or localhost
			// 192.168.230.178
			Socket s = new Socket(ip, 7777);
			System.out.println("서버에 연결 되었습니다.");
			
			Thread sender = new Thread(new ClientSender(s, args[0]));
			Thread receiver = new Thread(new ClientReceiver(s));
			
			sender.start();
			receiver.start(); // run() method 유도
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main
	
	static class ClientSender extends Thread {
		Socket s;
		DataOutputStream dos;
		String name;
		
		public ClientSender(Socket s, String name) {
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in); // 키보드로부터 입력 받기
			try {
				if (dos != null) 
				dos.writeUTF(name);
				
				while (dos != null) 
				dos.writeUTF("[" + name + "] " + sc.nextLine());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // end ClientSender inner class
	
	static class ClientReceiver extends Thread {
		Socket s;
		DataInputStream dis;
		public ClientReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			while (dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} // end run()
	} // end ClientReceiver inner class
} // outer class