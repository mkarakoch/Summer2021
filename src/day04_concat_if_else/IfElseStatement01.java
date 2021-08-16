package day04_concat_if_else;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// get the length and the height of a rectangle from user, 
		//if they equal to each other 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter a side of the shape");
		double side1 = scan.nextDouble();
		
		System.out.println("enter a side2 of the shape");
		double side2 = scan.nextDouble();
		
		if (side1 == side2) {
			System.out.println("square");

		}else {
			System.out.println("rectangle");
		}
		

	}

}
