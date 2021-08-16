package ReplittHW;

public class sumofgivennum {

	public static void main(String[] args) {
		/*
		Write a Java program to compute and print sum of two given numbers (more than or equal to zero). 

		If given integers or the sum have more than 10 digits, print "overflow".

		EXAMPLE:

		INPUT      :  
		Input two integers:

		25

		46

		OUTPUT : 

		Sum of the numbers: 71     
		*/ 
		
		
		
		
		int a = 25;
		int b = 46;
		int td= 1000000000;
		
		
		if ( a>td||b>td||(a+b)>td ) {
			System.out.println("overflow");
		}else {
			System.out.println("Sum of the numbers: " + (a + b));
		}

	}

}
