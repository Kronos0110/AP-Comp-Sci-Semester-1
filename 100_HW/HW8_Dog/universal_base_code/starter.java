/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		System.out.println("What is name of the dog: ");
		String name=sc.nextLine();
		System.out.println("What is age of the "+name);
		int age=sc.nextInt();
		
		Dog number1 = new Dog(name,age);
		number1.doggy();
		if(number1.isSleeping()){
			number1.bark();
		}
		else{
			System.out.println("It is sleeping.");
		}
		Dog number2= new Dog("Max","Retriever");
		number2.doggy();
		if(number1.isSleeping()){
			number2.bark();
		}
		else{
			System.out.println("It's sleeping too.");
		}
		


	}
}
