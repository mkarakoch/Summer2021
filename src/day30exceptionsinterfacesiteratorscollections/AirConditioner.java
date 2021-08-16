package day30exceptionsinterfacesiteratorscollections;
// Interfaces can be used as data type of the object but htey cannot be used as constructor 
public interface AirConditioner {
	
	int price = 3000;
	
	void climate();
	
	void eat();
	
	/*
	  What is the diff btw abstract class and Interfaces
	  
	  		- Abstract class can have concrete method without any keyword 
	  		- Interface can have concrete method with "default and "statuc keyword. 
	  		- In an Interface all methods are public and abstract aswell, but in an abstract class 
	  				you can have every type of methods. 
	  		- All variables public static and final in interfaces, 
	  				in abstr classes we can have everry type of variables
	  		- Abstrc classes have constructors, interfaces dont have. 
	  		- You can not create object from both 
	  		- A concrete class can have just a single "abstr" class parent, but it can have 
	  					multiple interface parent 
	  		- From a class interface use "implement" keyword
	  		Intyerface to interface use extends keyword
	  		Class to Class use extends keyword
	  		
	 */

}
