package ReplittHW;

import java.util.Scanner;

public class Stringsamecharacters {

	public static void main(String[] args) {
			/*
			
			1-Ask user to type a name 
	
			2-the length of name should be 3.
	
			3-Then check if the name has same characters.
	
			4-If the String has same characters 
	
			5-Print “String has duplicate characters”
			Else
	
			4-Print “String has unique characters” 
	
			Please use ternary.
	
	
			Input : 
	
			ala
	
			OutPut:
	
			String has duplicate characters
	*/
		Scanner scan = new Scanner (System.in);
		System.out.println("please enter your name");
		String name = scan.next();
	/*	
		char ch1 = name.charAt(0);
		char ch2 = name.charAt(1);
		char ch3 = name.charAt(2);
		
		int len = name.length();
		
		if (len!=3) {
			System.out.println("Enter a name 3 letters");
		}else {
			
			String result = ( ch1==ch2 || ch1==ch3 || ch2==ch3)? " String has duplicate characters" : "Unique character";
			System.out.println(result);
				
				//System.out.println("String has duplicate characters");
//		}else {
//			System.out.println("Unique character");
		}
		
	*/
		String result = "";
	    if (name.length()!=3){
	    System.out.println("Name should have 3 character");
	    } else{
	    	name = name.toLowerCase();
	    	for(int i=0;i<name.length();i++) {
	    		result = name.indexOf(name.charAt(i))!=name.lastIndexOf(name.charAt(i)) ?
	    				"Your string has duplicate characters" : "Your string has unique characters";
	   
	    }
	    	
	    	System.out.println(result);
	    }
		
	}

}
