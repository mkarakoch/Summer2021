package day04_concat_if_else;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
	
		/*
		 Get the days name from use, then tell to the user 
		 equal() checks the values but not ignoring cases
		 equalIgnoreCase  checks and ignore the lower or upper cases 
		 
		 */
		
		
		Scanner scan = new Scanner(System.in); //?
		
		System.out.println("Enter a day name");
		String day = scan.next().toLowerCase(); //?
		
		
		//== sign check the value and adress if both are same it returns true otherwise false
//		if(day.equals("saturday")) {
//			
//		System.out.println("weekend");	
//			
//			
//		}
		
		if(day.equals("saturday") || day.equals("sunday")) {
			
			System.out.println("weekend");	
				}else { 
					System.out.println("weekday");
				}
				

	}

}
