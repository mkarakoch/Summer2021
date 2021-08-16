package Construction;

public class Person  {
	

	 String name;
	 String phoneNubmber;
	 String email;
	 
	 
	 public Person () {
		 
	 }
	 
	 
	 public Person (String name, String phoneNubmber, String email) {
		 this.name=name;
		 this.phoneNubmber=phoneNubmber;
		 this.email=email;
		 
		 
	 }
	 @Override
	 public String toString() {
		 return"Hi my name is"+ name+"\nMy phone number is " + phoneNubmber+"\nMyemail is " + email+"I am belong to : Person Class";
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}


