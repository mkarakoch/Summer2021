package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class ScannerHW {

	public static void main(String[] args) {
		
		//First create a Scanner Object 
		
		Scanner scanner = new Scanner(System.in); 
				
			 
		
		System.out.println("Enter your firstname..."); // message to user 
		String firstname = scanner.nextLine();   
		System.out.println(firstname);
		
		
		System.out.println("Enter your lastname... ");
		String lastname = scanner.nextLine();
		System.out.println(lastname);
		
		
		System.out.println("Enter your adres...");
		String adress = scanner.nextLine();
		System.out.println(adress);
		
		System.out.println("You are retired, True or False ");
		boolean isRetired = scanner.nextBoolean();
		System.out.println(isRetired);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
