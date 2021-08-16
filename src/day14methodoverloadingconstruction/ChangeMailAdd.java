package day14methodoverloadingconstruction;

import java.util.Scanner;

public class ChangeMailAdd {

	public static void main(String[] args) {
		// ask user to enter an e-mail address
        // then if it contains "hotmail" replace it with "gmail"
        // e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter an email adress");
		
		String email= scan.nextLine();
		
		if (email.contains("hotmail")) {
			System.out.println(email.replace("@hotmail", "@gmail"));
			
		}else {
			
			System.out.println("Please enter a valid email adress");
		}
			

	}

}
