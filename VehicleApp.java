package com.codegnan.oop.interfaces;

public class VehicleApp {

	public static void main(String[] args) {
		Car c1=new Fortuner();// losely coupling
		//Fortuner c1=new Fortuner();//tightly coupled (wrong approach)
		//Slavia c1=new Slavia();
		c1.accelerate(15);
		c1.accelerate(40);
		c1.accelerate(65);
		c1.accelerate(35);
		c1.accelerate(20);

		c1.turnDirection("left");
		c1.accelerate(40);
		c1.accelerate(75);
		c1.accelerate(50);
		c1.accelerate(30);
		c1.accelerate(15);
		c1.turnDirection("right");
		c1.stop();
		//c1.sunRoof();
	}

}
