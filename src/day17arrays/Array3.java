package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/* 
		  Create a String array by getting then length and the elements from use 
		  type program to find how many characters are used in the array elements 
		  
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the length of the array ");
		
		int length = scan.nextInt();
		
		String s[] = new String [length];
		
		System.out.println("Enter the element");
		for  ( int i =0; i<length ; i++) {
			s[i] = scan.next();
			
		}
		
		System.out.println(Arrays.toString(s));
	}

}
