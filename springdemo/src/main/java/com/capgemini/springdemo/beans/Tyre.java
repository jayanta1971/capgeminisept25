package com.capgemini.springdemo.beans;

public class Tyre {
	
	String make;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Tyre [make=" + make + "]";
	}
	
	

}
