package selfexercises;

public class Students {
		
	String name;
	static String id;
	int grade;
	int registrationYear;
	static int counter = 1000;
	
	// i didn't assign anything so the value should be null 
	// static is to be visible for all object 
	
	public void setId() {
	counter++;
	id = " " + registrationYear  + grade + counter++;
	
	// // registrationYear + grade + counter; they are all int but id isnt
	}

	
	public Students (String name, int grade, int registrationYear) {
		
		this.name = name;
		this.grade = grade;
		this.registrationYear = registrationYear;
		setId();
		
		
	}
	
	
	
	
	
	
}  
