package selfexercises;

import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the day of the week ");
		
		String week = scan.next().toLowerCase();
		
		switch (week) {
		
		case "monday":
			System.out.println("1.Day");
			break;
			
		case "tuesday":
			System.out.println("2.Day");
			break;
			
		case "wednesday":
			System.out.println("3.Day");
			break;
			
		case "thursday":
			System.out.println("4.Day");
			break;
			
						
		case "friday":
			System.out.println("5.Day, mubarek gun ");
			break;
			
		case "saturday":
			System.out.println("6.Day");
			break;
			
					
		case "sunday":
			System.out.println("7.Day");
			break;
			
			
			
		}
		

	}

}
