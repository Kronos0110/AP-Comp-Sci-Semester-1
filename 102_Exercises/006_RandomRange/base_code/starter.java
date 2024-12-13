/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc=new Scanner(System.in);
		System.out.print("What is first integer: ");
		int first_int=sc.nextInt();
		System.out.print("What is second integer(Bigger than first): ");
		int second_int=sc.nextInt();
		double range=second_int-first_int;
		int a=(int)(Math.random()*range)+first_int;
		int b=(int)(Math.random()*range)+first_int;
		int c=(int)(Math.random()*range)+first_int;
		int d=(int)(Math.random()*range)+first_int;
		int e=(int)(Math.random()*range)+first_int;
		System.out.print("5 Number in your range is: ");
		System.out.print(a+" "+b+" "+c+" "+d+" "+e);
	}
}
