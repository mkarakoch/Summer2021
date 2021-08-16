package Day28exections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import day30exceptionsinterfacesiteratorscollections.I01;

public class E01 {
	// Exceptions is asking for help 
	
	/*
	   We learned how to read a text file character by character 
	   We will learn how to read text file line by line 
	   
	 */

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("src/Day27_Exeptions/TextFile01"));
			
			String line = br.readLine();
			
			
				while (line!=null) {
					System.out.println(line);
					line = br.readLine();
				}
					System.out.println(I01.c);// this is to call interface class from day30
				}
			 catch (FileNotFoundException e) {
		
			System.out.println("There is an issue about path or accessing file");
		
		} catch (IOException e) {
			
			System.out.println("There is an issue inreading file");
			
			
	}
		
		
		
		
		
		

	}

}
