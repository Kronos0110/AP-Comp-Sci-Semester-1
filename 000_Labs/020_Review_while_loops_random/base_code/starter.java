/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		int ran=(int)(Math.random()*1001);
		int guess=-1;
		while(guess!=ran){
			System.out.print("Guess the number: ");
			guess=sc.nextInt();
			if(guess>ran){
			System.out.println("You guessed it too big");
			}
			else if(guess<ran){
				System.out.println("You guessed it too small");
			}
				
			
		}
		if(guess==ran){
			System.out.print("You guessed it right");
		}
		



		
	}
}
