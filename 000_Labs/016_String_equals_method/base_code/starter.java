/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner(System.in);
		String x=new String("Wizard");
		String y=new String("wizard");
		String a=new String("Warrior");
		String b=new String("warriror");
		String c=new String("Rogue");
		String d=new String("rogue");
		
		boolean equals;
		System.out.print("Choose job between Wizard, Warrior, or a Rouge: ");
		String input = sc.nextLine();
		if(x.equals(input)){
			System.out.println("You chose Wizard");
		}
		else if(y.equals(input)){
			System.out.print("You chose Wizard");
		}
		else if(a.equals(input)||b.equals(input)){
			System.out.println("You chose Warrior");
		}
		else if(c.equals(input)|| d.equals(input)){
			System.out.println("You chose Rogue");
		}
		else{
			System.out.println("You chose job that does not exist. Ending Game.");
		}
	}
}
