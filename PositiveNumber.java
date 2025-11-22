package com.codegnan.oop.interfaces;

public class PositiveNumber  implements Validator{
	
	public void isValid(int number) {
		if(number>0) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		
	}

}
