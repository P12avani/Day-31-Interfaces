package com.codegnan.oop.interfaces;

public class SMSNotifier  implements Notification{

	@Override
	public String send(String message) {
		return "SMS:"+message;
	}
	
	

}
