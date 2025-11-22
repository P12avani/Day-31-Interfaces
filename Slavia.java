package com.codegnan.oop.interfaces;

public class Slavia implements Car {


@Override
public void accelerate(int points) {
if(points<=100&&points>=10)	{
	System.out.println("Slavia Speed is:" +points);
}
	
}

@Override
public void turnDirection(String dir) {
	if(dir.equalsIgnoreCase("left")) {
		System.out.println("Slavia is turning left");
	}if(dir.equalsIgnoreCase("right")) {
		System.out.println("Slavia is turning right");
	}
	
}

@Override
public void stop() {	
	System.out.println("Slavia has stopped");
}
public void sunRoof() {
	System.out.println("sunRoof is opened");
}


}
