package day26inheritanceoverriding;
/*
  - super () is used to call a specific constructor from Parent class
  - Typing "super()" oor not typing super () have same meaning 
  - super () must be used in the first line inside the constructor 
  - super () can be used just once inside a constructor 
  - super () can call constructors  just from parents class not from grrandparent classes
 */



public class Bird extends Mammal{
	String name="Bird";
	int height=11;
	byte ageofbird=1;
	public Bird () {
		
		//super(); // biz super i koymasakta java kendisi kullaniyor 
		super(3); // eger parent constructor da 1 den fazla constructor varsa hangisini cagirmak istiyorsan onu yaziyorsun 
	
	//	this. you will be able to see all variables whose names are different from the class itself and and from all parent classes 
	// if you want to see variables whose names are same from parent classes 	do not use this. bacause you cannot see same named variables by using this. 
		System.out.println(super.ageofanimal);
		System.out.println(super.ageofammal);
		System.out.println(super.height);
		System.out.println(super.name);
		super.move(); 
		
		
		System.out.println("Child constructor ran");
		
	}
	public void move() {
		System.out.println("Birds move");
	}
	public void fly() {
		System.out.println("Birds fly");
	}
}
