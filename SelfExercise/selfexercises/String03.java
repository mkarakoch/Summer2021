package selfexercises;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
	
		//15 Substring () 
		
		String str = "Java is easy";
		
		System.out.println(str.substring(2,5));//"va " cikar 2. harf ten 5e kadar olan harf arasi. 5 dahil degil 
		System.out.println(str.substring(1, 7));//ava is 
		System.out.println(str.substring(8,12));// easy 12 yok normalde fakat zaten 2 yi almayacagi icin 11 yani son harfi aldi 
		System.out.println(str.substring(5)); //it is easy its 5th to all the way end 
		System.out.println(str.substring(6,6)); // it is nothng 
		
		/*
		 * 
		 * * Ask user to enter a String
		 * Print the first and the last character of the String on the console.
		 */
				/*
				Scanner scan = new Scanner (System.in);
				
				System.out.println("Please enter a name");
				
				String str1 = scan.next();
				
				String finitial = str1.substring(0,1);
				String linitial = str1.substring(str1.length()-1);
				
				System.out.println(finitial  + linitial);
				
				/*Ask user to enter SSN (9 digits)
			     Print the SSN on the console after converting first 5 digits to *
			     Ex: 123456789 ==> *****6789
			     */
			/*	
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Enter your SSN");
				String ssn = scan1.next();
				String convertssn = ssn.substring(5);// ilk 5 digitini convert et dedim asagida nasil convert edilecegini yazacam
				System.out.println("*****" + convertssn);
				
				
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Please enter you credit card number");
				String CCN = scan2.next();
				String convertCCN = CCN.substring(12);
				System.out.println("******" + convertCCN);
				
				
				Scanner scan3 = new Scanner (System.in);
				System.out.println("Please Enter your Name, Middle Name and Lastname");
				
				String Name = scan3.next();		
				String ConvertedName=Name.substring(0,1);
				String ME= scan3.next();
				String CME = ME.substring(0,1);
				String lname = scan3.next();
				String convertlname = lname.substring(0,1);
				
				
				
				
				System.out.println( ConvertedName + "*********** "  +CME +" "+ convertlname + "***********"); 
				*/
		
		
				//16 . Trim  to remove space type String from begining to end 
				
		String str3 = "  Ali    C   an";
		System.out.println(str3);
		
		String trimmedstr3= str3.trim();
		
		System.out.println(trimmedstr3); // bastaki space i kaldirdi 
		
		
		String str4 = "";
		
		String str5 = "  ";
		
		String str6= "          ";
		
		
		System.out.println(str4.isBlank());//true
		System.out.println(str5.isBlank());//true
		System.out.println(str6.isBlank());//true
				
				
		// 18 replaceAll() is used like replace() + Returns String
		
		// replace() u can use String and char paramaters
		// replaceAll u can use only for String 
		///inReaplaceAll() u can use for Regular Expression (regex)
		
		// it is some syntex which represent multi characters
		
		
		// a--> //d for all numbers
		//		 \\D   for all characters (m,r,g,9,i,*,^,%,^,)
				
				String str8 = "555sf296f52w65wsd";
				
				System.out.println(str8.replaceAll("\\d", ""));
				System.out.println(str8.replaceAll("\\D", ""));
				
				
		//b--> \\w : for _a-z and A-Z and 0-9
		//		\\W for all characters EXEPT  _a-z and A-Z and 0-9 
				
				String str7 = "A*B48-4F6_84&ERF.4=64";
				System.out.println(str7.replaceAll("\\w", ""));
				System.out.println(str7.replaceAll("\\W", ""));
				
				
		// c--> \\s to remove space 
		//		\\S all characters different from space
				
				System.out.println(str3.replaceAll("\\s", ""));
				System.out.println(str3.replaceAll("\\S", ""));	
				
				
		// d--> \\A begining of the String 
		//		\\Z the end of the String
				
				String str9 = "25.99";
				System.out.println(str9.replaceAll("\\A", "USD "));
				System.out.println(str9.replaceAll("\\Z", " USD"));
				
			// f--> [uae] ==> to remove the letters inside the square brics
				// [^uae] ==> all cha EXEPT uae
				
				String str10 = " Muhammet naabun";
				
				System.out.println(str10.replaceAll("[uae]", "*"));
				System.out.println(str10.replaceAll("[^uae]", "*"));
				
				
				String str11 = " boklu sidikli";
						
				System.out.println(str11.replaceAll("[oi]", "*"));
				System.out.println(str11.replaceAll("[^oi]", "*"));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}
	

}
