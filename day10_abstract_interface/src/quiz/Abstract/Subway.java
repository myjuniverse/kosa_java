package quiz.Abstract;

public class Subway implements Trans {

	@Override
	public void start() {
		System.out.println("지하철 출발");
	}

	@Override
	public void stop() {
		System.out.println("지하철 도착");
	}

	@Override
	public void show() {
		start();
		stop();
		System.out.println("지하철 운행 종료");
	}



}
