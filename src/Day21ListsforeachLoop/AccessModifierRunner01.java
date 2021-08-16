package Day21ListsforeachLoop;

import day24_multiThreadSyncenCapsulation.AccsessModifier01;

public class AccessModifierRunner01 extends AccsessModifier01 {

	private Object address;

	public static void main(String[] args) {
		
		
	
		AccessModifierRunner01 obj1 = new AccessModifierRunner01();
		
	
		
		/*
		  -by using obj1. you cant access to profession because private cant be seen because profession is private and you are in a different class
	 	  - By usinf obj1, you cant access to sechool because school is using default access modifier access modifier and you cannot access default class members from any other packeges 
		 - by using obj1 you cannnot access to adress because adress is using protected access modifier and you cannot access protected class members 
		 from anyother packages if they are not child class
		 4- by usinf obj1 you can access to name because it is public 
		 
		 *
		 */
//		System.out.println();
//		System.out.println(obj1.address);
//			

		
	 /// Duzelt !!!

	}

}
