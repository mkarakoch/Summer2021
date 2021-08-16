package Day19;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		/*
	0)Ask user to enter two integers
    1)Swap the integers
    2)EXAMPLE:
     INPUT: a= 3
            b= 5
     OUTPUT: a= 5
             b= 3
*/
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter an integer");	
	int a = scan.nextInt();
	System.out.println("Please enter second integer");
	int b = scan.nextInt();
	
		a=a+b; 
		b=a-b;
		a=a-b;
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
	
		
	}

}
