package Day29Exceptions_Abstraction;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		//IlligalArgumentException
		// unchecked exception. when we do not want some kind of entries 
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		
		
		try {
			setAge(age);
		}catch (IllegalArgumentException e) {
			System.out.println("Bravo you entered negative age");		
			
		}
		
		
	}
		public static void setAge (int age) throws IllegalArgumentException {
		if (age<0) {
			throw new IllegalArgumentException();
			
		}else {
		System.out.println("Yur age is: " + age);
		}
	
		
		
		
		
		}

}
