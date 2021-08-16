package ReplittHW;

import java.util.Scanner;

import Construction.Earbug;


public class numberOfDaysinMonth {

	public static void main(String[] args) {
	
		/*	
		Write a Java program to find the number of days in a month.
		(Use Switch Case) (Interview Question / Leak Year)

        Sample:

          INPUT:

        Input a month number: 2
m
        Input a year: 2016

          OUTPUT  :

        February 2016 has 29 days
		
*/
		Scanner scan = new Scanner (System.in);
		int NumOfDays;
		String NameOfMont;
		System.out.println("Input a month number");
		int month = scan.nextInt();
		
		
		System.out.println("Input a year");
		int year = scan.nextInt();
		
		
	
		switch (month) {
		case 2:
			NameOfMont="February";
		
		switch (year) {
		
		case (2016):
			
			if ( (year % 400 ==0) || ((year %4 ==0) || (year%100 != 0))  ) {
				NumOfDays = 29;
			}else {
				NumOfDays=28;
			}
			
			
			System.out.println(NameOfMont + " " + year + " has " + NumOfDays + " days");
			break;
		
		default:
			break;
		}	 
		}
		
	}
}
		
		
	


