package ReplittHW;

import java.util.Scanner;

public class floattoShort {

	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner (System.in);
	    System.out.println("enter a float number ");

	   
	    float fnum = scan.nextFloat();
	 
	    short shortnum = (short) Math.abs(fnum);
	    System.out.println(shortnum);
	}

}
