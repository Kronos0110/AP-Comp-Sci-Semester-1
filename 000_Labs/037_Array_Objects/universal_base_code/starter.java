/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		// Wizard wiz=new Wizard();
		// Warrior war=new Warrior();
		Wizard[] wiz=new Wizard[100];
		Warrior[] wrr=new Warrior[100];
		
		for(int i=0;i<100;i++)
		{
			wiz[i]=new Wizard();
			wrr[i]=new Warrior();
		}
		int wa=0;
		int wi=0;

//wizard attack
		while(true)
		{
			//wizard attack
			wiz[wi].attack(wrr[wa]);
			//warrior is dead?
			if(wrr[wa].isDead()==true)
			{
				wa++;
				if(wa>99){
					wi=99-wi;
					System.out.println("Wizard won the war "+wi+" number of wizard(s) survived");
					break;
					
				}
			}
			//warrior attack
			wrr[wa].attack(wiz[wi]);
			//wizard is dead?
			if(wiz[wi].isDead()==true)
			{
				wi++;
				if(wi>99){
					wa=99-wa;
					System.out.println("Warrior won the war "+wa+" number of warrior(s) survived");
					break;
				}
			}
		}

		

		

	}
}
