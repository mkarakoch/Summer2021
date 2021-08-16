package Day27_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
 File NotFound Exception:
 		- The file with the specified path does not exist 
 		- If the is unaccessible 
 IOException 
 		- Can handle everything input output like 911
 			- IOException covers FilenotfoundException
 
 Notice: IO is the parent of Filenotfound
 		 If you are using IOEx u dont need to use FIlenotfoundEXc
 		 
 		 IOExceptions and FilenotFound exceptions are classes
 		  
 		 IOExceptions class and FilenotFound class
 		 
 		 Note: When you see an Exception you have 2 options 
 		 		- Using "Throws" declerations in the method name line 
 		 		- Usinf try catch block 
 

 */

public class Exeptions01 {
	
	

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream  fis = new FileInputStream("src/Day27_Exeptions/TextFile01");
		
		int i = 0; 
		
		while ((i=fis.read())!=-1) {
			System.out.print((char)i);
			
		}
		fis.close();
	}

}
