package com.capgemin.designpattern.factory;

public class Rectangle implements Shape {

	double length;
	double breadth;
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}
	

}
