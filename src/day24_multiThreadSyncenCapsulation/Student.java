package day24_multiThreadSyncenCapsulation;

public class Student {
	
	/*
	 		Data Hiding process called is called "Encupsulation" 
	 	1) To hide class members , use "private " acceess modifier for them 
	 		if you don't want anybody to see object details, do not toString() method
	 		2) To read the value of hiden variables, we create " getters", and by using "getters" we can read the values 
	 		3) to update the variable of specific student use setter
	 		4) to create  an immutable class
	 				- Make varieable private 
	 				- Do not create setter 
	 				
	 		Note: getter() and setter () methods are called "Java Beans" in java 
	 		Java Beans --> getter setter 
	 		
	 		Note : a) Getter methodd names start with " get " fallowed by" variable name "
	 
	 		 		but if the variable name is boollean, getter method names start with "is" fallowed by variable names

		Note a) The return type of getter is same with the return type of the variable 
			b)  The return type of the setter is void all the time 
			setter to put parameter is must 
			c) Getter do not use "parameter" but setters must use parameters to update the existing value
	 
	 

	 
	 */
	 
	
	private String name = "Mark Stone";
	private int age = 33;
	private boolean isSuccessful = false;
	
	public Student(String name, int age, boolean isSuccessful) {
		this.name = name;
		this.age = age;
		this.isSuccessful = isSuccessful;
	}
	public Student() {
	}

	
//	@Override
//	public String toString() {
//		return "Name=" + name + ", Age=" + age + ", isSuccessful=" + isSuccessful;
//	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSuccessful() {
		return isSuccessful;
	}
	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}
	public void isSuccessful(boolean b) {
		// TODO Auto-generated method stub
		
	}



















}