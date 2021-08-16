package selfexercises;

import java.util.Scanner;

public class Nestedternary01 {

	public static void main(String[] args) {
	
		/*
		 
		 Type java code by using nested ternary.
		Write a program to check if a year is leap year or not.
		If the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.

		 */
		 
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter a year" );
		
		int y = scan.nextInt();
		
		String result = y%100==0 ? y%400==0 ? "Leap Year" : "Not a Leap year" : y%4==0 ?" Leap Year" : "Not a Leap year";
		System.out.println(result);
		
		
		
		int m = 34;
		int res = 0;
		
		
		res = m >45 ? m+10: m +20;
		
		System.out.println(res);
		
		int t = 81;
		String r = t >=80 ? "A": t>=60 && t<80 ? "B" : "C";
		System.out.println(r);
		
		

	}

}
