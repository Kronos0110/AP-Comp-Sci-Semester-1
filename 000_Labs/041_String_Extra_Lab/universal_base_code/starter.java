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
		Scanner sc=new Scanner(System.in);
		System.out.print("What is the sentence you want?: ");
		String sentence=sc.nextLine();
		String word="";
		String result="";
		while(true){
			if(sentence.indexOf(" ")==-1){
				result=sentence+result;
				break;
			}
			int space=sentence.indexOf(" ");
			word=sentence.substring(0,space);
			result=" "+word+result;
			
			sentence=sentence.substring(space+1);
		}
		System.out.print(result);
		
		
		
	}
}
