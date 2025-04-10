package ex06.string;

public class MainEntry {
	public static void main(String[] args) {
		
		int x = 45;
		String str = "good";
		System.out.println("str: " + str);
		
		char data[] = {'a', 'b', 'c'};
		str = new String(data);
		System.out.println("str: " + str);
		
		String msg = "cdefghi";
		System.out.println("Korea" + msg); // Koreacdefghi
		
		String str2 = "abcdef".substring(2);
		System.out.println(str2); // cdef
		
		str2 = "abcdefghijk1123".substring(2, 5); // 상한값 포함, 하한값 미포함
		System.out.println(str2); // cde
		
		
		
		
	}
}
