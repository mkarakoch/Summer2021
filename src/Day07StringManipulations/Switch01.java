package Day07StringManipulations;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
			Ask user to enter the name of the month
	 	For January, February, March output will be First Quarter
	 	For April, May, June output will be Second Quarter
	 	For July, August, September output will be Third Quarter
	 	For October, November, December output will be Fourth Quarter
*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the name of the months");
		
		String months = scan.next().toLowerCase();
		
		switch (months) {
		
		case " january ":
		case " fabruary":
		case "march":
			System.out.println("First Quarter");
				break;
		case "april":
		case "may":
		case "june":
			System.out.println("Second Quarter");
				break;
				
		case " july ":
		case " august":
		case "september":
			System.out.println("third Quarter");
				break;
		case "october":
		case "november":
		case "december":
			System.out.println("forth Quarter");
				break;
		
			default: 
				System.out.println("Invalid Entry");
				
			
			
		}

	}

}
