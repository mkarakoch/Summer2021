package day03increment_decrement_operations;

public class decrement01 {

	public static void main(String[] args) {
		
		int num=100;
		
		// How to decrease the value of variable by substructions 
		
		// 1.st way 
		
		num = num-5;
		
		System.out.println("new value is " + num);
		
		
		// 2. way
		num-=10;
		
		System.out.println(" new value is " + num);
		
		//3. way only to decrease by 1 
		
		
		num--;
		
		System.out.println(" new value is " + num);
		
		int salary = 5000;
		
		// 1.st way 
		
		salary = salary / 5;
		
		System.out.println(" the value of salary " + salary);
		
		// 2. way 
		
		salary /=5;
		
		System.out.println(" final value of salary " + salary );
		
		//Q: Decrease Ali's salary 20% then increase it by 100 dollars.		
		//  Increase Veli's salary 100 dollars then decrease it by 20%.		
		//  Then compare their salaries?
		
		int aliSalary = 10000;
		
		int veliSalary = 15000;
		
		aliSalary = ( int) (aliSalary * 0.8);
		
		aliSalary+=100;
		
		System.out.println(" Ali's final salary " + aliSalary);
		
				
		veliSalary +=100;
		veliSalary*=0.8;
		
		
		System.out.println(" Final Veli's salary " + veliSalary);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
