package ReplittHW;

import java.util.Scanner;

public class DoubletoInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	    System.out.println("enter a DOUBLE number ");

	   
	    double dnum = scan.nextDouble();
	 
	    int intnum = (int) Math.abs(dnum);
	    System.out.println(intnum);
	    
	   

	}

}
