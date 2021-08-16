package Day28_Exceptions;

public class E03 {

	/*
     * 1)ArrayIndexOutOfBoundsException 
     *   unchecked exception
     *   when we try to get an element from an unexisting  index
     * 2- ClassCastExeption
     			unchecked exeption 
     			When we try to cast data type into another one which is not supported 
     			
     */
	
	public static void main(String[] args) {
		
		// ArraysIndexOutOBounds
		
		
		String s [] = { " Selen" , "Bahar" , "Zeki" , "Muhammet" };
		
		System.out.println(s[0]);
//      try {
//      System.out.println(s[6]);
//      }catch(ArrayIndexOutOfBoundsException e) {
//          System.out.println("Please check the length of your array ;( " +e.getMessage());
//      }
        
        //ClassCastException
        
      //  Object o = 43;
        
      //  String num = "o";
        
	//	String num = (String)o;
		
		
		// Number format Exception
		
		String ss = "123";
		System.out.println("Before converting to int " + ss);
		int num1 = Integer.parseInt(ss);
		
		System.out.println("After converting to the int " + (num1+2));
		
		String s2 = "432n443no";
		try {
			
		
		int num2 = Integer.parseInt(s2);
		
		System.out.println(num2);
	}catch (NumberFormatException e) {
		System.out.println("We tried to convert some unnumeratical characters to the integer . Do not do that");
		
	}

	}
}
