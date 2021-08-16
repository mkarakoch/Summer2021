package day18arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays01 {

	public static void main(String[] args) {
		/*
		 - Create an int array together with user
		 - Type code to print min and max elements
		 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the array to create an integer array");
		int  len = scan.nextInt();
		int arr[] = new int [len];
		int numofel= 1; // starting value condition and increment value I need thats why i created this 
		
		
		do {
			System.out.println("Enter the " + numofel + ". element");
		  arr [numofel-1] = scan.nextInt();
			
			numofel++;
			
		}while(numofel<=len);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Minimim eleent is " + arr[0]);
		System.out.println("Maximum Element is " +arr[arr.length-1]);
		Arrays.sort(arr);
		System.out.println("Array after sort " + Arrays.toString(arr));

	}

}
