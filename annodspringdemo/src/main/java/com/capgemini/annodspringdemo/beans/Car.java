package com.capgemini.annodspringdemo.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	String make;
	
	
	Engine engine;
	
 
	List<Tyre> tyres;
	
	 

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	@Autowired 
//	public Car(Engine engine) {
//		super();
//		this.make = "Hyundai";
//		this.engine = engine;
//	}



	public String getMake() {
		return make;
	}

	public Car(Engine engine, List<Tyre> tyres) {
		super();
		this.engine = engine;
		this.tyres = tyres;
	}


	public void setMake(String make) {
		this.make = make;
	}
	public Engine getEngine() {
		return engine;
	}
	@Autowired 
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	
	public List<Tyre> getTyres() {
		return tyres;
	}

	@Autowired 
	public void setTyres(List<Tyre> tyres) {
		this.tyres = tyres;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", engine=" + engine + ", tyres=" + tyres + "]";
	}


 
	 
	

}
