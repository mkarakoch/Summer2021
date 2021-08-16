package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		 /*
		 Type a  program which converts the mile to kilometer. 
		 Mile value will be entered by user. ( User double)
		 Hint 1: km = mile x 1.6 
		 Hint 2: To get double, use nextDouble()
		  */
		  
		  
		  Scanner scanner = new Scanner (System.in);
		  
		  System.out.println("Enter the mile");
		  double mile = scanner.nextDouble();
		  System.out.println("Km:" + mile*1.6);		
	

	}

}
