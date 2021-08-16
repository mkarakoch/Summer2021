package Day23stringbuilders;



public class StringBuilder02 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Java123");
		StringBuilder sb2 = new StringBuilder("Java123");
		
		//how to compare
		
	System.out.println(sb1.equals(sb2));
		
		// StringBuilder equal method is not the same as String equal method
	
		
		System.out.println(sb1.indexOf("1"));//4
		System.out.println(sb1.indexOf("a"));//1
		
		System.out.println(sb1.insert(3, "QX"));//JAVAQX123
		System.out.println(sb1.insert(1, "CCTYWECV",2,5));//JTYWavQXa123
		
		
		System.out.println(sb1.reverse());
		
		sb1.replace(0, 3, "***");
		System.out.println(sb1);
		sb1.replace(5, 13, ".....");
		System.out.println(sb1);
		
		
		sb1.setCharAt(0, '9');//
		System.out.println(sb1);
		
		
		System.out.println(sb1.capacity());
		sb1.trimToSize();//reduce the storage to the size of the string
		System.out.println(sb1.capacity());
		
		
	}

}
