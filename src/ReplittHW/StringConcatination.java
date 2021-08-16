package ReplittHW;

import java.util.Scanner;

public class StringConcatination {

	public static void main(String[] args) {
		/*
		 	1- Create 2 words : name1 and name2

			2-if the name1 has even numbers of characters,
			
			3-then insert the second word in the middle of the first name
			
			4-if the first word has odd numbers
			
			5-Then print the “Name2 cannot be inserted in the name1”
			
			e.g:
			
			name1= mehmet
			
			name2= ahmet
			
			Print ==> mehahmetmet
		 */	  
		Scanner scan = new Scanner(System.in);
	      System.out.println("Please enter the name1");
	      String name1 = scan.next();

	      System.out.println("Please enter the Name2");
	      String Name2 = scan.next();
	    
	      
	      int len = name1.length();

	/*    if (len%2!=0) {
	      System.out.println("Name2 cannot be inserted in the name1");
	      }else {
	      System.out.println( name1.substring(0,name1.length()/2) + Name2 + name1.substring(name1.length()/2));
	      }
		*/				
					
	      
	      String result = len%2!=0 ? "Name2 cannot be inserted in the name1" : name1.substring(0, name1.length()/2) + Name2 + name1.substring(name1.length()/2);
				
	      System.out.println(result);	
				
				
				
			
	}

}
