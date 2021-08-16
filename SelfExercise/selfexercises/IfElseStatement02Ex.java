package selfexercises;

import java.util.Scanner;

public class IfElseStatement02Ex {

	public static void main(String[] args) {
		
		/*
		 Get the days name from use, then tell to the user 
		 equal() checks the values but not ignoring cases
		 equalIgnoreCase  checks and ignore the lower or upper cases 
		 
		 */
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please Enter the day");
		
		String day = scan.nextLine();
		
		if ( day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("weekend");
			
			
		}else {
			System.out.println("weekday");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
