package com.springcore.constructorInjection;

public class Certi {
	 String certiName;

	public Certi(String certiName) {
		super();
		this.certiName = certiName;
	}

	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Certi [certiName=" + certiName + "]";
	}

}
