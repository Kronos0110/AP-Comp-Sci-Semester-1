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
		int []a=new int[1000];
		for(int c=0;c<1000;c++){
			int b=(int)(Math.random()*100);
			a[c]=b;
			System.out.print(a[c]+", ");
		}


		
	}
}
