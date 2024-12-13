/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		int x=(int)(Math.random()*1000);
		System.out.print("Guess number between 1~1000: ");
		int input=sc.nextInt();
		if(x==input){
			System.out.print("You are right.");
		}
		else if(x>input){
			System.out.print("Your input is small.");
		}
		else if(x<input){
			System.out.print("Your input is too big.");
		}
	}
}



