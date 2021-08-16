package day24_multiThreadSyncenCapsulation;

public class Test1 {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "Java";
		System.out.println(str1==str2);//true
		String str3 = new String ("Java");
		
		
		StringBuilder strbld1 = new StringBuilder ("Java");
		System.out.println(str1.equals(str3)+ " with .equals ");
		System.out.println(str1==str3 + " with str1==str3" );// creates different heap and different referances therefore it is not equal with ==
		
		
		

		if (str1==str2) {
		
		System.out.println("str1 and str2 equal to eachother with == ");
	}
	
	if (str1==str3) { /// creates different referances and different heap therefore they are not equal to each other
						// bcs we created  " new " object
	System.out.println("str1 and str2 equal to eachother eith == ");
}
	if (str1.equals(str3)) {
		
		System.out.println("str1 and str2 equal to eachother with.equals ");
}
//	if (str1==strbld1) {  if you compare data types with "== " Java gives you Compile Time Error 
//		
//		System.out.println("str1 and str2 equal to eachother with.equals ");

if (str1.equals(strbld1)) {
		
		System.out.println("str1 and str2 equal to eachother with.equals()");

	
	
	
}
	}
}
