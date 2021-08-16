package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//Create Scanner Object 
		Scanner scanner = new Scanner(System.in);
		
		// Give a message to user 
		System.out.println("Hey user, enter your firstname...");
		
		//Create a container to store the data from the user
		
		String firstname = scanner.nextLine();
		
		
		
		// Print the name on the console
		
		System.out.println(firstname);
		
		System.out.println("Hey user, enter your lastname...");
		String lastname = scanner.nextLine();
		

		System.out.println("Hey user, enter your adress...");
		String adress = scanner.nextLine();
		System.out.println(adress);
		
		System.out.println("You are retired. true od false?");
		boolean isRetired = scanner.nextBoolean();
		System.out.println(isRetired);
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
