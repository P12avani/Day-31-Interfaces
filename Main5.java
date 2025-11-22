package com.codegnan.oop.interfaces;
import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double length=scanner.nextDouble();
		double width=scanner.nextDouble();
		Rectangle r=new Rectangle(length,width);
		System.out.printf("Area:%.2f",r.area());
		System.out.println();
		System.out.printf("Perimeter:%.2f",r.perimeter());
		

	}

}
