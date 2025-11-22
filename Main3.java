package com.codegnan.oop.interfaces;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		Square s=new Square();
		System.out.println(s.operate(x));

	}

}
