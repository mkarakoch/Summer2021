package Day19;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		// Byte,int,float,short,long,Boolean,double,char

	
			/*
			 ask user to enter 8 primitive data and print on the consle
			 */
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer");
		int i = scan.nextInt();
		System.out.println("User enter "+i);
		
		System.out.println("Enter a double");
		double d = scan.nextDouble();
		System.out.println("User enter "+d);
		
		System.out.println("enter a float");
		float f = scan.nextFloat();
		System.out.println("User enter "+f);
		System.out.println("Enter a long");
		long l = scan.nextLong();
		System.out.println("User enter "+l);
		System.out.println("Enter a short");
		short s = scan.nextShort();
		System.out.println("User enter "+s);
		System.out.println("Enter a byte");
		byte b = scan.nextByte();
		System.out.println("User enter "+b);
		
		System.out.println("Enter a boolean");
		Boolean bo = scan.nextBoolean();
		System.out.println("User enter "+bo);
		
		System.out.println("Enter a char");
		char c = scan.next().charAt(0);
		System.out.println("User enter "+c);
		
		scan.close();
				
				
		}
}