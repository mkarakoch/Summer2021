package Edabit;



public class Edabit {

	public static void main(String[] args) {
//		isZip("23565");
//		isZip("1 456");
//		isZip("2m456");
//		System.out.println();
//		isPin(1234);
//		cBinaryy("ALICAN");
//		getmiddle("ALican");
//		System.out.println(isPrefix("automation" , "auto"));
//		isValid("var1112rr");
		removeABC("ALiCan");
		
		
	}
	
		/*
		  Create a function that will remove the letters "a", "b" and "c" 
		  from the given string and return the modified version. 
		  If the given string does not contain "a", "b", or "c", return null.


		 */
		
		public static String removeABC(String words) {
			words=words.toLowerCase();
			words=words.contains("a")||words.contains("b")||words.contains("c")?words.replaceAll("[abc]", ""):null;
			System.out.println(words);
			return words;
					
			
		
	
	}
	
	public static boolean isZipp (String zip) { // farkli bir yontem
		
		
		boolean isZip=zip.matches("\\d{5");
		
		System.out.println((isZip));
		return isZip;
		
		
	}
	public static boolean isZip (String zip) {
	
		System.out.println(zip.length()==5 && !zip.contains(" ")&& zip.matches("\\d+"));
		return zip.length()==5 && zip.contains(" ")&& zip.matches("\\d+");

	}
	
	/*
	 ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything 
	 but exactly 4 digits or exactly 6 digits. Your task is to create a method that 
	 takes a string and returns true if the PIN is valid and false if it's not.
	 */
	
	public static boolean isPin(int w) {
		
		String pin = String.valueOf(w);
		

		return pin.matches("\\d{4}")|| pin.matches("\\d{6}");
		
	}
		public static String cBinaryy(String str) {
			str=str.replaceAll("[a-m[A-M]]","0").replaceAll("[n-z[N-Z]]","1");
			System.out.println(str);
			return str;
		}

		public static String cBinary(String str) {
			
		String s="";
		for(int i=0;i<str.length();i++) {
		if(String.valueOf(str.charAt(i)).matches("[a-m[A-M]]")) {
			s+=0;
		} else if(String.valueOf(str.charAt(i)).matches("[n-z[N-Z]]")) {
			s+=1;
		}
		}	
		return s;	
		}
		
		
		/*
		 Create a function that takes a string and returns the middle character(s). 
		 If the word's length is odd, return the middle character. 
		 If the word's length is even, return the middle two characters.
		 */
		
		
		
		public static String getmiddle(String word) {
		
			int len = word.length();
			int halfw=len/2;
			String str =len%2==0?word.substring(halfw-1,halfw+1)    : word.substring(halfw,halfw+1); 
			System.out.println(str);
			return"";
		
		}
		
		/*
		Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
		isPrefix should return true if it begins with the prefix argument.
		isSuffix should return true if it ends with the suffix argument.
		Otherwise return false.
		
*/
		
		public static boolean isPrefix( String word, String prefix) {
			
			return word.indexOf(prefix)==0;
			
		}
		public static boolean isSuffix( String word, String suffix) {
			
			return word.lastIndexOf(suffix)!=0;
		
		}
		/*
		When creating variables, the variable name must always start with a letter 
		and cannot contain spaces, though numbers and underscores are allowed to be 
		contained in it also.
		Create a function which returns true if a given variable name is valid, 
		otherwise return false.
		
		*/
		
		public static boolean isValid( String variable) {
			boolean bo = variable.matches("^[a-zA-Z].*")&&!variable.contains(" ");
			System.out.println(bo); 
			return(bo);
			
			
			
		}
		
		
		
}
