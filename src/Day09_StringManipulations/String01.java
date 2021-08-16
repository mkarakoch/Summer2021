package Day09_StringManipulations;

import java.util.Scanner;



public class String01 {

	public static void main(String[] args) {
		
		//15 -Substring ()
		
		String str = "Java is easy";
		
		System.out.println(str.substring(2, 5)); // "va " cikar. eni bir kelime olusturuyor 2 dahil 5 dahil degil 
		System.out.println(str.substring(1, 7));//ava is
		System.out.println(str.substring(8, 12));// because 11 is exist it ll return easy, it it was more than 12 because 12 isnt exist it ill give err
		System.out.println(str.substring(8)); // it will be from 8 to all the way end which is easy 
		System.out.println(str.substring(5)); // is easy from 5 to all the way end 
		System.out.println(str.substring(6,6));//see nothing because add 6 then dont add 6
		
		/*
		 * 
		 * * Ask user to enter a String
		 * Print the first and the last character of the String on the console.
		 */
		
		
		/*Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a string");
		
		String str2 = scan.next();
		
		String first = str2.substring(0, 1);
		
		String last = str2.substring(str2.length()-1, str2.length()); // ikinci lenght i yazmak zorunlu degil
		
		System.out.println(first + "<===>" + last);
		*/
		/*Ask user to enter SSN (9 digits)
	     Print the SSN on the console after converting first 5 digits to *
	     Ex: 123456789 ==> *****6789
	     */
	     
	/*	Scanner scan1 = new Scanner (System.in);
		
		System.out.println("Enter a SSN (9 Digits)");
		
		String ssn = scan1.next();
	
		
		String convertedssn = ssn.substring(5);
		
		System.out.println("*****" + convertedssn);
		
		*/
		
		// 16 trim() ===> is used to remove space " " from begining to end and it returns String 
		
		
		String str3 = "  Ali    C   an";
		System.out.println(str3);
		
		String trimmedstr3= str3.trim();
		
		System.out.println(trimmedstr3);
		
		// 17 - isBlank() is used to check a if a String has characters different from "" and "  " and it returns boolean
		
		
		String str4 = "";
		
		String str5 = "  ";
		
		String str6 = "             ";
		
		
		System.out.println(str4.isBlank());//true 
		System.out.println(str5.isBlank());//true
		System.out.println(str6.isBlank());//true
		
		// 18 -- replaceAll() is used like replace() + Returns String
		
		/*
		 
		  replace() : you can use String and Char as parameter
		  replaceAll(): you can just use String 
		  
		  inReplaceAll() you can use Regular Expressions (regex)
		  
		  regex is some syntex which represent multi characters 
		  
		  
		 */
		
		
		//a--> \\ d ==>stands for all digits ( 0.1,4,5,6,5...)
		//--> \\D==> stands for all characters different from digits  (g,/,&,*m,%,f,)
		
		
		String str8 = "55g6e46531s64g6her4g6";
		
		System.out.println(str8.replaceAll("\\d", ""));
		System.out.println(str8.replaceAll("\\D", ""));
		
		//b--> \\w  ==> stands for _ and a-z and A-Z and 0-9 
		//--> \\W==> stands for all characters different from _ and a-z and A-Z and 0-9
	
		String str7 = "A*B48-4F6_84&ERF.4=64";
		System.out.println(str7.replaceAll("\\w", ""));
		System.out.println(str7.replaceAll("\\W", ""));
		
		
		
		// c--> \\s stands for space
		// 		\\S stands for all characters different from space 
		
		
		System.out.println(str3.replaceAll("\\s", ""));
		
		System.out.println(str3.replaceAll("\\S", "*"));
		
		
		// d --> \\A ==> begining of the String 
		//		 \\Z     the end of the String
		
		String str9 = "25.99";
		
		System.out.println(str9.replaceAll("\\A", "USD ")); // USD 25.99
		System.out.println(str9.replaceAll("\\Z", " USD")); // 25.99 USD 
				
		// f --> [aby] ==> Stands for all a,b,y
		//     [^aby]  ==> all characters different from a b y
		
		String str10 = "  ali bey is boked";
		
		System.out.println(str10.replaceAll("[lskd]", "*"));
		System.out.println(str10.replaceAll("[^lskd]", "*"));
	}

}
