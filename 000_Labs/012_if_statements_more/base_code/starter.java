/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the first number: ");
		int a = sc.nextInt();
		System.out.println("Input the second number: ");
		int b = sc.nextInt();
		if(a==b){
			System.out.println("Number is equal to each other.");
		}
		else{
			System.out.println("Number is not euqal to each other");
		}
		
	}
}
