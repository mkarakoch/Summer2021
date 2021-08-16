package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		/* 
		 1) To get data from user we need to use "Scanner Class"in Java
		 2) To be able to use " Scanner Class" 
		 	a) Create an object from " Scanner Class"
		 		To create an object 
		 		 Class name -> Object name what ever you want -> "=" sign -> "new " -> Class name();
		 	b) By using the object access to the methods and use them
		 	
		  */
		
		
		//create an object from the scanner class like below
		Scanner scanner = new Scanner (System.in); // this is an object 
		
		
		System.out.println("Hey user, enter your age...");
		int age = scanner.nextInt();// this is to store the data to a container 
		System.out.println(age);
		
		// my codes interacting with the user by using scanner 
		//Correct 35 thing

	}

}
