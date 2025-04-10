package ex02.oop;

public class Person {

	String name;
	int age;
	String phone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void display() {
		System.out.println(getName() + " " + getAge() + " " + getPhone());
	}

}
