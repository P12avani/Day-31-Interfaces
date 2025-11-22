package com.codegnan.oop.interfaces;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		scanner.nextLine(); // Read and ignore input

        Cars car = new Cars();
		System.out.println(car.move());
    }


	}


