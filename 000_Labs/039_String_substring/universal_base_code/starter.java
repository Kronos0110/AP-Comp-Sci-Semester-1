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
		System.out.print("What is word you want: ");
		Scanner sc=new Scanner(System.in);
		
		String word=sc.nextLine();
		
		for(int i=0;i<word.length();i++)
		{
			String letter=word.substring(i,i+1);
			System.out.println(i+" "+letter);
		}


		
	}
}
