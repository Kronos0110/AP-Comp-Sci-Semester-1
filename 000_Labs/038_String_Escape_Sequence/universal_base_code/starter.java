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
		Scanner sc=new Scanner(System.in);
		
		BaseClass test = new BaseClass();
		System.out.print(" Enter a word: ");
		String a=sc.nextLine();
		int b=a.length();
		for(int i=0;i<b;i++){
			System.out.print(a.substring(i,i+1));
			System.out.print(" ");
		}
		
		
		


		
	}
}
