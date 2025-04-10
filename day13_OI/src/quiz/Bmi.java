package quiz;

public class Bmi {
//	이름/성별/키/몸무게/BMI지수 받을 변수
	String name;
//	char gender;
	int height;
	int weight;
	double bmiCal;
	
	public Bmi() { }
	
	public Bmi(String name, int height, int weight, double bmiCal) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmiCal = bmiCal;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public char getGender() {
//		return gender;
//	}
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getBmiCal() {
		return bmiCal;
	}
	public void setBmiCal(double bmiCal) {
		this.bmiCal = bmiCal;
	}
	
	@Override
	public String toString() {
		return "Bmi [name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + bmiCal
				+ "]";
	}
	
}