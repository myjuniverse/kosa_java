package quiz.Abstract;

public interface Trans {
//	추상메서드 start() / stop()
//	input을 추상클래스 메서드
//	부모는 모든 자손에게 상속할 수 있는 최소한의 것
	
	String str = "안녕히가세요\n";
	
	public void start();
	public void stop();
//	public void input();
	
	public void show();
//	abstract 생략가능
}
