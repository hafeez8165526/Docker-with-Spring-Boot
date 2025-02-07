package com.hafeez.dto;

//@C(collection = )
public class employee {
//	@Id
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public employee(String name) {
		super();
		this.name = name;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "employee [name=" + name + "]";
	}
	
	
}
