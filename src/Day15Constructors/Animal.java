package Day15Constructors;

public class Animal {
	
	String name; // instance variable 
	int age;
	boolean isCarnivorous;
	String specy;
	char gender;
	
	// if they were static they would be class variable 
	
	
	
	
	/*
	 We use instance variables in constructors as parameters because constructors create ojects 
	 and they use related variables which are instance variables.
	 
	  We dont use class variables inside the constructors because class variables are related with class not 
	  with object 
	 */
	static int counter; // this is class variable because this is static

	public Animal() {
		counter++;
	}

	public Animal(String name, int age, boolean isCarnivorous, String specy, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.isCarnivorous = isCarnivorous;
		this.specy = specy;
		this.gender = gender;
		counter++;
	}

	public Animal(String name, int age, char gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		counter++;
		
	}

	public Animal(String specy) { 
		// interview quest*******
		/*
		 this () is used for constructor call 
		 this () must be in the first line inside the constructor in the first line 
		 In a constructor how many times can " this ()"  be used 
		 			Answ : Only 1 time, because you can only use it at first line. you cant use it any other lines 
		 
		 
		 What is the difference betw "this()" and "this" ?
		 1- this () is used in the first line and to constructor call,,, this used for variable call 
		 2- this () can be used just once, "this" can be used many times 
		 
		 */
		this("Boby", 5, 'M');
		this.specy = specy;
		counter++;
	}
	

}
