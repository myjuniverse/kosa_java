package ex02.datatype;

public class DataType {
	public static void main(String[] args) {
		
		String str = "A"; // 문자열, ""(쌍따옴표) 안에 가져야함, 2byte
		char ch = 'A'; // 문자, '' 안에 가져야함, 1byte
		char ch2 = 67; // 아스키코드값으로 입력 가능
		char ch3 = 'b';
		
		int a = 10; String name = "Jun"; double d = 12.34;
		
		System.out.println(str);
		System.out.println(ch);
		System.out.println((int)ch); // ASCII 65 
		
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		System.out.println(ch2 + ch3);
		
		System.out.println("name : " + name);
		System.out.println("실수형 데이터 : " + d);
		
		System.out.println("\n\n--------------------------");
		for(int i = 65; i <= 90; i++) {
			System.out.print((char)i + " ");	
		}
		
		System.out.println("\n\n--------------------------");
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print((char)i + "\t");	
		}
		
		System.out.println("\n\\nboolean type");
		boolean flag = true;
		// int b = flag; // error
		System.out.println(flag);
		
		
	}
}
