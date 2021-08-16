package selfexercises;

import java.util.Scanner;

public class ternary01EX {

	public static void main(String[] args) {
		
		// Condition ?                 Code will be executed true condition : Code executed false condition 
				//String result = 3<5 ?                             "True" :                         "False";
				
				//String result = x%2==0 ? (x + " is even...") : (x +"is odd...");
				
				//System.out.println(result);
				//If ternary returns different data types, do not create a container put it into syso directly 
				
				//System.out.println(x++ >5 ? "true" : x);
				
				//if you have to create a container for the ternary result, you have to make data types same. 
		
		Scanner scan = new Scanner( System.in);
			System.out.println("Enter an integer ");
			int x = scan.nextInt();
			
		
		String result = x++ >5 ? "true " : x+"";
		System.out.println(result);

		
		
		
		
		
		
		
		
		
		
		
	}

}			

			