package OfficaadvanceClass2962021;

public class NumberofJavaAppears {

	public static void main(String[] args) {
		/*
		 	Write a method and calculate how many JAVA is typed on the string.
		    Example intput str="javajavaxxxahmet"
		    
		   */
		String str = "javajavaxxxahmet";
		dummy(str);  // it is a some sort of method 
	}
		
		public static void dummy(String str ) {
			int num=(str.length()-(str.replace("java" , "")).length())/4;
			System.out.println("JAVA word is repeated=" + num + " times"  );
		}
		
		
		
	

}
