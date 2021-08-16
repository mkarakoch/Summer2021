package Day28_Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E01 {

	 public static void main(String[] args) {
	        try {
	            BufferedReader bReader = new BufferedReader(new FileReader("src/Day27_Exeptions/TextFile01"));
	            String l = bReader.readLine();
	            while(l!=null) {
	                System.out.println(l);
	                l=bReader.readLine();
	            }
	        
	        } catch (FileNotFoundException e) {
	            System.out.println("There is a problem about accessing the file or file path "+ e.getMessage());
	        } catch (IOException e) {
	            System.out.println("There is a problm about reading the file");
	        }
	    }
	}