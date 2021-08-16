package selfexercises;

public class StringManipulations2 {

	public static void main(String[] args) {
		
		// 8 - indexOf () it returns to aspecific character/s and it returns int 
		
		String str8 = "Java is fun to learn and earn";
		System.out.println(str8.indexOf("i")); // 	the index of the first occurrence of the character 	
		System.out.println(str8.indexOf("fun"));// if you se multiple characters it will return the first occurrence
		System.out.println(str8.indexOf("iss"));// there is no such  characters so it will return -1
		System.out.println(str8.indexOf(" ")); // 4 bec space is a character
		System.out.println(str8.indexOf('a' , 2 ));// 2 yi atliyor 2 den sonraki ilk a nin numarasi = 3
		System.out.println(str8.indexOf("arn" , 20 ));//26
		System.out.println(str8.indexOf('a' , 5 ));//17
		
		
		// 9. lastindexOf() 
		
		String str9 = "Learn Java earn money";
		
		System.out.println(str9.lastIndexOf('o'));//17
		System.out.println(str9.lastIndexOf('a'));//12
		System.out.println(str9.lastIndexOf(""));//21 sonuna kada olan tum karakterleri soruyor 
		System.out.println(str9.lastIndexOf(" "));//15
		System.out.println(str9.lastIndexOf('j'));//-1
		System.out.println(str9.lastIndexOf('a' , 10));//9
		System.out.println(str9.lastIndexOf('n' , 8));//4

		
		// 10 startWith () -- True if the character sequence represented
					// 		-- False is the sequence represented 
		
		String str10 = "Java is easy";
		
		System.out.println(str10.startsWith("j"));//false bec it does not star with lowercase j
		System.out.println(str10.startsWith("J"));// True because it stars with caital J
		System.out.println(str10.startsWith("is" , 5));//true becasue is is 5. one 
		

		// 11 endsWith () tests if this String end with the specified character/s
		System.out.println(str10.endsWith("y"));//true
		System.out.println(str10.endsWith("sy"));//true
		System.out.println(str10.endsWith("is easy"));//true
		System.out.println(str10.endsWith("ya"));//false
		
		// 12 is Empty Returns true if , and only if , length () is 0
		
		String str13 = "";
		
		System.out.println(str13.isEmpty());
		
		String str14 = null; // you can't use null for String manipulations 
		
		
		
		
		
		
		
		// 13 .concat()
		String str11 = "Maho";
		
		String str12 = " Aga is the best";
		
		System.out.println(str11 + str12);
		
		System.out.println(str11 + "" + str12);
		
		System.out.println(str11.concat(str12));
		System.out.println(str11.concat(str12) + " but not cool");
		
		
		//14 replace 
		
		String str15 = "$432";
		
		System.out.println(str15.replace("4", "8"));
		
		
		String str16 = "Seni ogrenecem lan Java, sen mi buyuk ben mi";
		
		
		System.out.println(str16.replace("Java","").replace("ben mi", "ben mi?"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
