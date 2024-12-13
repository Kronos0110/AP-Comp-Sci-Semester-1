/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc=new Scanner(System.in);
		System.out.print("What is your name?: ");
		String name=sc.nextLine();
		int space=name.indexOf(" ");
		System.out.print("Last name: "+name.substring(space+1));
		

		
	}
}
