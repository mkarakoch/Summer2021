package day06ternary_switch;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/*
		 
		 Type java code by using nested ternary.
		Write a program to check if a year is leap year or not.
		If the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.

		 */
		
		Scanner scan = new Scanner(System.in);
	      System.out.println("Please enter the name1");
	      String name1 = scan.next();

	      System.out.println("Please enter the Name2");
	      String Name2 = scan.next();
	    
	      
	      int len = name1.length();
	      String result = len%2!=0 ? "Name2 cannot be inserted in the name1" : name1.substring(0, name1.length()/2) + Name2 + name1.substring(name1.length()/2);
	      System.out.println(result);
		
				
				

	}

}
