package day17arrays;

import java.util.Arrays;

public class array01 {

	public static void main(String[] args) {
		/* 
	 	- Arrays used to store multiple data into a single container
		-All must be same data type 
		- Arrays accepts only "primitives" and "referances" as a data types
		- Theoretically you can't store non-primitives
		- Arrays are non-primitives
		
			
		*/
		//you should write data type first 
		
		int a[]=  new int [5];  // or you can use as int[] a, int []a. or int int a[]. 
				// 5 is the number of variable in the container. there are 5 variebles, and it starts from 0 
				// then we should add elements into arrays
		
		a[2] = 11; // this meas the 2nd variable is 11 
		System.out.println(Arrays.toString(a));
		a[4]= 22; // 4th element in 22
		System.out.println(Arrays.toString(a));
		a[0] = 7; 
		System.out.println(Arrays.toString(a));
		a[1] = 5;
		System.out.println(Arrays.toString(a));
		a[3] = 99;
		
		// printing an array
		
		System.out.println(Arrays.toString(a));// if we dont assign numbers java will assign 0 to all 5 elements
		
		
		//how to print a specific element from an array 
		
		System.out.println(a[2]);//11
		System.out.println(a[4]);//22
		//System.out.println(a[5]);// ArrayIndexOutOfBoundsException
		System.out.println(a.length);// in String .lenght is with (), arrays only.length
		
	}

}
