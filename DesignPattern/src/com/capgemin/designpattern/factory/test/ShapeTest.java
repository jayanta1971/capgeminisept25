package com.capgemin.designpattern.factory.test;

import com.capgemin.designpattern.factory.Circle;
import com.capgemin.designpattern.factory.Rectangle;
import com.capgemin.designpattern.factory.*;
public class ShapeTest {

	public static void main(String[] args) {
		 
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape=shapeFactory.getShape("R");
		shape.draw();
	}

}
