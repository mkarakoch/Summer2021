package day30exceptionsinterfacesiteratorscollections;



public class CustomExceptions01 {

	public static void main(String[] args)  {
		
		//Handle checked custom exception
		try {
			checkTheGrade (100);
		} catch (IlligalGradeException e) {
			System.out.println(e.getMessage());
		}
		//Handle unchecked custom exception
		try {
			divide(12,1);
		}catch (DivideByOneException e) {
			System.out.println(e.getMessage());
		}
}
	// Use custom exception a method 
	public static void checkTheGrade (int grade) throws IlligalGradeException {
		
		if (grade<0||grade>100) {
			throw new IlligalGradeException("100 un uzerinde not mu olur amk ");
		}
		System.out.println("Aferin len  " + grade+ " aldin");
		
	}
	// Use Unchecked Custom Exception in a method 
	
	public static void divide(int x, int y) throws DivideByOneException {
		if (y==1) {
			throw new DivideByOneException("Dividing a number by 1 gives the number itself, no need to divide");
		}
		System.out.println("Ther result is " + x/y);
	}
	
}

/*
  When you create a "Custom Exception";
  For Checked Exception
  	- Put Exception word at the end of the Custom Exception class name like IlligalGradeException
  	- Do not forget to extend "Exception" class
  	- create constructor with a String paramater, and super() constructor call method 
  	
   When you create a "Custom Exception";
   	For "Unchecked Custom Exception"
  	- Put Exception word at the end of the Custom Exception class name like IlligalGradeException
  	- Do not forget to extend "RunTimeException" class
  	- create constructor with a String paramater, and super() constructor call keyword 
 */
	
	class IlligalGradeException extends Exception {
		public IlligalGradeException(String message) {
			super(message);
		}
	}
		
	class DivideByOneException extends RuntimeException {
		public DivideByOneException (String message) {
			super (message);
			
			
	}
}
