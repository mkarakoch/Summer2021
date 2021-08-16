package selfexercises;

import java.util.Scanner;

public class Stringmanipultions01 {

	public static void main(String[] args) {
		
		
		
		/*
		 1- eguals () ==> compare the string and it returns 
		 
		 2- equalIgnoreCase()==> compare the Strings qithout cases and return boolean
		 
		 3- length () ==> the count (size) of characters in a String and it returns int
		 
		 */
		
		
		String str1="";
		
		System.out.println(str1.length()); //  0 => empty String the length () returns 0 
		
		
		String str2= " ";
		System.out.println(str2.length()); // 1=> space is like a character 
		
		String str3= null;
		
		// Do NOT use length () for null Strings 
		
		// 4- toUpperCase => Converts all the Characters to UpperCase and it returns String 
		
		String str4 = "java";
		
		System.out.println(str4.toUpperCase()); // JAVA Converts all character to UPPERCASE
		
		// 5- toLowerCase 
		
		String str5 = "JAVA";
		
		System.out.println(str5.toLowerCase());//java
		
		//6. Contains () => Checks if any specific characters exist or not and it returns boolean 
		
		
		System.out.println(str5.contains("V"));// JA"V"A as you see there is V in JAVA so it returns true as boolean 
		
		String str6= "java is not boring";
		
		System.out.println(str6.contains(str5.toLowerCase()));// str5 lower case olarak str6 da var mi diye soruyor 
																// returns true as boolean
		
		
	// 7. charAt() => used to get a specific from String and it returns character
		
		System.out.println(str6.charAt(5));// i  str6 daki 5. character (i)
		
		
		/* Ask user to enter a String.
		 
		 * Type code to return all the time to last character of the String
	
		 */
		
		
		Scanner scan = new Scanner (System.in);
		 System.out.println("Enter a String");
		String str7 = scan.next().toLowerCase();
		
		//Length () -1 used to get last index of the string 
		
		System.out.println(str7.length()-1);
		
		
				
				
		
		
		
		scan.close();
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
