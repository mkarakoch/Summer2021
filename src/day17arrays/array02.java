package day17arrays;

import java.util.Arrays;

public class array02 {

	public static void main(String[] args) {
		String s[] = new String[7];
		
		s[0] = "Ali Can";
		s[1] = "Veli Han";
		s[2] = "Ayse Tan";
		s[3] = "Ayse Tan";
		s[4] = "Ayse Tan";
		s[5] = "Ayse Tan";
		
		System.out.println(Arrays.toString(s));
		// you can use this to print all elements individually but not recomendedn
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println(s[5]);
		
		System.out.println( );
		
		// recomended
		for (int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		
			
		}
		
		
		
		
		
		
		/*
		 * 1- Create adouble array whose length is 6 
		 * 2- Type a program to add all elements inside the array 
		 * 3- print the sum on the console 
		 * 
		 */
		double d[] = {1.2, 3.6, 5.3, 4.3, 5.6, 4.6, 0.36, 45.6};
		
	/*	
		d[0] = 1.2;
		d[1] = 4.5;
		d[2] = 5.5;
		d[3] = 9.5;
		d[4] = 7.6;
		d[5] = 8.4;
		
		instead of this  you can use above way
		*/
		
		double sum = 0;
		for (int i=0; i<d.length; i++) {
			sum = sum + d[i];
			
			
		}
			System.out.println("sum of all elements in array d: " + sum);
			
			
			
			
			
	}

}
