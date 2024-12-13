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
		int a=(int)(Math.random()*150)+51;
		int [] arr=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=(int)(Math.random()*100+1);
		}
		
		int min =Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min= arr[i];
			}
			
		}
		int max =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Minimum value is "+min);
		System.out.println("Maximum value is "+max);
		
		double avg=0;
		double total=0;
		for(int i=0;i<arr.length;i++){
			
			total=total+arr[i];
			avg=total/arr.length;
		}
		System.out.println(total);
		System.out.println("Average value is "+avg);

		
	}
}
