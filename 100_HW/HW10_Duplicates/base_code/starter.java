/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		int []arr=new int[20];
		int b=(int)(Math.random()*10)+1;
		int c=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*10)+1;
			if(b==arr[i]){
				System.out.print(i+"th ");
				c++;
			}
			
		}
		System.out.println("has duplicate for "+c+" times");
		System.out.println("Duplicated number is "+ b);
		
		
	}
}
