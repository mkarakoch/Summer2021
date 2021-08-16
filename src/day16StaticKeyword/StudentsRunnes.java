package day16StaticKeyword;

import java.util.Scanner;

public class StudentsRunnes {

	public static void main(String[] args) {
		do {
			
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your firstname");
		String firstname = scan.next();
		System.out.println("Please enter your lastname");
		String lastname = scan.next();
		String fullname = firstname +" "+ lastname;
		System.out.println("Please enter your grade");
		int grade = scan.nextInt();
		System.out.println("Please enter your year");
		int year= scan.nextInt();
		
		students student1 = new students(fullname,grade,year);//we commented out to call it from constructor, it will make more cleaar
	
		System.out.println("student1 ID : " + student1.id);
		System.out.println("student1 name : " + student1.name);
		System.out.println("student1 grade : " + student1.grade);
		System.out.println("student1 year : " + student1.year);
		
		
		System.out.println("to quit press Q, to continue press any key");
		String quit= scan.next().toUpperCase();
		if (quit.equals("Q")) {
			break;
			
		}
	}while (true);
		
		System.out.println(" Thanks for chosing us! See you next time.");
	
	
	
	
	
	
	
	
	
	
	
	
	
	//students student2 = new students("student name: ", 5,2020);
//	System.out.println("student2 ID : " + student2.id);	
		
		
		
		
		
		
		
		
		
	}

}
