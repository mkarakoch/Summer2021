package day26inheritanceoverriding;

public class Mammal extends Animal{
	String name="Mammal";
	int height=22;
	byte ageofammal=2;
	
	public Mammal (int height) {
		
		System.out.println(height + " cm.");
		
	}
	
	public void move() {
		System.out.println("Mammales move");
	}
	public void eat() {
		System.out.println("Mammales feeds their babies with milk ");
	}

}
