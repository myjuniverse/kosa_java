package ex03.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://career.sw.or.kr/");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String inputLine;
		while ((inputLine = br.readLine()) != null) {
			System.out.println(inputLine);
		}
		
		br.close();
	}
}
