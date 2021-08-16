package studyGroupEx;



public class Bianary {
	  public static void binary(String name){//'a' n,a,m,e
		  String store="";
		     for(int i=0;i<name.length();i++){
		        if(name.charAt(i)>='a'&&name.charAt(i)<='m'){
		            store+=String.valueOf(0);
		        }if(name.charAt(i)>='n'&&name.charAt(i)<='z'){
		            store+="1";
		         }
		     }
		        System.out.println(store);
		    }
	  
	  //Create a method that takes a string as an argument 
	  //and converts the first character of each word to uppercase. 
	  //Return the newly formatted string.
	  
	  public static void capitalizer(String str ) {
		
		
		 
		  
	}
/*
 Write a function that removes any non-letters from a string, 
 returning a well-known film title.

 */
	  
	  public static void remover (String jake) {
		  String store="";
		  
		jake=jake.replace("[^a-zA-z]", " ");
		 System.out.println(jake);
		 
	  }
	  
	  /*
	    Create a method that accepts an array of two strings 
	    and checks if the letters in the second string are present 
	    in the first string.
	    
	   */
	  public static boolean arePresent(String[] arr1){// [String, String2], String.contains()
		    for(int i=0;i<arr1[1].length();i++){
		        if(!arr1[0].toLowerCase().contains(Character.toLowerCase(arr1[1].charAt(i))+""))
		            return false;
		    }
		return true;
		    //ie a ution that returns the first n vowels of a string. 
		
	//	public static String vowels(String vovi, int a ) {
			
		}
	/*  Wurst is the best. Create a method that takes a string and replaces every mention of any type of sausage with the German word "Wurst," unless—of course—the sausage is already a type of German "Wurst" (i.e. "Bratwurst", see below), then leave the sausage name unchanged.
	  German WurstsConvert to WurstBratwurstKielbasaKochwurstChorizoLeberwurstMorongaMettwurstSalamiRostbratwurstSausage~Andouille~Naem~Merguez~Gurka~Snorkers~Pepperoni
	  Rules
	  Append sausages from the "Convert to Wurst" column with "wurst".
	  Do not replace any German sausage with the word "Wurst".
	  The word "Wurst" must be title case.
	*/
	  public static void wurst(String str){
		    String[] fakeWurst="chorizos Pepperoni Snorkers Gurka sausages".split(" ");
		for(String w:fakeWurst){
		    if(str.toLowerCase().contains(w.toLowerCase())){
		       str =str.replace(w,"wurst");
		    }
		}
		    System.out.println(str);
		}
	  
	
	  
	  public static void main(String[] args) {
		binary("Muhammet");
		remover("#%$#$TGergiejjk0i45ig");// bir yanlislik var karakterleri cikarmiyor 
	//	System.out.println(arePresent(newString[] {"areaFSFSDF","Afdsa"}));
	//  System.out.println(vowels("ALI canALiCan", 5));
	  
	  }

}
