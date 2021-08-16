package TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		char[][] gameboard = 
		{ {' ', '|' , ' ', '|', ' '},  
		  {'-', '+' , '-', '+', '-'},
		  {' ', '|' , ' ', '|', ' '},
		  {'-', '+' , '-', '+', '-'},
		  {' ', '|' , ' ', '|', ' '} };
			 

		
		
		
		while (true) {
			Scanner scan =new Scanner (System.in);
			System.out.println("Enter your placement (1-9):");
			int playerPos = scan.nextInt();
			
			
		
			placePiece(gameboard, playerPos, "player");
			Random rand = new Random ();
			int cpuPos = rand.nextInt(9) +1;
			
			placePiece(gameboard, cpuPos, "cpu");
			printGameBoard (gameboard);
		}
		
	}
	
	
	
	
	
	
	public static void  printGameBoard (char [] [] gameboard){
		for (char[] row : gameboard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void placePiece (char [] [] gameboard, int pos, String user) {
		
		char symbol = ' ';
		
		
		if ( user.equals("player" + " ")) {
		
			symbol = 'X';
			
		}else if (user.equals("cpu")) {
			symbol = 'O';
			
		}
		
		
		
		
		switch (pos) {
		case 1: 
			gameboard [0][0] = symbol;
			break;
		case 2: 
			gameboard [0][2] = symbol;
			break;
		case 3: 
			gameboard [0][4] = symbol;
			break;
		case 4: 
			gameboard [2][0] = symbol;
			break;
		case 5: 
			gameboard [2][2] = symbol;
			break;
		case 6: 
			gameboard [2][4] = symbol;
			break;	
		case 7: 
			gameboard [4][0] = symbol;
			break;
		case 8: 
			gameboard [4][2] = symbol;
			break;
		case 9: 
			gameboard [4][4] = symbol;
			break;	
		default: 
			break;
			
		
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
