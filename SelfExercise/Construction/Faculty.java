package Construction;

public class Faculty extends Employee{
	
	Rank rank ;
	int officeHours;
	public Faculty () {
		
	}
	public Faculty (String name, String phoneNumber, String email,boolean office, double salary) {
		super (name,phoneNumber,email, office, salary);
		this.rank=rank;
		this.officeHours=officeHours;
	}
}
