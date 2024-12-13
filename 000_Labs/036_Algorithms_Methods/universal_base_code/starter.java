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
		int [] arr=new int[100];
		for(int i=0;i<100;i++){
			arr[i]=(int)(Math.random()*100+1);
		}
		System.out.println("Maximum is "+getArrayMax(arr));
		System.out.println("Minimum is "+getArrayMin(arr));
		System.out.println("Average is "+getArrayAverage(arr));
		toStringArray(arr);
		
	}

	
	public static int getArrayMax(int[] array){
		int c=0;
		for(int i=0;i<100;i++){
			if(array[i]>c){
				c=array[i];
			}
		}
		return c;
	}
	public static int getArrayMin(int[] array){
		int c=100;
		for(int i=0;i<100;i++){
			if(array[i]<c){
				c=array[i];
			}
		}
		return c;
	}
	public static int getArrayAverage(int[] array){
		int c=0;
		for(int i=0;i<100;i++){
			c=c+array[i];
			
		}
		c=c/100;
		return c;
	}
	public static void toStringArray(int[] array){
		for(int i=0;i<100;i++){
			System.out.println(array[i]);
		}
		
	}
}
