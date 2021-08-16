package Construction;

public class Earbug {
	
	public static String color;
	public static char size;
	
	Earbug () {
		//System.out.println(" Inside the 1st constructor");
	}
	Earbug (String newColor, char newSize) {
		color=newColor;
		size=newSize;
		
		
	}
	
	
	
	public static void on() {
		System.out.println(" the earbugs is on");
		
		
	}
	public static void off ( ) {
		
		System.out.println("the earbug is off");
	}
	
	public static void setColor(String newColor) {
		
		color = newColor;
		
	}
	public static void setSize(char newSize) {
		
		size = newSize;
	}
}