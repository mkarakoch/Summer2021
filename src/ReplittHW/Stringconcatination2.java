package ReplittHW;

public class Stringconcatination2 {

	public static void main(String[] args) {
		
		
		String name1 = "mehmet";
		
		String name2="ahmet";
		 int len = name1.length();
		
		if (len%2!=0) {
			  System.out.println("Please insert a valid name");
			  }else {
			  System.out.println( name1.substring(0,name1.length()/2) + name2 + name1.substring(name1.length()/2));
			  }
		

	}

}
