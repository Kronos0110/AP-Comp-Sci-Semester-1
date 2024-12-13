/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc= new Scanner(System.in);
	System.out.print("What is your base number?: ");
	int base=sc.nextInt();
	System.out.print("What is your exponent?: ");
	int exponent=sc.nextInt();
	pow(base,exponent);
	}
	public static void pow(int power, int exp){
		int x=1;
		int num=power;
		
		while(x<exp){
			num=num*power;
			x=x+1;
		}
		System.out.print(num);
	}



		
}

