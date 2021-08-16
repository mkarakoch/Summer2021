package Day28exections;

public class E03 {

	public static void main(String[] args) {
		/*
		 1 ArrayIndexOutBoundException is thrown if you use non existing index in Arrays 
		 2 ArrayIndexOutBoundException is unchecekd exception 
		 */
		
				
			
//		String s[] = {"A" , "D" , "B" ,"C"};
	//	
//			System.out.println(s[2]); //B
//			try {
//				
//				System.out.println(s[4]); // ArrayIndexOutOfBoundException
//			}catch ( ArrayIndexOutOfBoundsException e){
//				System.out.println("Do not use non existing idex " + e.getMessage());
//			}
				//ClassCastException
//				Object obj = 70 ;
//				
//				String num = (String ) obj;
				
				// NumberFormatException
				String s1 = "1a2b3c";
				
				try {
				int num1 = Integer.parseInt(s1); // //NumberFormatException
				System.out.println(num1 + 5);//128
				}catch (NumberFormatException e) {
					
					System.out.println("You used non-digit characters in the String");
				}
						

	}

}
