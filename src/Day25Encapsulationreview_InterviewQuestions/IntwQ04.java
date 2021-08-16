package Day25Encapsulationreview_InterviewQuestions;

import java.util.Scanner;



public class IntwQ04 {

	public static void main(String[] args) {
	// Create a program checks if a string is polindrome
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a String");
		
		String str = scan.nextLine().replace(" ", "").toLowerCase();
		isPalindrome(str);
		
	}
	
	public static void isPalindrome (String str) {
	
		
		
		
		
		String revString= "";
		for ( int i =str.length()-1; i>=0 ; i--) {
		revString+=str.charAt(i);
		
	}
		if( str.equals(revString)) {
		System.out.println("it is a palindrome");
	}else {
		System.out.println("it is not palindrome");
		}
		
	}
	
	//HW
			// Create a method to check if a number is armstrong or not
	        //153 is an armstromg number
	        //1*1*1  +  5*5*5  +  3*3*3 =153 
}
