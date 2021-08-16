package PracticeslassDay20;

import selfexercises.string;

public class $_07_25 {
	
	
	
	String name;//null
	int age;// 0 
	
	
	$_07_25(String name, int age) {// this is a constructor // local variables their scope is limited within Constructor
		
		//Constructor has one job initialize instance variables.
		this.name=name;
		this.age=age;
		System.out.println("This is my constructor");
		
	}
	
	static int i =10;
	
	static { 
		System.out.println("This is m static block");
	}
	
	

	

	public static void main(String[] args) {
		
		$_07_25 obj = new $_07_25 ( "Hatice", 26);
		System.out.println(obj.name + " is " + obj.age+ " years old");
		


	/*
	 Static work flow in a single class:
 When u run a class in java, following steps will be executed.
 1) Identification of static members from top to bottom (During this process JVM assigns default value for each variable at the time of declaration)
 2) Execution of static variable assignments and static blocks from top to bottom
 3) Execution of main 
 //-----------------------------Static Control Flow in multiple classes---------------------------\\
    
    1) Identification of static members from from parent to child and off course from top to bottom
       During this process JVM assigns default value for each variable at the time of declaration)
    2) Execution of static variable assignments and static blocks from parent to child and off course from top to bottom
    
    3) Execution of main method of the child. if child class does not have one main method then parent's main method will be executed. 
**Important Note: Now, if u run the parent class only parent will be executed child class will not be loaded nor will be executed. 
because parent class members by default available to the child class where as child class members by default are not available to the parent class
	 */


			
					
		}
		
		
		
		
	}
