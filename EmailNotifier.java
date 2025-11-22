package com.codegnan.oop.interfaces;

public class EmailNotifier  implements Notification{

	@Override
	public String send( String message) {
		return "Email:"+ message;
	}
	
	

}
