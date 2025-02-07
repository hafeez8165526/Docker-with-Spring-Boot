package com.hafeez.entity;

public class Animal {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	

}
