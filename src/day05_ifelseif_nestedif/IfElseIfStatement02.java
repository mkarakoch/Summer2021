package day05_ifelseif_nestedif;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		/*
		  
		   1. Get the day name from user, 
		   2. then tell to the user if it is week day or weekend day
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a day name...");
		
		String day = scan.next().toLowerCase();
		
		if (day.equals("sunday")||day.equals("saturday")) {
			System.out.println("weekend");
			
		}else if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday") ) {
			System.out.println("weekday");
			
		} else {
			System.out.println("Please enter a DAY NAME");
			
			
		}
		

	}

}
