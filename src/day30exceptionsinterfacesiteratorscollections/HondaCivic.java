package day30exceptionsinterfacesiteratorscollections;

public class HondaCivic implements Engine, AirConditioner, Music{

	@Override
	public void sound() {
		System.out.println("Lower the volume...");
		
	}

	@Override
	public void tune() {
		System.out.println("Tune Honda radio...");
		
	}

	@Override
	public void climate() {
		System.out.println("No need to use, it uses gas too much...");
		
	}

	@Override
	public void gasUsage() {
		System.out.println("It uses gas like smelling...");
		
	}

	@Override
	public void speedLimit() {
		System.out.println("No limit...");
		
	}

	@Override
	public void eat() {
		System.out.println("eat well");
		
		
	}
	
	
	
	

}
