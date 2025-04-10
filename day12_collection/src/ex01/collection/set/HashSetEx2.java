package ex01.collection.set;

import java.util.HashSet;
import java.util.Set;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Person) { //  
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age; // 동명이인 && 나이도 같음
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age; // 나이까지 더해서 주소값을 다르게 설정
	}
	
} // Person class

public class HashSetEx2 {
	public static void main(String[] args) {
		Set set = new HashSet<>();
		set.add(new Person("kim", 90));
		set.add(new Person("kim", 90));
		set.add(new Person("park", 14));
		set.add(new Person("park", 56));
		set.add(new Person("park", 33)); // 중복되어나옴
		
		set.add(new String("java"));
		set.add(new String("java")); // 중복X
		
		System.out.println(set);
		
		
//		Person p = new Person("jun", 50);
//		System.out.println(p);		
		
	}
}