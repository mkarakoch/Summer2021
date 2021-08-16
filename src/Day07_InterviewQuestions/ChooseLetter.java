package Day07_InterviewQuestions;

import java.util.Scanner;

public class ChooseLetter {

	public static void main(String[] args) {
		
		/*
		 * Ask user to choose one of these letters : A , B , C
		 * If they choose A, print: Java is easy
		 * If they choose B, print: Java is fun
		 * If they choose C, print: I need to study :)
		 *
		 * EXAMPLE: INPUT : A OUTPUT :Java is easy
		 
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please coose one of theese letters. \nA\nB\nC");
		
		char option=scan.next().toUpperCase().charAt(0);
		switch(option) {
		
		case 'A':
			
			System.out.println("Java is easy");
			break;
		case 'B':
			
			System.out.println("Java is Fun");
			break;
		case 'C':
			
			System.out.println("I need to study");
			break;
			
			default: 
				System.out.println("Enter a valid option");
				
				break;
				
				
			
		}
		
		

	}

}
