package day16StaticKeyword;

public class students {
	
	
	String name;
	static	String id; // made it static to make it unique 
	int grade;
	int year;
	static int counter = 1000;
	
	


	public students(String name, int grade, int year) {

		this.name = name;
		this.grade = grade;
		this.year = year;
		setId();
	}
	public void setId () {
		counter++;
		id = "" + year + grade + counter;
		
		
	}


}
