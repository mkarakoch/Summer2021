package ReplittHW;

import java.util.Scanner;

public class IBMCalculation {

	public static void main(String[] args) {
		/* 
		 Ask user to their weight and height and type a program with calculates mass index

		* HINT : Body Mass Index = Weight (kg) / Square of height (m)
		
		Then give a message to user as following:
		
		If BMI is less than 18.5 , you re weak
		If BMI is between 18.5 and 25 , your weight is ideal
		If BMI is between 25 and 30, you re fat
		If BMI is more than or equal to 30, obese 
					 
		EXAMPLE : 
					 
		INPUT: 
		
		Weight : 71
		
		Height : 1,72
		
		OUTPUT : 
		
		Your BMI is  : 23.99945916711736
		Your weight is ideal
		 */
		
		Scanner scan = new Scanner (System.in);
	    System.out.println("Please enter your weight");
	    double w = scan.nextDouble();

	    System.out.println("Please enter your height");
	    double h = scan.nextDouble();

	    double ibm = w/(h*h);

	    String status;


	    if (ibm<18.5 ) {
	    status="weak";
	    }else if ( ibm<25) {
	    status="ideal";

	    }else if (ibm<30) {
	    status = "fat";

	    }else 
	    status = "obese";
	    System.out.println( "Your BMI is " + ibm);
	    System.out.println("Your weight is " + status);
		
	}

}
