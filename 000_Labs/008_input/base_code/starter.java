/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//first name
		Scanner sc=new Scanner(System.in);
		System.out.print("What is your First name?: ");
		String Firstname=sc.nextLine();
		//age
		System.out.print("What is your age?: ");
		int age = sc.nextInt();
		//Birthday
		System.out.print("What month are you born in: ");
		int month=sc.nextInt();
		System.out.print("What day are you born in?: ");
		int Birthday_day=sc.nextInt();
		System.out.print("What year are you born in?: ");
		int Birthday_year=sc.nextInt();
		//buck fifty
		System.out.print("How much is buck fifty?: ");
		int buck_fifty=sc.nextInt();
		
		
		System.out.println("Your first name is "+Firstname);
		System.out.println("Your age is "+age);
		System.out.println("Date of your birth is "+month+"/"+Birthday_day+"/"+Birthday_year);
		System.out.println("Buck fifty is "+buck_fifty);
		
		
	}
}
