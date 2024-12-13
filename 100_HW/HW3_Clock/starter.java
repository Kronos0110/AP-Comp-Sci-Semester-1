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
		Scanner sc= new Scanner(System.in);
		System.out.print("What day is it? Put in integer from 0~6: ");
		int day = sc.nextInt();
		if(day==0){
			System.out.println("Wake up late it's fine");
		}
		else if(day==1){
			System.out.println("Fresh new Monday. Wake up at 7am");
		}
		else if(day==2){
			System.out.println("Already Tuesday. Only 4 days left. It's 7am!");
		}
		else if(day==3){
			System.out.println("Wake up! Wake up! Wake up! Prepare for school!");
		}
		else if(day==4){
			System.out.println("Thursday. More than half way through... It's 7 wake up...");
		}
		else if(day==5){
			System.out.println("Friday. Last day at school finally.");
		}
		else if(day==6){
			System.out.println("Finally can have some sleep");
		}
		else{
			System.out.println("I don't know what day it is but just wake up.");
		}
	}
}
