package day02typecasting_wrapperclasses_scanner;

public class WrapperClassWrk {

	public static void main(String[] args) {
		
		/*
		 primitive data together with methods is called wrapper class or non primitive. 
		 
		 
		primitive 		Wrapper class 
		
		byte			Byte
		short			Short
		int				Integer
		long			Long
		float			Float
		double			Double
		boolean			Boolean
		char			Character
		 
		 
		 */
		int a = 11;
		//" a. " this way java doesnt show any method 
		Integer b = 12; //-> wrapper class Integer 
		//b. this way java shows so many useful methods 
		
		//Every primitive data type has max and min value 
		
		
		System.out.println(b.MAX_VALUE);//2147483647
		System.out.println(b.MIN_VALUE);//-2147483648
		System.out.println(b.min(12, 23));//12 -> this is comparison method java compares two values 
		System.out.println(b.compare(25, 64));//-1 ; in compare if the first one is smaller it returns -1
		System.out.println(b.compare(64, 25));//1  ; if the first one is larger it returns to positive 1 
		System.out.println(b.compare(64, 64));//0  ; if they are equal it returns 0 
		
// we used b. because b is wrapper class. 
		
		Short k = 5; 
		System.out.println(k.MAX_VALUE);// 32767 
		System.out.println(k.MIN_VALUE);// -32768 
		//System.out.println(k.min(12, 23)); -> this command does not exist in Short 
		
		
		
	}

}
