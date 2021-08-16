package selfexercises;

import java.util.Scanner;

public class OrderOfOperations01EX {

	public static void main(String[] args) {
		
		
	/*	order of operations 
		  
		  1- ()
		  2- Exponents 
		  3- Do multipications and divisions from left to right 
		  4- do addition and substraction from left to right
		
		
	*/
		
		Scanner scan = new Scanner (System.in );
		
		System.out.println("Enter your number");
		
		int num = scan.nextInt();
		
		int lastdigit = 0;
		int firstdigit = 0;
		int midDigit = 0;
		int middle = 0;
		
		lastdigit = num%10;
		firstdigit = num/100;
		middle = num/10;
		midDigit = middle%10;
		
		
		System.out.println(firstdigit + midDigit + lastdigit);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
