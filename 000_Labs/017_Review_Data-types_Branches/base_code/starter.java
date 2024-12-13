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
		Scanner sc=new Scanner(System.in);
		int str=0;
		int dex=0;
		int Int=0;
		int cha=0;
		String x=new String("Wizard");
		String y=new String("wizard");
		String a=new String("Warrior");
		String b=new String("warriror");
		String c=new String("Rogue");
		String d=new String("rogue");
		
		System.out.print("What is the name you want?: ");
		String name = sc.nextLine();
		System.out.print("What is title you want?: ");
		String title = sc.nextLine();
		boolean equals;
		System.out.print("Choose job between Wizard, Warrior, or a Rogue: ");
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
		int initial=20;
		System.out.println("You have 20 points for stats at initial.");
		System.out.println("You can put 10 points maximum to each stat.");
		if(initial>0){
			System.out.print("How many points do you want on Strength: ");
			str =sc.nextInt();
			initial = initial -str;
			System.out.println("You have "+initial+" points left");
			if(initial>0){
				System.out.print("How many point do you want on Dexerity: ");
				dex =sc.nextInt();
				initial = initial -dex;
				System.out.println("You have "+initial+" points left");
				if(initial>0){
					System.out.print("How many points do you want on Intelligence: ");
					Int=sc.nextInt();
					initial = initial -Int;
					System.out.println("You have "+initial+" points left");
					if(initial>0){
						System.out.print("How many points on Charisma: ");
						cha=sc.nextInt();
						initial =initial -cha;
						System.out.println("You have "+initial+" points left");
					}
				}
			}
			
		}
		else{
			System.out.print("Error");
		
		
	}
	if(initial>=0&&str<=10&&dex<=10&&Int<=10&&cha<=10){
		
		System.out.println("\n"+name+" [ "+title+" ] ");
		System.out.println("Your Strength is: "+str+"\nYour Dexterity is: "+dex+"\nYour Intelligence is: "+Int+"\nYour Charisma is: "+cha);
	}
	else{
		System.out.print("I wish you check your numbers again");
	}
}
}
