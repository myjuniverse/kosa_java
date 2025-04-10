package ex10.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class FileWriterEx {
	public static void main(String[] args) throws Exception {
		
		String str, file;
		Date date = new Date();
		
		str = "파일 생성 시간: " + date + "\r\n";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 이름 입력(파일명.확장자): ");
		file = br.readLine();
		
		System.out.print("저장할 문자열: ");
		str += br.readLine();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(str);
		bw.close();
		
		System.out.println(file + " 파일 저장 성공");
		
		
	}
}