package day26inheritanceoverriding;

public class Runner  {
/*
 If you use variables whose name are same in inheritance, to understand which variables will be appear by usinf objects, remember the following rule;
 		- look at the data type which you used in object creation, the variables will be displayed from the 
 		class which you used as data type (mammal) an in all parents 
 		
 	- It is not possible to see variables whose names are different from the child classes of the class which you used as data type 
 	
 */
	public static void main(String[] args) {
		Mammal b1 = new Bird();
		
		
		/*
		 This() --> It calls constructors in the class.
		 Super() --> is used to call constructor from  parent classes.
		 */

	}

}
