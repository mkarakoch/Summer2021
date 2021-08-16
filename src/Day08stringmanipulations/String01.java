package Day08stringmanipulations;

public class String01 {

	public static void main(String[] args) {
		//8- indexOf () it returns to a  specific character /s and it returns int 
	
		String str1 ="Java is fun to learn and earn";
		
		System.out.println(str1.indexOf('i'));// the index of the first occurrence of the character
		
		System.out.println("fun");//if you use multiple characters indexOf() will return
									//the first occurrence
		
		System.out.println(str1.indexOf("iss"));// if there is no such index it returns -1
		System.out.println(str1.indexOf(" "));// 4  for the space occurrence we look at the first occurrence 
		System.out.println(str1.indexOf('a', 2 )); // 2 means the index to start the search from
		System.out.println(str1.indexOf("arn", 20 )); // 26
		System.out.println(str1.indexOf('a', 5 ));//17
		// 9. lastindexOf() ==>
		
		String str2 = "Learn Java earn money";
		
		System.out.println(str2.lastIndexOf('o'));// index of the last occurrence of the character
		System.out.println(str2.lastIndexOf('a'));//12
		System.out.println(str2.lastIndexOf(""));//21
		System.out.println(str2.lastIndexOf(" "));// 15
		System.out.println(str2.lastIndexOf('j'));//-1
		System.out.println(str2.lastIndexOf('a' , 10));//9
		System.out.println(str2.lastIndexOf('n' , 8));//4
		
		
		
	//10 startwi th()  -- True if the character sequence represented 
						//-- false if the sequence is NOT represented 
		
		
		String str3 = "Java is easy";
		
		
		
		System.out.println(str3.startsWith("j"));
		System.out.println(str3.startsWith("J"));
		System.out.println(str3.startsWith("is" , 5)); // true 5 means where to beginlooking in this 
		
		//11 - endsWith () // tests if this string ends with the specified characters/s
		
		System.out.println(str3.endsWith("y"));//true
		System.out.println(str3.endsWith("ya"));//false
		System.out.println(str3.endsWith("easy"));//true
		System.out.println(str3.endsWith("is easy"));//true
		
		
		//12. isEmpty() Returns {@code true} if, and only if, length() is 0  
		
		String str4 = "";
		
		System.out.println(str4.isEmpty());//true
		
		
		
		//String str5 = null;
		
		//System.out.println(str5.isEmpty());
		
		
		// 13 concat()  Concatenates the specified string to the end of this string.
		
		String str6 = "Ali";
		
		String str7 = "is Cool";
		
		
		System.out.println(str6 + " "+ str7);// Ali is Cool 
		// @param the str String that is concatenated to the end
	     //of another String.
		
		System.out.println(str6.concat(str7).concat(" and smart"));// Ali is Cool and smart 
		System.out.println(str6.concat(" is not cool" ).concat(" but smart"));// Ali is not Cool but smart
		
		
		
		
		//14 replace () 
		
		/* Returns a string resulting from replacing all occurrences of
	     * {@code oldChar} in this string with {@code newChar}.
	     */
		
		String str8 = "$1258";
		
		System.out.println(str8.replace("8", ""));
		
		
		String str9 = "Java is easy to learn";
		System.out.println(str9.replace("easy", "confusing").replace("confusing", "easy"));
		System.out.println(str9.replace("easy", ":)"));
		
		
		
		String str21 = "Java is Java";
		
		System.out.println(str21.indexOf("va" , 2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
