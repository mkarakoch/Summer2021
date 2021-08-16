package InterviewQuestions01;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestions01 {

	public static void main(String[] args) {
		/*
		  take and array from the user an get the sum of all elements
		  
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Please Enter the length of an array ");
		int x = scan.nextInt();
		int arr [] = new int [x];
		System.out.println("Please enter the " + x + " array elements");
		
		
		for (int i = 0 ; i<x; i++) { 
			
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		
		for (int i :arr) {
			sum=sum+i;
			
		}System.out.println("The sum of elements is " + sum);

		Arrays.sort(arr);
		int diffMaxandMin=arr[x-1]-arr[0];
		System.out.println(diffMaxandMin);
		
		scan.close();
		
	}

}
