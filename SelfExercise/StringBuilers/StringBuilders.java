package StringBuilers;

public class StringBuilders {

	
	public static void main(String[] args) {
		
		// String is immutable, java created StringBuilers to handle to this problem. 
		

		// 1.st way
		
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb);
		System.out.println("The default value capacity is "  + sb.capacity()) ;
		
		System.out.println(sb);
		
		sb.append("Muhammet");
		System.out.println(sb);
		
		sb.append(" Emin");
		System.out.println(sb);
		
		sb.append(" KARAKOC");
		System.out.println(sb);
		
		sb.append(" will be a sowtware developer");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder ("Muhammet").append(" Karakoc");
		sb1.append(" and Mehmet will find a job easyly");
		
		
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		
		
		StringBuilder sb3 = new StringBuilder(3);
		
		// Capacity
		
		sb3.append("Alper");
		
		System.out.println(sb3);
		sb3.append(" Yilmaz");
		
		System.out.println(sb3);
		System.out.println(sb3.capacity());
	
		
		//trim capacity 
		
		sb3.trimToSize();
		System.out.println(sb3.capacity());
		
		// Chaining 
		
		StringBuilder sb4 = new StringBuilder("Java");
		
		sb4.append( "+").append(" JavaScript").append(" +").append(" Selenium").append(" +").append(" SQL");
		
		System.out.println(sb4);//Java +JavaScript + Selenium + SQL  
		
		
		StringBuilder sb5 = new StringBuilder("Seni");
		sb5.append(" YENECEM").append(" Ulan").append(" Java").append(" sen mi").append(" buyuksun ").append("BEN mi?");
		
		System.out.println(sb5);
		
		// to append chars between specific index
		
		sb5.append(" "+sb5, 0, 5);
		sb5.append(" de Gorecez", 0,11);
		
		System.out.println(sb5);
		
		
		
		StringBuilder sb6 = new StringBuilder("Gamze");
		
		System.out.println(sb6);
		
		sb6.append( " Ceylan" , 0,7);
		System.out.println(sb6);
		
		
		// delete somechars betw specific indexes 
		
		System.out.println("Before delete :" + sb5);
		
		sb5.delete(13,18);
		System.out.println("After delete :" + sb5);
		
		sb5.deleteCharAt(sb.length()-10);
		System.out.println(sb5);
		
		sb5.replace(40, 49, ", AMK " );
		System.out.println(sb5);
		
		StringBuilder sb7 = new StringBuilder("JAVA123");
		StringBuilder sb8 = new StringBuilder("JAVA123");
		StringBuilder sb9 = new StringBuilder("JAVAM123");
		
		System.out.println(sb7==sb8);//false
		System.out.println(sb7.equals(sb8));//false
	
		//1.st way
		System.out.println(sb7.toString().equals(sb8.toString()));//true // sb7 nin toString'i, sb8 in toString'ine esit mi demek?  
		
		//2. way
		System.out.println(sb7.compareTo(sb8));//0 meaning true 
		System.out.println(sb7.compareTo(sb9));//-28 mening false 
		
		
		// Stringbuilder equal method is not as same as String equal method
		
		System.out.println(sb7.indexOf("1"));//  4. sirada 1 var 
		System.out.println(sb7.indexOf("a"));// cunku boyle bir deger yok 
		
		// adding in between the word 
		
		System.out.println(sb7.insert(4, " mi "));// JAVA mi 123
		System.out.println(sb7.insert(4, " ninAMK", 0, 4));// JAVA nin mi 123
		
		//reverse
		System.out.println(sb7.reverse());
		System.out.println(sb7.reverse());
		
		/// replace mi ***
		  
		sb7.replace(5, 8, "***");
		System.out.println(sb7);
		
		sb7.replace(12, 16, "-*-");
		System.out.println(sb7);
		
		sb7.setCharAt(6, '|');
		System.out.println(sb7);
		
		
		System.out.println(sb7.capacity());
		sb7.trimToSize();
		System.out.println(sb7.capacity());
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 
	}

}