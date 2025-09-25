package com.capgemin.designpattern.factory;

public class Circle implements Shape {
    
	double radius;
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}
	
	

}
