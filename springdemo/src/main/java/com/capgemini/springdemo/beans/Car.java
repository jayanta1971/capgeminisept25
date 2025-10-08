package com.capgemini.springdemo.beans;

import java.util.List;

public class Car {
	
	String make;
	Engine engine;
	List<Tyre> tyres;
	
	
	public Car(String make, Engine engine, List<Tyre> tyres) {
		super();
		this.make = make;
		this.engine = engine;
		this.tyres = tyres;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Tyre> getTyres() {
		return tyres;
	}

	public void setTyres(List<Tyre> tyres) {
		this.tyres = tyres;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", engine=" + engine + ", tyres=" + tyres + "]";
	}
	 
	

}
