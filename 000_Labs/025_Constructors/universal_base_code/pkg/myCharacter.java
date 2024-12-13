/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int dex;
	int intel;
	int str;
	int chr;

	public myCharacter() {
		role="No role";
		int dex=0;
		int intel=0;
		int str=0;
		int chr=0;
		
	}
	public String getRole(){
		return role;
	}
	public int getDex(){
		return dex;
	}
	public int getStr(){
		return str;
	}
	public int getInt(){
		return intel;
	} 
	public int getChar(){
		return chr;
	}
	public myCharacter(String role){
		if(role.equals("Rogue")||role.equals("rogue")){
			System.out.println("Wow you chose rogue. Sneaky Sneaky.");
		}
		if(role.equals("Warrior")||role.equals("warrior")){
			System.out.println("You chose a warrior. We live to fight!!!");
		}
		if(role.equals("Wizard")||role.equals("wizard")){
			System.out.println("You chose wizard. Do you even know how to use fireball?");
		}
		else{
			System.out.print("No role");
		}
	}

}

