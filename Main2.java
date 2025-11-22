package com.codegnan.oop.interfaces;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		BasicCalculator bc=new BasicCalculator();
		System.out.println(bc.add(a, b));

	}

}
