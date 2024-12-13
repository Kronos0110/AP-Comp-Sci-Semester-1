/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		Cipher stat = new Cipher();
		System.out.print("What is your code?: ");
		String newcode=sc.nextLine();
		String code=stat.encode(newcode);
		System.out.print(code);
		////////////////////////////////////////////
		// int number=0;
		// while(number<=36){
		// 	String code=stat.keyedEncode("amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct",number) ;
		// 	System.out.print(number+". ");
		// 	System.out.println(code);
		// 	number++;
		//}


	}
}
