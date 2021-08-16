package day03increment_decrement_operations;

public class Increment01 {

	public static void main(String[] args) {
		
		int age = 20;
		
		//How to increse the value by adition 
		
		// 1. way 
		
		age = age+5; 

		//2. way 
		
		age +=6; 
		
		
		//3. way 
		
		age++; 
		System.out.println(" Final age " + age);
		
		int salary = 1000;
		
		salary = salary * 2;
		
		System.out.println(" After the 1st, increase my salary is " + salary);
		
		salary *=3;
		System.out.println(" Final salary is " + salary);
		
	}

}
