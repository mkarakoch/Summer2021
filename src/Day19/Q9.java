package Day19;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
	/* ask the user for an edge and height of an equilateral triangle
         * find the area and perimeter of the triangle
         * print on the console
      */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length the side of a triangle");
		double a = scan.nextDouble();
		System.out.println("Enter the height the of a triangle");
		double b = scan.nextDouble();
		
		double area = (a*b)/2;
		double per = 3 * a;
		
		System.out.println("Area is: " + area + " " + "Perimeter is: " + per);

		
		
		
		
		
	}

}
