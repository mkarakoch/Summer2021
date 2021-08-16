package Day23stringbuilders;

public class StringBuilt01 {

	public static void main(String[] args) {
		
		//String is immutable and Java create StringBuilder to handle this 
		// how to create a string builder
		
		
		//1.st way 
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb);
		System.out.println("The default value capacity is " + sb.capacity());
		
		
		System.out.println(sb);
		
		sb.append("Muhammet");
		System.out.println(sb);
		
		
		sb.append(" Karakoc");
		
		System.out.println(sb);
		
		StringBuilder name = new StringBuilder();
		
		name.append("Orhan");
		//name.toUpperCase();

		System.out.println(name);
		
		
		sb.append(" is one of the best qa engineer ");
		
		System.out.println(sb);
		
		
		//Paramater
		StringBuilder sb1 = new StringBuilder ("Muhammet").append(" Karakoc");
		sb1.append(" and Mehmet will find a job in a short period of time");
		
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		StringBuilder sb3 = new StringBuilder (3);
		
		// Capacity
		sb3.append("Alper");
		System.out.println(sb3);
		sb3.append(" Yilmaz");
		System.out.println(sb3);
		
		
		// Chaining 
		
		StringBuilder sb4 = new StringBuilder("Java");
		
		sb4.append(" +").append(" Selenium").append(" +").append(" SQL ");
		System.out.println(sb4);
		
		
		// to append some chars between specific index
		sb4.append(sb4, 5, 12);
		System.out.println(sb4);
		
		
		StringBuilder sb5 = new StringBuilder("Ayse");
		
		System.out.println(sb5);
		
		sb5.append(" Ozipek", 0 , 3);
		System.out.println(sb5);
		
		// to get the character in a scpecific index
		
		System.out.println(sb5.charAt(5));
		
		
		
		// to delete some characters between spesific indexes
		
		System.out.println("sb4 before delete : " + sb4);
		
		sb4.delete(0, 7);
		System.out.println("sb4 after delete : "  + sb4);
		
		
		sb4.deleteCharAt(12);
		
		System.out.println(sb4);
		
		
		
		
		
		
		
		
		
	}

}
