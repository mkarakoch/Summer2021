package Day07_InterviewQuestions;

import java.util.Scanner;

public class AbdoluteNumIfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter any number");
		
		int num=scan.nextInt();
		int result = Math.abs(num);
		
		
		if(num>=0) {
			
			System.out.println("the absolute number is " + num);
			
		}else System.out.println(" the absolute number is :" + result);
		
			
		
		
		
		
		
		
	}

}
