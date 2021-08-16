package Day22DateAccess_Modifiers;

public class AccessModifiers02 {

	public static void main(String[] args) {

		/*
		 * To access any class member from another class there are two ways
		 * 
		 * 1- Call class name => static must be used at 1.st page 2- Create an object 3-
		 * if a class member is private you cant reach from another class 4- If there is
		 * no access modifier it means it is default if class member is default we can
		 * access it from the same package only we cannot reach that classs member from
		 * different package
		 */
		AccesModifiers01 obj1 = new AccesModifiers01();

		System.out.println(obj1.name);

		System.out.println(obj1.schoolName);

		AccessModifiers03 obj2 = new AccessModifiers03();

		System.out.println(obj2.fname);

	}

}
