package Day28exections;

public class E02 {
	
	/*
	  If you use length method for "null" string object, you will get "nullpointerexception "
	  NullPointerException" is an "unchecked exception"
	 - If there is no parent - child relationschip between Exception Clases, the order of catch-blocks
	 	is not important
	 - Try block cannot be used alone, It can be used ad fallowing 
	 		 a- try+catch 
	 		 b- try+ multiple catch + finally 
	 		 c- try+finally 
	 		 d- try + multiple catch
	 		 
	 */

	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.length());//0
		
		String s2 = null;
		try {
			System.out.println(12/4);//
		//	System.out.println(s2.length());//NullPointerException
			
		}catch (NullPointerException e) {
			System.out.println("Do not use length() for null." + e.getMessage());
			
			
		}catch (ArithmeticException e ) {
			
			System.out.println("Do not devide by zero" + e.getMessage());
		

	}finally {
		System.out.println("Finally part will be excecuted under every condition");
	}
		System.out.println("Will that be excecuted");
	}
}

