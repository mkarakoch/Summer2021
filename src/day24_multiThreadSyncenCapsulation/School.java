package day24_multiThreadSyncenCapsulation;

public class School {

	public static void main(String[] args) {
		//1.st way default constructor
		Student student1 = new Student ();
		System.out.println(student1.getName());//Mark Stone
		
		student1.setName("Ali Can");//Updeteed the name 
		System.out.println(student1.getName());// AliCan
//		System.out.println(student1);
//		
//		Student student2 = new Student("Veli Han", 23, false);
//		System.out.println(student2);

		// This way no body can see anything because we cmmend out override from Student class
		
		//2.way use constr with parameters
		Student student2 = new Student("Veli Han ",43, true);
		
	
		
		//3. Way  create by usinf dafaul tcons then update teh calues by usinf setters
		Student student3 = new Student();
		student3.setName("Mary Star");
		student3.isSuccessful(false);
		
	}

}
