package ReplittHW;

import java.util.Scanner;



public class chrptloop {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a name and a character, then check how many times 
		 	the character is repeated in the name using loops in the name
			
			e.g:
			
			char ch1= 'a' ;
			
			String name =“John came late" 
			
			Expected Output: Number of a = 2
					 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = scan.nextLine();
		System.out.println("Enter a character" );
		char ch1 = scan.next().charAt(0);
		int counter = 0; 
		
		for(int i = 0; i<name.length();i++) {
			if(name.charAt(i)==ch1) {
				
				counter++;
			}
		}
		System.out.println("Number of " + ch1 + " = " + counter);
		System.out.println();
		scan.close();
		  
		
	}

}
