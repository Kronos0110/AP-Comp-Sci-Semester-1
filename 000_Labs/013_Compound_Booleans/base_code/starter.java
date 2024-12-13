/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.print("What is the first integer: ");
		int a=sc.nextInt();
		System.out.print("What is the second integer: ");
		int b=sc.nextInt();
		System.out.print("What is the thrid integer: ");
		int c=sc.nextInt();
		
		if(a>b && a>c){
			System.out.print("First number is largest!");
		}
		else if(b>a && b>c){
			System.out.print("Second number is largest!");
		}
		else if(c>a && c>b){
			System.out.print("Third number is largest!");
		}
		else{
			System.out.print("There is equal number");
		}
		System.out.println(" ");
		if(a<b && a<c){
			System.out.print("First number is smallest!");
		}
		else if(b<a && b<c){
			System.out.print("Second number is smallest!");
		}
		else if(c<a && c<b){
			System.out.print("Third number is smallest!");
		}
		else{
			System.out.print("There is equal number");
		}
		
	}
}
