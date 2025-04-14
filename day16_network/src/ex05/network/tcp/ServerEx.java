package ex05.network.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("server 연결됨");
		
		
		try {
			ss = new ServerSocket(9999);
			s = ss.accept(); // 응답대기, 클라이언트 소켓
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream())); // 네트워크 통해서 데이터 읽어옴
			// 키보드로부터 입력 스트림
			stin = new BufferedReader(new InputStreamReader(System.in));
						
			// 클라이언트 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = br.readLine(); // 클라이언트에서 한행의 문자열 읽음
				// 클라이언트가 "exit" 보내면 연결종료
				if (inputMessage.equalsIgnoreCase("exit")) break; 
					
				System.out.println(inputMessage);
					
				String outputMessage = stin.readLine(); // 키보드에서 한 행의 문자열 읽음
				// 키보드에서 읽은 문자열 전송
				bw.write(s.getInetAddress() + " 서버 " + outputMessage + "\n");
				bw.flush();	
				
			} // end while
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} finally {
			try {
				s.close(); // 클라이언트 소켓 종료
//				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
