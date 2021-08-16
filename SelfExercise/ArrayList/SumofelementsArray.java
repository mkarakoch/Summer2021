package ArrayList;

import java.util.Arrays;

public class SumofelementsArray {

	public static void main(String[] args) {
		
		/* 
		 Find the sum of the elements in the array { {1,2,3}, {4,5}, {6,7} } and return an array.
For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}

		 */
		 int A[][]=new int[][]{{1,2,3},{4,5},{6,7}};
		 
	        int sonuc[]=new int[A.length];
	        
	        int sum=0;
	        
	        for(int IlkArrIndex=0; IlkArrIndex< A.length;IlkArrIndex++) {
	        	
	            for(int IcındekiArrIndex=0; IcındekiArrIndex < A[IlkArrIndex].length; IcındekiArrIndex++) {
	            	
	                sum = sum + A[IlkArrIndex][IcındekiArrIndex];
	                
	                sonuc[IlkArrIndex] = sum;
	                
	                // sonuc[IlkArrIndex] = sonuc[IlkArrIndex] +  A[IlkArrIndex][IcındekiArrIndex];
	                
	                //  sonuc[IlkArrIndex] +=  A[IlkArrIndex][IcındekiArrIndex];
	            }
	            
	        }
	        System.out.println(Arrays.toString(sonuc));
	       
	        				
	        
	        
	        /*
	         * Find the sum of the elements whose indexes are same in the given 
	         * two multi dimensional arrays
 				arr1 = { {1,2}, {3,4,5}, {6} } and 
 				arr2 = { {7,8,9}, {10,11}, {12} }
 				
	         */
	        int X[][] = new int[][]{{1,2},{3,4,5},{6}};
	        int Y[][] = new int[][]{{7,8,9}, {10,11}, {12}};
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }
	}
