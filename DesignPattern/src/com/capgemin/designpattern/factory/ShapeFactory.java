package com.capgemin.designpattern.factory;

public class ShapeFactory {

	
	public Shape getShape(String type)
	{
		
		if(type.equalsIgnoreCase("C"))
		{
			return new Circle();
		}
		else if(type.equalsIgnoreCase("R"))
		{
			return new Rectangle();
		}
		else {
			return null;
		}
	}
	
}
