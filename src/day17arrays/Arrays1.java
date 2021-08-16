package day17arrays;

import java.util.Arrays;

public class Arrays1 {
	
	/*
	  we use arrays to store multiple elements in to the same container 
	  we can store just same data types into the same array 
	  we can use just primitive data types theoraticaly 
	  but array itseld isi non primitive 
	  arrays store inside heap memory
	  we reach elements by using index  
	  
	 */

	public static void main(String[] args) {
		
		
		// How to create an array 
		
		
		int a[] = new int [5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		a[4] = 5;
		System.out.println(Arrays.toString(a));
		System.out.println(a[3]);
	//	System.out.println(a[5]);
		
		// How to get number of elements inside an array 
		
		System.out.println("Size of the array is " + a.length);
		
		
		
		
		
		
	}

}
