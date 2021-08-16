package Day15Constructors;

public class AnimalRunner {

	public static void main(String[] args) {
	Animal a01 = new Animal("Puppy");
	System.out.println(a01.age);
	System.out.println(a01.name);
	System.out.println(a01.specy);
	System.out.println(a01.gender);
	System.out.println(a01.isCarnivorous);///  All these are class variables
	
	System.out.println(Animal.counter); // this is class variable 
	}

}
