/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int dex;
	int intel;
	int str;
	int chr;

	public BaseClass() {
		role=new String("No role");
		int dex=0;
		int intel=0;
		int str=0;
		int chr=0;
	}
	public BaseClass(String r,int d, int i, int s, int c){
		role=r;
		dex=d;
		intel=i;
		str=s;
		chr=c;
	}
		
	
	public String getRole(){
		return role;
	}
	public int getDex(){
		if(dex<0){
			return 0;
		}
		else{
			return dex;
		}
		
	}
	public int getStr(){
		if(str<0){
			return 0;
		}
		else{
			return str;
		}
	}
	public int getInt(){
		if(intel<0){
			return 0;
		}
		else{
			return intel;
		}
	} 
	public int getChar(){
		if(chr<0){
			return 0;
		}
		else{
			return chr;
		}
	}
	public BaseClass(String role){
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