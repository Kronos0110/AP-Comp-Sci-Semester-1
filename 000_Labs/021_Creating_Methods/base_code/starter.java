/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		// Your code goes below here
		System.out.print("What is your first word?: ");
		String word=sc.nextLine();
		System.out.print("What is you second word?: ");
		String sec_wrod=sc.nextLine();
		toString(word+"\n");
		
		StringCombined(word,sec_wrod);
		
		}
		public static void toString(String first){
			
			System.out.print(first);
		}
		public static void StringCombined(String fir,String sec){
			System.out.print(fir+" "+sec);
		}


	}
