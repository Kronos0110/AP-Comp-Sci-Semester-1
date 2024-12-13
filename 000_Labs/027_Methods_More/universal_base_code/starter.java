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
		Scanner sc=new Scanner(System.in);
		BaseClass stat = new BaseClass();
		String role=stat.getRole();
		int Dex=stat.getDex();
		int Str=stat.getStr();
		int Int=stat.getInt();
		int Char=stat.getChar();
		
		System.out.println("Your Dexerity is "+Dex);
		System.out.println("Your Strength is "+Str);
		System.out.println("Your Intelligence is "+Int);
		System.out.println("Your Charisma is "+Char);
		System.out.println("Role you have right now is "+stat.getRole());
		
		System.out.println("--------------------------------------------------");
		System.out.print("What role do you want?: ");
		role=sc.nextLine();
		BaseClass stat1 = new BaseClass(role);
		System.out.println("Your Dexerity is "+Dex);
		System.out.println("Your Strength is "+Str);
		System.out.println("Your Intelligence is "+Int);
		System.out.println("Your Charisma is "+Char);
		
		
		


		
	}
}
