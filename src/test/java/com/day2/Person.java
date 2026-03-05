package com.day2;


public class Person {
	private String name;

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public Person() {
		super();

	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(Person other) {
		this.name = other.name;
	}

}
