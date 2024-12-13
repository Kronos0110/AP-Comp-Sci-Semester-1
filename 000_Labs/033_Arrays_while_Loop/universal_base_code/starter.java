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
		int c=0;
		int []x=new int[1000];
		while(c<1000){
			int a=(int)(Math.random()*100);
			x[c]=a;
			c++;
		}
		c=0;
		while(c<1000){
			System.out.println(x[c]);
			c++;
		}

		
	}
}
