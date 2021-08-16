package day10loops;

public class Forloop01 {

	public static void main(String[] args) {
		//Print "Hello World" on the console 10 times 
		
		
		
		//we can do it 2 ways
		
		//1.st way
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
	System.out.println("================================");	
		
		//2. way
		
		// by using for loop we can tell java to wite 10 times 
		// for ( Starting part ; Condition; Increment or decrement) { }
		
		//i++ if you increase by 1, if i+2 2 by 2 
		
		
	 
		for (int i = 1 ; i<=10    ;  i++  ) {
			System.out.println("Hello World");
			
		}
		
		//print int from 13 to 15 on the console in the same line with a space betw them 
		
		for ( int i = 13  ; i<=15  ; i++  ) {
			
			System.out.print(i + " ");
		
			
		}
		
		System.out.println("");	
		
 		for  (int i =16 ; i>=14 ; i--) {
 			
 			System.out.print(i + " ");
 			
 		}
 		
 		System.out.println("");
 		
		
		//Print the even int from 15 to 29 on the console 
 		
 		for (int i=15 ; i<=29; i++ ) {
 			
 			if(i%2==0) {
 				
 				System.out.print(i + " ");
 				
 			}
 			
 			
 		}
 		System.out.println("");
		// 2. way
 		
 		for (int i= 16 ; i<101 ; i=i+2) {
 			
 			System.out.print(i+ " ");
 			 {
				
			}
 		}
 		System.out.println("");
 		
 		
 		
 		// Print the odd int from 120 to 65 on the console 
 		
 		for (int i=120 ; i>=65; i-- ) {
 			
 			if(i%2!=0) {
 				
 				System.out.print(i + " ");
 				
 			}
 			
 			
 		}
 		
 		System.out.println("");
 		
 		for( int i = 119 ; i>=65 ; i=i-2) {
 			
 			System.out.print(i + " ");
 		}
 		
 		System.out.println("");
 		
 		
 		// Print the integers divisible by 4 and 6 from 13 to 130
 		
 		
 		
 		for (int i=13 ; i<=130; i++ ) {
 			
 			if(i%4==0 && i%6==0) {
 				
 				System.out.print(i + " ");
 				
 			}
 			
 		
 		
 		}
 		
 		// 2. way 
 		
 		
 		System.out.println( "");
 		
 		// Print the every character of a string by putting space between every consecutive character 
 		// EX: Suleyman ==> S u l e y m a n 
 		
 		
 		String name = "Suleyman";
 		
 		for ( int i = 0; i < name.length();i++) {
 			
 			System.out.print(name.charAt(i)+ " ");
 			
 			
 			
 		}
 		System.out.println(" ");


 		String name1 = "Muhammet";
 		
 		for ( int i =0 ; i<name1.length(); i++) {
 			
 		
 		
 		System.out.print(name1.charAt(i) + " ");
 				
	}
 			
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
		}	

}
