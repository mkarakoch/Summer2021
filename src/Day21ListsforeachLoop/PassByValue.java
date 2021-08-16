package Day21ListsforeachLoop;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {
	
	/*
	1)If you use a variable inside a method, Java does not use the original variable inside the method.
	 	 Java creates the copy of the variable the use the copy inside the method.
	 	 By using the copy, Java protects the original value from method updates.
	 	 
	 	 This feature is called "Pass by value" in Java
	 	2)If you insist to update original value, you can do it by assigning method return to the variable like;
	 	 a = increase(a);
	 	 
	 */

	public static void main(String[] args) {
		int a =10;
		System.out.println("After method call: " + a);
		
		increase(a);
		System.out.println("After method call :" +a );
		/*
		 For immtable objects, method call does not change the original value like in primitives. 
		 if you wanna change original value you should do assingment like 
		 s=putQuestionmark(s)
		 
		 */
		String s = "Are you tired ";
		System.out.println("Before method call:" + s);//Before method call:Are you tired 
		putQuestionMark(s);// takes to copy of original 
		System.out.println("Before method call:" + s);//Before method call:Are you tired 
	/*
	 For mutable objects java copys the reference then use the copy of reference inside the method.
	 referance itself and copy of referance points the same object becaus eof that when you call a method 
	 for imutable objects original value will be updated
	 */
	
	List<String>list = new ArrayList<>();
	
	list.add("Hi");
	list.add("Woow");
	list.add("Sorry");
	List<String>list1 =  List.copyOf(list);
	
	System.out.println("Before method call " + list);
	
	putExclamationMark(list);
	System.out.println("After method call " + list);//copys the original list makes change upon this
	}
	
	public static int increase (int x) {
		return x*3;
		
		
		
	}
	public static String putQuestionMark(String str) {
		return str + "?";
		
	}
	
	public static List putExclamationMark(List<String>list) {
		
		for (int i=0 ; i<list.size(); i++) {
			list.set(i,list.get(i) + "!");
				
			}
		return list;
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

