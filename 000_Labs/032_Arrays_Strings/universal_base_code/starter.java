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
		String[]a=new String[10];
		a[0]=new String("Twinkle");
		a[1]=new String("Twinkle,");
		a[2]=new String("Little Star\n");
		a[3]=new String("How I wonder");
		a[4]=new String("what you are\n");
		a[5]=new String("Up above the world");
		a[6]=new String("so high\n");
		a[7]=new String("Like a diamond");
		a[8]=new String("in the sky");
		a[9]=new String("Twinkle");
		
		
		for(int c=0; c<a.length; c++){
			System.out.print(a[c]);
			System.out.print(" ");
		}
		

		
	}
}
