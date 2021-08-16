package day18arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultidimentionalArrays01 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		int arr [] [] = new int [3] [2];
		
		System.out.println(Arrays.toString(arr));//[[I@73a28541, [I@6f75e721, [I@69222c14] they are addresses of the index java understands    
		System.out.println(Arrays.deepToString(arr));// [[0, 0], [0, 0], [0, 0]]
		
		
		arr[0] [0] = 3;
		arr[0] [1] = 2;
		
		arr[1] [0] = 11;
		arr[1] [1] = -5;
		
		arr[2] [0] = 1;
		arr[2] [1] = 0;
		
		
		System.out.println(Arrays.deepToString(arr));
	/*	
		int brr[] [] = new int [4] [3];
		
		System.out.println(Arrays.deepToString(brr));
		 
		
		brr[0][1] = 11;
		brr[1][1] = 11;
		brr[3][2] = 11;
		
		System.out.println(Arrays.deepToString(brr)); // [[3, 2], [11, -5], [1, 0]]
		
	*/
		
		int brr [][] = { {2,3},{12,15,32,53,12},{4},{-3,-4,-6}}; 
		
		System.out.println(Arrays.deepToString(brr));//[[2, 3], [12, 15, 32, 53, 12], [4], [-3, -4, -6]]
		
		
		/*
		  { {2,3},{12,13,14}}
		  
		  Type the code to find the sum  of the elements 
		  
		  
		 */
		 int crr [] [] = { {2,3},{12,13,14}};
		 int sum =0;
		 
		 for (int i=0 ; i<crr.length; i++) {
			 
			 for ( int k =0 ; k<crr[i].length; k++) {
				 sum= sum +crr[i][k];
				 
			 }
		 }
				 
				 System.out.println(sum);
				 
		
		
		
		
				
	}

}
