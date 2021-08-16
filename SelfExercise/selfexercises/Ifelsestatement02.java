package selfexercises;

import java.util.Scanner;

public class Ifelsestatement02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter a side1 of the shape");
		double side1 = scan.nextDouble();
		
		
		
		System.out.println("enter a side2 of the shape");
		double side2 = scan.nextDouble();
		
		if(side1 < 0 || side2 <0) {
			System.out.println("Error");
		}

		
		if (side1 == side2) {
			System.out.println("It is square");
		}else if (side1 != side2) {
			System.out.println("It is retangle");
		}
		
		

	}

}
