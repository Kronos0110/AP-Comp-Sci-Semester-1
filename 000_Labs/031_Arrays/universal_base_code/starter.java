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
		int count=0;
		int num=9;
		int[]x=new int[10];
		while(count<10){
			x[count]=num;
			num--;
			count++;
		}
		System.out.println(x[0]);
		System.out.print(x[9]);
		


		
	}
}
