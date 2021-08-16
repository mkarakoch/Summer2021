package day24_multiThreadSyncenCapsulation;


/*
  1) in java there is parent child relationship 
  2) A parent can have infitely many child classes 
 	A child can have just a single parents in Java
 			it means Java doenst support multiple inharitence
 			
 3) Inharitance meaning: child classes can use class members from 
 parent class
 
 4) Inharitance is so eneficial in 
 		a) ending repetation
 		b) Maintenence
 		c) Reusability
 		
 5) A child class may have grandparents as well 
 
 */
/*
 		1-Single Inheritance: Child can have just a single parent 
 		2- Hierarchical Inheritance: A parent will have multiple child classes
 		
 		
  
 */

public class Animal {

	
	public  void move() {
		
		System.out.println("Animal move");
		
		
	}
	public  void eat() {
		System.out.println("Animal eat");
		
	}
}
