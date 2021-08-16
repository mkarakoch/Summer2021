package selfexercises;

import java.util.Scanner;

public class StudentsRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
	do { 
		System.out.println("Enter your First name");
		String fname = scan.nextLine();
		System.out.println("Enter your lname ");
		String lname = scan.nextLine();
		String name = fname + " " + lname;
		scan.nextLine();
		System.out.println("Enter your grade");
		int grade= scan.nextInt();
		System.out.println("Enter your Registration Year ");
		int registrationYear= scan.nextInt();
		
		Students std1 = new Students ( name, grade, registrationYear );
		System.out.println("Students name " + std1.name);
		System.out.println("Students grade " + std1.grade);
		System.out.println("Students Registradion Year " + std1.registrationYear);
		
		System.out.println("Student id " + Students.id);
		System.out.println("To quit press q, To continue press any button");
		String quit = scan.next().toUpperCase();
		if (quit.equals("Q")) {
			break;
			
		}
	
	}while (true); 
	System.out.println("See you later");
	
	
		
		

	}

}
