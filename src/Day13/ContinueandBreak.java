package Day13;

import java.util.Scanner;

public class ContinueandBreak {

	public static void main(String[] args) {
		/*
		  Continue : If I want to skip 
		  
		  Break:
		  
		 * 
		 */
for(int i = 1 ; i<6; i++) {
            
            if(i==3 || i==5) {
                
                continue;
            }
            
            System.out.println(i+ " ");
        }
        
        /*
         Ask user to enter an integer and print them until 10
             
         */
        Scanner scan = new Scanner(System.in);
        
        
        do {
            System.out.println("Enter an Integer");
            int num = scan.nextInt();
            if(num==10) {
                break;
            }else {
                System.out.println(num +" ");
            }
                
        }while(true);
            
        System.out.println("you stopped the loop by BREAK");
        
        scan.close();
        
		}
	}


