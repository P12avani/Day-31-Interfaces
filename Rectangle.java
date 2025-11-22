package com.codegnan.oop.interfaces;

public class Rectangle  implements ShapeCalculator{
	double length;
	double width;
	 Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	 }
	@Override
	public double area() {
		return length*width;	
		
	}

	@Override
	public double perimeter() {
		return 2*(length+width);
	}
	

}
