package ForLoops;

public class Insan {
	
	
	
	private String name = "";
	private String color ;
	
	private String race ;
	
	private int age ;
	
	
	
	

	public Insan(String name, String color, String race, int age) {
		super();
		this.name = name;
		this.color = color;
		this.race = race;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	
	public void uyur() {
		System.out.println("yuz ustu uyur");
	}
	
	public void sevONu() {
		System.out.println("sev saglam sev");
	}
	
	

}
