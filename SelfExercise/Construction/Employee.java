package Construction;

import java.sql.Date;
import java.time.LocalDate;

public class Employee extends Person{
	
	boolean office;
	double salary;
	LocalDate dateHired;
	
	

public Employee () {

}
public Employee (String name, String phoneNumber, String email,boolean office, double salary) {
	super (name,phoneNumber,email);
	this.office=office;
	this.salary=salary;
	this.dateHired= LocalDate.now();
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}