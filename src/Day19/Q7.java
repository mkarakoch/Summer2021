package Day19;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
	/*	* ask the user about one side of the square
		 * find the area and perimeter of the square
		 * print on the console
*/
		
		
		Scanner scan = new Scanner  (System.in);
		System.out.println("Please enter one side of the square");
		
		//Square
		int side= scan.nextInt();
		
		if ( side <0) {
			System.out.println("please enter a positiv num");
		}else {
		
		System.out.println("area of the square is " + side*side);
		System.out.println("perimeter of the square is " + side*4);
		}
		
		//Rectangle
		System.out.println("Please enter one side of the rectangle");
		int side1= scan.nextInt();
		System.out.println("Please enter other side of the rectangle");
		int side2= scan.nextInt();
		
		if ( side1 <0 || side2<0 ) {
			System.out.println("please enter positive numbers ");
			
		}else {
			
		
		System.out.println("area of the rectangle is " + side1*side2);
		System.out.println("perimeter of the square is " + 2*(side1+side2));
		}
		scan.close();
		
	}

}
