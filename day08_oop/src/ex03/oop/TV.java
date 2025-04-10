package ex03.oop;

public class TV {
	String color;
	String channel;

	public TV(String color, String channel) {
		super();
		this.color = color;
		this.channel = channel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "TV 색상: " + color + "\tTV 채널: " + channel;
	}

}
