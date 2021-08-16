package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
			create an array by getting the length and the element from user
	 		Type a program to find how many characters are used in array elements
		 */
				Scanner scan = new Scanner (System.in);
				System.out.println("Enter the length of the array");
				int length = scan.nextInt();
				
				// I have to create a length
				
				String s[] = new String [length];
				
				System.out.println("Enter the element");
				for ( int i=0; i<length; i++) {
					
					s[i] = scan.next();
					
				}
				
				System.out.println(Arrays.toString(s));
				
				int sum = 0;
				for (int i= 0; i<length; i++) {
					sum =sum + s[i].length ();
					
			
				}
				System.out.println("The number of characters user entered: " + sum);
				
	}

}
