/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the first number: ");
		int first=sc.nextInt();
		System.out.print("Input the second number: ");
		int second=sc.nextInt();
		if(first%2==0){
			System.out.println("First number is even");
		}
		else{
			System.out.println("First number is odd");
		}
		if(second%2==0){
			System.out.println("Second number is even");
		}
		else{
			System.out.println("Second number is odd");
		}
		if(first%3==0&&second%3==0){
			if(first%4==0&&second%4==0){
				
				if(first%5==0&&second%5==0){
					System.out.print("Both number is divisible by 3,4 and 5");
				}
				else if(first%5!=0||second%5!=0){
			System.out.print("Not divisible by 5");
			}

				
			}
			else if(first%4!=0||second%4!=0){
			System.out.print("Not divisible by 4");
			}
			
			
		}
		else if(first%3!=0||second%3!=0){
			System.out.print("Not divisible by 3");
		}
}
}