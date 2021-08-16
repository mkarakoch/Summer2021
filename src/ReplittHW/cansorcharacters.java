package ReplittHW;

import java.util.Scanner;

public class cansorcharacters {

	public static void main(String[] args) {
		/*
		 * Ask user Name, Surname and credit card numbers than convert it to special form. 
		 (Initials for name and surname should be uppercase)

			
			(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
			
			Input : 
			
			John White 1234234534561478
			
			Output : 
			
			Name : J*** W****
			
			CCN  : **** **** **** 1478

		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name");
		String name=scan.next().toUpperCase().charAt(0)+"***";
		//System.out.println(name);
		
		System.out.println("Please enter your last name");
		String lname= scan.next().toUpperCase().charAt(0)+"****";
		//System.out.println(lname);
		
		//String lname2 = " "+ lname;
		System.out.println();
		System.out.println("Please enter your 16 digit credit card number");
		long cc = scan.nextLong();
		String ccn = ""+cc;
		
		
	
		if (ccn.length()!=16) {
			System.out.println("Invalid credit card number");
		}else {
			String ccst = "**** **** **** " + ccn.substring(ccn.length()-4);
			
			System.out.println("Name : " + name + " " + lname);
			System.out.println("CCN  : " + ccst);
		
		}

	}

}
