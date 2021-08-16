package Day29Exeptions_Abstruction;


/*
1)Abstract methods can be stored in "Abstract Classes"
   2)To create an abstract method, a)Do not put method body
                                   b)Put "abstract" keyword between access modifier and return type
   3)For abstract methods "public", "protected", and "default" access modifiers can be used
     but "private" cannot. Because we create "abstract methods" to access from child classes
	4-
	5-
	6- Only concrete child classes must to override "abstract method", it is not must 
	
*
*
*
*
*/

public abstract class Animal {
	
	public abstract void eat();
	public void drink () {
		System.out.println("They drink");
		
	}
	
	 

}
