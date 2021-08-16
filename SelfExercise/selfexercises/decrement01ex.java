package selfexercises;

public class decrement01ex {

	public static void main(String[] args) {

		int x = 100;
		
		x=x-10;
		
		System.out.println("new value is " + x);
		
		x-=10;
		
		System.out.println("New value is " + x);
		
		
		x--;
		
		System.out.println("New value is " + x);
		
		System.out.println("====================================================");
		
		int salary = 14000;
		System.out.println(salary);
		
		salary=salary/2;
		System.out.println("The half of the salary is " + salary);
		
		
		salary/=2;
		
		System.out.println("Reminder from the salary is " + salary);
		
		salary--;
		
		System.out.println("Take it, take it, take it all amk " + salary);
		
		System.out.println("==================================================");
		
		//Q: Decrease Ali's salary 20% then increase it by 100 dollars.		
		//  Increase Veli's salary 100 dollars then decrease it by 20%.		
		//  Then compare their salaries?
		
		int AliSalary = 14500;
		int VeliSalary = 13200;
		
		AliSalary*=0.8;
		AliSalary+=100;
		System.out.println("Ali's final Salary " + AliSalary);
		
		
		VeliSalary+=100;
		VeliSalary*=0.8;
		
		System.out.println("Final Veli's salary " + VeliSalary);
		
				
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
