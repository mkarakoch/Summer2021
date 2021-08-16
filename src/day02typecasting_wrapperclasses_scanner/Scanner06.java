package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and the prism 
		 whose length, width, and height are entered by user. 
		 Hint 1: Volume of a rectangular prism is width  x length x height
		
		 */

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the width, lenght, and height...");
		double w = scanner.nextDouble();
		double l = scanner.nextDouble();
		double h = scanner.nextDouble();
		
		System.out.println("Volume: " + w*l*h);
	}

}
