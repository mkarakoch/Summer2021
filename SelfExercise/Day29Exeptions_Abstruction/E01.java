package Day29Exeptions_Abstruction;

import java.util.Scanner;

public class E01 {

	public static void main(String[] args) {
		
		
		//Illigal Argument Exception 
		// Sometimes we dont wantto use some variables for some paramaters 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter  your age ");
		
		int age = scan.nextInt();
	
		
		try {
		setAge(age);
		}catch (IllegalArgumentException e) {
			System.out.println("Dont put negative values AMK");
		}
		
	}
	public static void setAge( int age) throws IllegalArgumentException {
		if(age<0) { 
			throw new IllegalArgumentException ();
			
		}else {
		System.out.println("your age is " + age);
	}

	/* Differens btw throws and throw
		
		throws used in method line... can  be used only one 
		throw used inside the method body ... can be used multiple times 
		
	*/
	
	
	
	
	
	
	
	
	
	
	
	}
}
