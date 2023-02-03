package com.demo.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class Employee {
	private String name;

	@Pattern(regexp = "^[a-zA-Z0-9]{3}", message = "length must be 3")
	private String pass;

	@Min(value = 18, message = "must be equal or greater than 18")
	@Max(value = 45, message = "must be equal or less than 45")
	private int age;

	public Employee() {
		super();
	}

	public Employee(String name, String pass, int age) {
		super();
		this.name = name;
		this.pass = pass;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
