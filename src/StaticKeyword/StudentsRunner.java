package StaticKeyword;

import java.util.Scanner;

public class StudentsRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		do {
		System.out.println("Enter your First name ");
		String fname = scan.nextLine();
		System.out.println("Enter your last name ");
		String lname = scan.nextLine();
		String name = fname + " " +lname;
		scan.nextLine();
		System.out.println("enter your grade");
		int grade = scan.nextInt();
		System.out.println("Enter your registratioin year");
		int year = scan.nextInt();
		
		
		Students std1 = new Students(name, grade, year);
		System.out.println("Student name " + std1.name);
		System.out.println("Student grade " + std1.grade);
		System.out.println("Student Registration Yeat " + std1.registrationYear);
		
		System.out.println("Student id" + Students.id);
		
		System.out.println("To Quit press Q, To continue press any button");
		String quit = scan.next().toUpperCase();
		if (quit.equals("Q")) {
			break;
		}
		} while (true);
		
		System.out.println("See you later");
		
		
		
		
		
		
		
	}
}