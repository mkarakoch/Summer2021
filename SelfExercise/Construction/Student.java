package Construction;

public class Student extends Person {
	Status status;
	
	
	public Student () {
		
		
	}
	
	public Student(String name, String phoneNumber, String email, Status status) {
		super (name,phoneNumber, email);
		this.status=status;
		
		
		
			
		}
	public String toString() {
		
		return "Hi my name is "+ name+ " \nMy phone number is " + phoneNubmber+ "\nMyemail is " + email+ "\nI am a " + status + "I em belong to Student Class";
		 
	 }
	 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

