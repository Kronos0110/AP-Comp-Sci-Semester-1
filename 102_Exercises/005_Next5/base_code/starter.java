/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.print("Put in a integer: ");
	int integer =sc.nextInt();
	System.out.print("Next 5 integer is: "+integer+" ");
	int int1=integer+1;
	System.out.print(int1+" ");
	int1=int1+1;
	System.out.print(int1+" ");
	int1=int1+1;
	System.out.print(int1+" ");
	int1=int1+1;
	System.out.print(int1+" ");
	int1=int1+1;
	System.out.println(int1+" ");
	System.out.print("Next 5 integer of number is: "+integer+" ");
	int mul1=integer*2;
	System.out.print(mul1+" ");
	int mul2=integer*3;
	System.out.print(mul2+" ");
	int mul3=integer*4;
	System.out.print(mul3+" ");
	int mul4=integer*5;
	System.out.print(mul4+" ");
	int mul5=integer*6;
	System.out.println(mul5+" ");
	double div100=integer/100.0;
	System.out.println("Input divided by 100 is: "+ div100);
	double div10=integer/10.0;
	System.out.println("Input divdied by 10 is: "+div10);

	}
}
