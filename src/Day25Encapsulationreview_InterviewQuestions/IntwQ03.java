package Day25Encapsulationreview_InterviewQuestions;

import java.util.Scanner;

public class IntwQ03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a string");
		 String str = scan.nextLine();
		 removeNoSpacestr(str);
		 
		

	}
	
	public static void removeNoSpacestr (String str) {
		System.out.println(str.replaceAll(" ", ""));
		
	}

}
