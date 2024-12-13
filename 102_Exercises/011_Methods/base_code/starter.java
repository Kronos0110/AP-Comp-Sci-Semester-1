/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
	public static boolean isLeapYear(int year){
		if(year%400==0){
			return true;
		}
		else if(year%100==0){
			return false;
		}
		else if(year%4==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static int getDigitSum(int number){
		int th5=number/10000;
		int th4=(number/1000)-(th5*10);
		int rd3=(number/100)-(th5*100)-(th4*10);
		int nd2=(number/10)-(th5*1000)-(th4*100)-(rd3*10);
		int st1=number%10;
		int sum=th5+th4+rd3+nd2+st1;
		return sum;
	}
	public static void printIfConsecutive(int num1, int num2, int num3){
		num3=num3-2;
		num2=num2-1;
		if(num1==num2&&num1==num3){
			System.out.println("Number is consecutive");
		}
		else{
			System.out.println("Number is not consecutive");
		}
	}
}
