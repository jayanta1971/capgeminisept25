package com.capgemini.annodspringdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	String make;
	String fuelType;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
//	@Override
//	public String toString() {
//		return "Engine [make=" + make + ", fuelType=" + fuelType + "]";
//	}
//	
//	

}
