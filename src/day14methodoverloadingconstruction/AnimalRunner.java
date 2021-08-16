package day14methodoverloadingconstruction;

public class AnimalRunner {
	public static void main (String [] arg) {
		
		Animal a01 = new Animal ();
		Animal a02 = new Animal ("Bobby", 7, "Golden" );
		Animal a03 = new Animal (7, "Puppy" );
		/*If you want to look at the value of a class variable 
		 from anouther class, use class name first then use 
		 variable name by putting "." between them 
		 */
		System.out.println(Animal.counter);
		
	}

}
