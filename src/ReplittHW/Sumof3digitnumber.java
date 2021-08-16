package ReplittHW;

import java.util.Scanner;

public class Sumof3digitnumber {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		   System.out.println("enter a three digits number");
		   int num = scan.nextInt();
		   if (num > 99 && num < 1000) {

		   int fdigit = num/100;
		   int ldigit = num%10;
		   int mdigit = num%100/10;
		  

		   System.out.println("The sum of digits of given integer" + (fdigit+mdigit+ldigit));
		   
		   }

		   
		


	}

}
