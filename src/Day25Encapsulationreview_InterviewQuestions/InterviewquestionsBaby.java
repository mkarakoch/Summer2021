package Day25Encapsulationreview_InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewquestionsBaby {

	public static void main(String[] args) {
		/*
		  take and array from the user an get the sum of all elements
		  
		 */
			
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter length of  an array ");
		int x = scan.nextInt();
		int arr[]=new int[x];
		System.out.println("Please enter " + x + " array elements");
		
		
		
		for ( int i= 0; i<x ; i++) {
			arr[i]= scan.nextInt();
			// by creating this loop is to get ou elements 
			
		}System.out.println(Arrays.toString(arr));	
		
			int  sum = 0;
			for (int i :arr ) {
				sum+=i;
				
			}System.out.println("The sum of all elements " + sum);
		
		Arrays.sort(arr);
		int diffMaxandMin= arr[x-1]-arr[0];
		System.out.println(diffMaxandMin);
		
		
	}

}
