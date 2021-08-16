package PracticeClassday11;

import java.util.Scanner;

public class Divisiblefivenumbers {

	public static void main(String[] args) {
		/*Write a program to print a number entered by user,
		 * which are not divisible by 5 or divisible by 5
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();
		/*
		if (num%5!=0){
			System.out.println("It cant be divisible by 5 ");
		}else {
			System.out.println("it is divisible by 5");
		}
		*/		
	
		
		System.out.println( num % 5==0 ? num+  "divisible by 5 " : num + "It is not divisible by 5");
			
		

	}

}
