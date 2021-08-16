package Day27_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
	
	
	/*
	 - You can use multiple " catch blocks" for a single "try block 
	  
	 - If you use multiple "catch blocks" ,  order the Exceptioin Classes from child top parent, otherwise
	   you will get Compie Time Error
	  
	  - If you use multiple "catch blocks" you can write different messages for different Excaptioins. 
	  
	  - Try block cannot be used alone 
	  
	  - When u type a code if you get red underline for Exceptions, that kind of Exc are called "Checked Excp".
	  		- If you dont get ant red underline for some eceptions, they are called "Unchecked Exceptions"
	  		
	  		FileNotFound exceptions and IOExceptions are " checked exceptions" 
	
	  - If there is any 
	 *
	 *
	 *
	 */

	public static void main(String[] args) {
		
		FileInputStream  fis = null; 
		
		try {
			
			
			fis = new FileInputStream("src/Day27_ExeptionsX/TextFile01");
			
			int i = 0; 
			
			while ((i=fis.read())!=-1) {
					System.out.print((char)i);
					
				}
			
			fis.close();
		
		} catch ( FileNotFoundException e) { // catch is a method
	
		System.err.println("I think the path is wrong or file doesn't exist ");
		// e.getMessage() javas message, short message
		e.printStackTrace();// to get detailed error message use this one 
		
		
	
		}catch (IOException e ) {
			
			System.err.println("There are some issues in reading the file");
		}
	
		

		
		
		

	}

}
