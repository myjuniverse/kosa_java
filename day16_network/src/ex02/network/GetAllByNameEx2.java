package ex02.network;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx2 {
	public static void main(String[] args) throws UnknownHostException { // 예외위임
		
		InetAddress address = InetAddress.getLocalHost();
		
		System.out.println("로컬 호스트 이름: " + address.getHostName());
		System.out.println("로컬 호스트 IP주소: " + address.getHostAddress());
		
		address = Inet6Address.getByName("www.sw.or.kr");
		System.out.println("로컬 호스트 이름: " + address.getHostName());
		System.out.println("로컬 호스트 IP주소: " + address.getHostAddress());
		
		byte[] addr = new byte[4];
		addr[0] = (byte)192;
		addr[1] = (byte)156;
		addr[2] = (byte)255;
		addr[3] = (byte)144;
		
		address = Inet6Address.getByAddress(addr);
		System.out.println("로컬 호스트 이름: " + address.getHostName());
		System.out.println("로컬 호스트 이름: " + address.getCanonicalHostName());
		System.out.println("로컬 호스트 IP주소: " + address.getHostAddress());
		
		InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
		for (InetAddress item : arr) {
			System.out.println("로컬 호스트 이름: " + item.getHostName());
			System.out.println("로컬 호스트 IP주소: " + item.getHostAddress());
		}
		
		
		
		
	}
}
