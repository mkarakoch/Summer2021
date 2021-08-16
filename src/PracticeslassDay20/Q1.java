package PracticeslassDay20;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/* Ask the user for an integer less than 100
        A method that returns to the user whether
        it is in a predefined array or not. write
      *
      * Array={3,5,21,32,34,45,56,57,76,87,95}
      *
      * Input : 5 Output: The number you entered is in the Array
      * Input : 15 Output: The number you entered is not in the Array
      */
		
	System.out.println(num(15));	   
	
	
	}
	public static String num (int x ) {

      
		
		int[]A=new int[]{3,5,21,32,34,45,56,57,76,87,95};
		Arrays.sort(A);
		
		
		if(Arrays.binarySearch(A, x)<0) {
			return "The number you entered is not in the Array";
			
		}else {
			return "The number you entered is in the Array";
			
					
		}
		
		
	}
	
	
	
	public static String a (int x) {
		int[]A=new int[]{3,5,21,32,34,45,56,57,76,87,95};
		
		String str="";
		
		for ( int i=0; i<A.length ; i++) {
			if(A[i]==x) {
				
				str= "The number you entered is in the Array";
			}else {
				str= "The number you entered is not in the Array";
			}
		}
		return str;
		
	}
	
	
	
	

}
