package com.springcore.annotationbasedconfig.beans;

import org.springframework.beans.factory.annotation.Value;

//No need of @Component annotation here as we are creating bean in the config java file.
public class Teacher {
	@Value(value = "20")
	private int id;
	@Value("Rohan")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}

}
