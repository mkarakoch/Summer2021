package studyGroupEx;

import java.util.Arrays;
import java.util.Random;

public class GameLottery {
	
	/*
	 (Game: lottery) Revise Listing 3.8, Lottery.java, 
	 to generate a lottery of a three-digit number. 
	 The program prompts the user to enter a three-digit number 
	 and determines whether the user wins according to the following rules: 
	 		1. If the user input matches the lottery number in the exact order, the award is $12,000. 
	 		2. If all digits in the user input match all digits in the lottery number, the award is $5,000. 
	 		3. If one digit in the user input matches a digit in the lottery number, the award is $2,000.
	 */
	
	public static void main( String[] arg) {
		
	}
	
	public static String lottery (int input) {
		Random random= new Random ();
		
		int lotteryNumber=99+random.nextInt(1901);
		System.out.println("Lottery number is " + lotteryNumber);
		if (lotteryNumber==input) {
			
			return "$12,000";
			
	//	}else if (Arrays.sort(lottery) == ){
	//		char[] lottery = String.valueOf(lotteryNumber).toCharArray();
	//		char[] inputt = String.valueOf(input).toCharArray();
			
		//	Arrays.sort(inputt);
		}
		return null;
		
		
		
	}

}
