package ForLoops;

public class Car {
	
	// variable
	// method
	// constructor
	// getter setter 
	// public 
	// private 
	// nasil obje olusturuyor
	
	
	
	
	
	int sum = 0;
	String name = "";
	
	String colorString; 
	
	String modelString ; 
	
	private int age ;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
		
		if (age<0) {
			System.out.println(" yas negatif sayi olmaz");
		}
	}


	public Car() {
		
	}
	
	
	// method fiil. action.  behavior
	public void run() {
		
		System.out.println("I am a fast car");
		
	}
	
//	public Constructor(int sum, String name) {
//		super();
//		this.sum = sum;
//		this.name = name;
//	}
	
	
	public void work() {
		
	}
	
	public void race() {
		
	}
	
	

}
