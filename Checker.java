package com.codegnan.oop.interfaces;
import java.util.Scanner;
public class Checker {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter password:");
		String password=scanner.next();
		PasswordChecker pc=new SimplePasswordChecker();
		System.out.println(pc.checkLength(password));
		System.out.println(pc.checkComplexity(password));
		scanner.close();
		

	}

}
