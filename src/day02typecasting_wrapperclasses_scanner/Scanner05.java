package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		/*
		 Type a program which caculates the area and the perimeter 
		 of a rectangle whose lenght and width are entered by user. 
		 Hint 1: Area of a rectangle is width x lenght
		 Hint 2: Perimeter of a rectangle is 2X (width + lenght)
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the lenght of the rectangle...");
		double lenght = scanner.nextDouble();
		
		System.out.println("Enter the with of the rectangle");
		double width = scanner.nextDouble();// double used to be able to show decimal numbers.
		
		
		System.out.println("Area:" + width*lenght);
		System.out.println("Perimeter:" + 2*(width+lenght));
				
				
	}

}
