package day26inheritanceoverriding;

public  class Honda extends Car {
/*
  - When you override a method, you can use same access modifiers
  - Access modifier in child class cannot have narrover access modifier 
  - Private methods cannot be overridden, because overriding meaning u wanna use method in another class
  		but private class members cannot be used other classes 
 	- In overriding , return types of "overridden " and "Overriding" methods.
 	  			- overridden parent -overriding child
 	-In overriding, from overriding method return type to overridden method return type you must have " is a " relation ship. EX honda is a car, Honda is an object
 	( Object is a Honda ==> X ) object is not a honda it can be anything. 
 	
 	-Final methods cannot be overriden because Final methods body cannot be updated, but in overriding we uptade the method body 
 	
 	-Static method cannot be overriden, because it is common method for all child classes.
 		if any child updates it other child classes affected. it can create problems to other childs. 
 		Therefore, Java doesnt let ovverriding for static methods. 
 
 	- if there is "is a " relationship btw return types, return types are called "Covariant Return Types" 
 	covariant return types meaning "is a relationship ". 
 	
 	- if you wanna override primitive  instead of honda car etc. child and parents return types of overridden and overriding should be same 
 	
 	-  if you wanna override void  instead of honda car etc. child and parents return types of overridden and overriding should be same "void"
 	
 
 */
	@Override // check overriding rules, if there is a problem with rules it complains 
	public void  move() {
		
		System.out.println("Honda moves fast");
	}
	
	

}
