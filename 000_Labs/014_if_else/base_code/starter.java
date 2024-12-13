/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int x=(int)((Math.random()*1000)+1);
		System.out.println("Let's play guessing game!");
		System.out.println("Guess integer between 1 and 1000: ");
		int guess=sc.nextInt();
		if(x==guess){
			System.out.println("You are right");
		}
		else{
			System.out.println("You are wrong. Number was "+x);
		}
		
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	
	}
}
