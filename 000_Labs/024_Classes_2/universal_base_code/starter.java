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
		myCharacter stat = new myCharacter();
		String role=stat.getRole();
		int Dex=stat.getDex();
		int Str=stat.getStr();
		int Int=stat.getInt();
		int Char=stat.getChar();
		System.out.println("Your role is "+role);
		System.out.println("Your dexterity is "+Dex);
		System.out.println("Your strength is "+Str);
		System.out.println("Your intelligence is "+Int);
		System.out.println("Your charisma is "+Char);
		
		


		
	}
}
