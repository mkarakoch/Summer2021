package Day11;

import java.util.Scanner;

public class forloop3 {

	public static void main(String[] args) {
		/*
		 * ask user to enter a number to findd its fuctorial 
		 * 5! = 5*4*3*2*1
		 * 
*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a number to find its factorial");
		int num;
		num = scan.nextInt();
		int a = 1;
		
		for (int i=num ; i>0; i--) {
			
			a=a*i;
			
		}
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
	}

}
