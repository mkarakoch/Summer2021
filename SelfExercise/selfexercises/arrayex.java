package selfexercises;

import java.util.Arrays;
import java.util.Scanner;



public class arrayex {

	public static void main(String[] args) {
		/*
		   	Arrays are to contain multiple variables into a container 
		   	All must be same data
		   	accaepts only primitives and referances" as a data types 
		   	Thepratically you can't store non primitives therefore nonprimitives count as referances 
		   	Arrays are non primitives 
		   	
		 */
		/*
		int a[]= new int [5]; // five is the number of variables into the container, there are 5 variables.
								// it starts from 0 
	
		a[0] = 8;
		System.out.println(Arrays.toString(a));
		
		a[1] = 7; //  first variable is 4 
		System.out.println(Arrays.toString(a));
		
		a[2] = 11; // 2nd variable is 11
		System.out.println(Arrays.toString(a)); // since rest of 4 variables have not specified, other 4 variables 
													// will be default which is 0
		
		a[4] = 10; // 4th variable is 10 
		System.out.println(Arrays.toString(a));	
		
	//	a[3] variable have not been specified so it is default value which is 0 
		
		
		
		
		//  if specific element wanted to print, should be writtien as fllowing. 
		
		System.out.println(a[3]); // it is 0. Why? Because you hdid not specified a decent value yukarida amk ki, ne cikacakti ya.
		
		System.out.println(a[0]); // it is gonna be 8 as yukarida belllirttiginiz uzere efendim. 
		
		System.out.println(a.length);// peki bu ne print ediyo, hadi bil bakalim. arrayin uzunlugunuuu yaa bildinmi.
		
	//	System.out.println(a[5]); // 5. idafe yok ki amk ne cikacak arrayin uzunlugunu astin yazar. 
	System.out.println();	
		
	String s[] = new String [5];
	
		s[0] = "Ali Can";
		s[1] = "Tombur";
		s[2] = "Apo";
		s[3] = "Kamo";
		s[4] = "Tankut";
		
		// yukaridaki gibi tek tek tek tek yazmak yerine for loop kullanarak tek satirda yazabiliriz 
				// nasil mi? reklamdan sonra 

		
		for( int i = 0 ; i<s.length ; i++) {
			System.out.println(s[i]);
		}
		
		/*
		 * 1- Create a double array whose length is 6 
		 * 2- Type a program to add all elements inside the array 
		 * 3- print the sum on the console 
		 * 
		 */
	/*	
		double m[] = new double [7];
		
		m[0] = 1.2;
		m[1] = 2.4;
		m[2] = 3.4;
		m[3] = 0.6;
		m[4] = 12.40;
		m[5] = 90.78;
		m[6] = 54.2;
		
		
		double sum = 0;
		
		/*double sum = m[0] + m[1] + m[3] + m[2] +m[4] +  m[5] ; 
		
		System.out.println("sum is " +  sum);
	*/
/*
	 for (int i=0 ; i<m.length; i++) {
		 
		 sum = sum + m[i];
		 
	 }
		System.out.println("sum of all elements in array is " + sum);
	*/	
		/*
		create an array by getting the length and the element from user
 		Type a program to find how many characters are used in array elements
	 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the array...");		
		int length = scanner.nextInt();	
		String s[] = new String[length];

		System.out.println("Enter String array elements...");
		for(int i=0; i<length; i++) {		
			s[i] = scanner.next();
		}
		System.out.println(Arrays.toString(s));
		
		int sum = 0;
		for(int i=0; i<length; i++) {
			sum = sum + s[i].length();
		}

		System.out.println("The number of characters user entered: " + sum);
	}

		
		
	

}
