package Construction;

	public class Staff extends Employee{
		String title;
		
		public Staff () {
			
		}
		public Staff (String name, String phoneNumber, String email,boolean office, double salary,String title) {
			super (name,phoneNumber,email, office, salary);
			this.title=title;
			
	}
	}


