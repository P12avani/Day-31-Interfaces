package com.codegnan.oop.interfaces;

public class Square implements MathOperation {
	
	public int operate(int x) {
		int square=x*x;
		return square;
	}

}
