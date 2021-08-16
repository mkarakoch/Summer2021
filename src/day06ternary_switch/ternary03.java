package day06ternary_switch;

import java.util.Scanner;

public class ternary03 {

	public static void main(String[] args) {
		 /*
        Ask user to enter a String. 
        If the String has 2 characters, output will be “It is valid for state abbreviations” 
        Otherwise, output will be “It is not valid for state abbreviations”
    */
		
		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println(" Enter a string...");
		String s = scanner.next();
		
		// Condition  ?   code1 								: 								code2
		
		String result = s.length()==2  ? " It is valid for state abbreviations" : "it is not valid for state abbreviations";
		//s.slenght()==2 girilen entry nin 2 haneli olup olmadigina bakar, bu onerme de eger girilen entry 2 haneli ise 1. result yani It is a valid for state abbrevitions 
		//eger iki haneli degilse It is not a valid abbreviations soncu cikar
		
		System.out.println(result);
		
		
		String m = scanner.next();
			
		String result2 =m.length()==4 ? "It is a valid for state abbreviations" : "It is not a valid stateabbreviations";
		System.out.println(result2);
		

	}
}