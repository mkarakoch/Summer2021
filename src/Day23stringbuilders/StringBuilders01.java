package Day23stringbuilders;

public class StringBuilders01 {

	public static void main(String[] args) {
		/*
		  How to create a String by usinf String Builder
		  
		 
		 */
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb);//emoty String 
		System.out.println(sb.capacity());// default capacity is 16
		sb.append("Ali");
		sb.append(" is friend of veli");
		
		System.out.println(sb);//Ali
		
//		String str = " Veli";
//		System.out.println(str);
//		str.toUpperCase();
//		System.out.println(str);
		
			// 2. Way 
		
		StringBuilder sb1 = new StringBuilder("Veli is my friend");
		System.out.println(sb1);
		
		sb1.append(" and my classmate");
		
		System.out.println(sb1);
		
		// 3.rd way
		
		StringBuilder sb2 = new StringBuilder(5);//5 is capacity// you reserve a capacity and doesnt use the unnecessery default space
		
		
		sb2.append("Javax");// if extendsthe capacitysb2.capacity() with this formula java will extend the capacity 
		System.out.println(sb2);
		
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		
		// StringBuilder method append() in chain 
		
		StringBuilder sb3 = new StringBuilder("Java");
		
		sb3.append('q').append('z').append('u');
		
		System.out.println(sb3);
		
		//2.
		
		sb3.append("Ahmet", 1, 3);
		
		System.out.println(sb3);//Javaqzuhm// adds firsst and second charachters. 1 included 3rd excluded
		System.out.println(sb3.charAt(5));// z 5th charachter
		
		// deleting 
		
		sb3.delete(4,7 );
		System.out.println(sb3);// 4. ten 7  ye kadar olan karakterler silindi 
		
		sb3.deleteCharAt(0);
		System.out.println(sb3);//avahm
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
