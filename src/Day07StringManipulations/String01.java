package Day07StringManipulations;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		/*1- equals ()=> compare the Strings and it returns 
		  2- equalsIgnoreCase()==>Compare the Strings without cases and it returns boolean
		  3- length() ==> the counts(size) of characters in a String and it returns int
		*  
		*/
		String str1 = "";
		System.out.println(str1.length());// 0 ==>fir epty String the lenght() returns0
		String str2 = " " ;
		System.out.println(str2.length()); // 1 ==> A space is like a charachter
		String str3 = null;
		 // NullPoinerException ==> Do not use lenght () for null Strings
		
		// 4- toUpperCase ==> Conversts all the Charachters to Uppercase and it returns String
		 
		// 4 . toUpperCase ==> Converts all the Characters to Uppercase and it returns String
        String str4 = "java";
        System.out.println(str4.toUpperCase()); // JAVA
        // 5. toLowerCase ==>Converts all the Characters to lowercase and it returns String
        String str5 = "JavA";
        System.out.println(str5.toLowerCase()); // 
        
        //6. Contains () ==> Chack if any specific characters exist or not and it returns boolean
        System.out.println(str5.contains("V"));
        
        String str6 = "java is not boring";
        
        System.out.println(str6.contains(str5.toLowerCase()));
        
         // 7. charAt() ==> used to get a specific from String and it returns character
        
        
        System.out.println(str6.charAt(5));
	
	
	
	/*
 	Ask user to enter a String.
 	Type code to return everytime the last character of the String
*/

        Scanner scan = new Scanner ( System.in);
        System.out.println("Enter a String");
        String str7 = scan.next().toLowerCase();
        
        
        //lenght ()-1  is used to get last index of string 
       
        System.out.println(str7.charAt(str7.length()-1));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
	
	
}
