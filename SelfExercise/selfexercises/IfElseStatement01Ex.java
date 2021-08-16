package selfexercises;

import java.util.Scanner;

public class IfElseStatement01Ex {

	public static void main(String[] args) {
		
		// get the length and the height of a rectangle from user, 
				//if they equal to each other 

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the height of a shape");
		int h = scan.nextInt();
		
		System.out.println("Enter the lenght");
		
		int l = scan.nextInt();
		
		if (h==l) {
			
			System.out.println("Square");
			
		}else {
			System.out.println("rectangle");
			
		}
		
		
		
		
		
	}

}
