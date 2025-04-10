package ex07.stringBuffer;

public class MainEntry {
	public static void main(String[] args) {
			
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode()); // 10진수형태의 주소, 주소는 같다
					
		System.out.println("length / capacity");
		System.out.println(sb.length() + " / " + sb.capacity());
		
		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + " " + size);
		/* --------------------------------- */
		sb.append("msa 2차");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + " " + size);
		/* --------------------------------- */
		sb.append("javajdksqlkkk"); // 16*2+2(null문자)
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + " " + size);
		/* --------------------------------- */
		sb.append("1234 577 한글 23414"); // 34*2+2
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + " " + size);
		/* --------------------------------- */
		sb.trimToSize(); // 용량 크기 조절
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + " " + size); // 출력: 36 36
		

		
	}
}