/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int num1=3;
		int num2=1000;
		int count1=0;
		int count2=0;
		int[] a=new int[1001];
		
		 while(count1<=1000){
			
			a[count1]=num1;
			count1++;
			num1=num1+3;
		 }
		 count1=0;
		 int c=0;
		 while(c<=1000){
		 	c++;
		 	System.out.print(a[count1]);
		 	System.out.print(", ");
		 	count1++;
		 }
		 System.out.println("\n---------------------------------------------------------------------------------");
		 int[]b=new int[1001];
		 while(count2<=1000){
		 	b[count2]=num2;
		 	count2++;
		 	num2=num2-1;
		 }
		 int k=0;
		 count2=0;
		 while(k<=1000){
		 	k++;
		 	System.out.print(b[count2]);
		 	System.out.print(", ");
		 	count2++;
		 }
		 
		
	}
}
