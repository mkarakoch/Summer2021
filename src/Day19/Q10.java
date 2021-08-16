package Day19;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		double a = scan.nextInt();
		
		System.out.println("Enter 2nd integer");
		double b = scan.nextInt();
		
		System.out.println("Enter 3rd integer");
		double c = scan.nextInt();
		
		System.out.println("Enter 4th integer");
		double d = scan.nextInt();
		
		System.out.println("Enter 5th integer");
		double e = scan.nextInt();
		
		double sum = a+b+c+d+e;
		
		double ave = sum/5;
		
		System.out.println("the sum is: " + sum);
		System.out.println("the average is: " + ave);
	}

}
