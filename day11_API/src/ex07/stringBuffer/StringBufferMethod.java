package ex07.stringBuffer;

public class StringBufferMethod {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil"); // 문자열 끝에 추가
		System.out.println(sb); // This is pencil
//		System.out.println(sb.reverse()); // licnep si sihT (반대로)
		/* 1. --------------------------------- */
		sb.insert(7, " my"); // 문자열 중간에 삽입 insert(위치, "넣을문자")
		System.out.println(sb);
		/* 2. --------------------------------- */
		sb.replace(8, 10, "your"); // 문자열 변경 replace(시작, 끝, "넣을문자")
		System.out.println("2" + sb);
		System.out.println(sb.capacity()); // 20
		/* 3. --------------------------------- */
		// 
		System.out.print("3");
		System.out.println(sb.indexOf("your"));
		System.out.println(sb.indexOf("s"));
		System.out.println(sb.lastIndexOf("s")); // 뒤에서 부터 센다
		/* 4. --------------------------------- */
		sb.delete(0, 5); // 0-5번째까지 삭제
		System.out.println("4" + sb);
		/* 5. --------------------------------- */
		sb.setLength(5); // 0-5번째까지 잡음
		System.out.println("5" + sb);
		System.out.println(sb.capacity()); // 20 (유지)
		
		
		
		
		
	}
}