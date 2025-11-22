package com.codegnan.oop.interfaces;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		PositiveNumber pn=new PositiveNumber();
		pn.isValid(number);

	}

}
