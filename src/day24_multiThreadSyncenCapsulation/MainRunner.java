package day24_multiThreadSyncenCapsulation;

public class MainRunner {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.move();
		cat1.eat();
		cat1.meow();
		
		System.out.println("****************");
		
		dog dog1 = new dog ();
		
		dog1.bark();
		dog1.eat();
		dog1.move();
		
		System.out.println("****************");
		
		bird bird1 = new bird ();
		
		bird1.eat();
		bird1.fly();
		bird1.move();

	}

}
