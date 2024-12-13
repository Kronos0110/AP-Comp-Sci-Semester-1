/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("What is your name?: ");
		String name = sc.nextLine();
		System.out.print("How many time should it be printed out: ");
		int times=sc.nextInt();
		while(times>x){
			System.out.print(name+" ");
			x=x+1;
		}


		
	}
}
