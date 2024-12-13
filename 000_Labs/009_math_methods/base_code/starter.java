/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc=new Scanner(System.in);
		double a=Math.max(13-6*11,30%7*(-2));
		System.out.println(a);
		double b=Math.sqrt(3*8+31%7);
		System.out.println(b);
		double c=Math.pow(37/3,35%21);
		System.out.println(c);
		double d=Math.max(Math.pow(2,14%3),Math.sqrt(2*6));
		System.out.println(d);
		
		System.out.print("Put in number x: ");
		double x=sc.nextDouble();
		System.out.print("Put in number y: ");
		double y=sc.nextDouble();
		double max=Math.max(x,y);
		System.out.println(max);
		double square=Math.sqrt(y);
		System.out.println(square);
		double power=Math.pow(x,y);
		System.out.println(power);
	}
}
