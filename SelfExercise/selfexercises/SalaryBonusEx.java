package selfexercises;

import java.util.Scanner;

public class SalaryBonusEx {

	public static void main(String[] args) {
		
		
		/*
		 * A company decided to give bonus of 5% to employee if his/her year of service is more than or equal 5 years.
	     * Ask user for their salary and year of service and print the net bonus amount.
	     * Example: Input= 4 year service
	     *               salary: 4000
	     *          Output= 0
	     */

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter number of years you have worked");
		int workperiod = scan.nextInt();
		
		
		System.out.println("Plese enter your salary");
		double salary = scan.nextDouble();
		
		if (workperiod<5) {
			System.out.println("you need to work " + ( 5-workperiod) + " more year to get bonus");
		}else if ( workperiod>=5) {
			
			System.out.println("Your bonus is " + (salary*(0.05)+salary));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
