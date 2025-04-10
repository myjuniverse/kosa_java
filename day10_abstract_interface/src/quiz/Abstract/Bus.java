package quiz.Abstract;

public class Bus implements Trans {

	@Override
	public void start() {
		System.out.println("버스 출발");
	}

	@Override
	public void stop() {
		System.out.println("버스 도착");
	}

	@Override
	public void show() {
		start();
		stop();
		System.out.println("버스 운행 종료");
		
	}

	
}
