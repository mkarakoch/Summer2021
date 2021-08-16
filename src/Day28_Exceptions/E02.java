package Day28_Exceptions;

/*
 * NullPointerException is unchecked exception==> run time exception
 * when we try to get sth which is null
 * 
 * we can not use "try block" alone
 * a) try+catch
 * b)try+multiple catch
 * c)try+catch+finally  /   try+multiple catch+finally
 * d)try+finally
 * 
 * we can use finally to close our file or database. it will be executed in any condition
 * if we do not close our database 
 * it can cause some security problems
 * data leakage
 * it means you will pay a lot to the cloud company
 */

public class E02 {

	public static void main(String[] args) {
		
		
		String str1 = "";
		
		System.out.println(str1.length());
		
		String str2 = null;
		try {
		System.out.println(str2.length());
		
	}catch (Exception e) {
		
		System.out.println("Senin lenghtin yok.");
	}finally {
		System.out.println("This wil be printed in any condition");
		System.out.println("Enough of your problems");
	
	}
		System.out.println("I love java ");
		
	}

}
