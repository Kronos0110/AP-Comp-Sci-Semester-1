/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		int money =100;
		int ran_1=0;
		int ran_2=0;
		int ran_3=0;
		String text;
		while(true){
			System.out.println("Try again now");
			System.out.println("Do you want to play?(y/yes/Yes/Y)");
			System.out.println("If(No/no/N/n) game stops: ");
			text=sc.nextLine();
			if(text.equals("Yes")||text.equals("yes")||text.equals("Y")||text.equals("y")){
				ran_1=(int)(Math.random()*10);
				ran_2=(int)(Math.random()*10);
				ran_3=(int)(Math.random()*10);
				System.out.println("You have $"+money);
				System.out.print("How much do you want to wager?: ");
				int wager=sc.nextInt();
				System.out.println("The random numbers are:");
				System.out.println(ran_1+" "+ran_2+" "+ran_3);
				if(wager<=money){
					if(ran_1==ran_2&&ran_2==ran_3){
						wager=wager*2;
						money=money+wager;
						System.out.println("You have $"+money);
					}
					else if(ran_1==ran_2||ran_1==ran_3||ran_2==ran_3){
						money=money+wager;
						System.out.println("You have $"+money);
					}
					else
					{
						money=money-wager;
						System.out.println("You have $"+money);
						if(money==0){
							break;
						} 
					}
				}
				else if(wager>money){
					System.out.println("Error");
				}
				}
			else if(text.equals("No")||text.equals("no")||text.equals("N")||text.equals("n")){
				break;
			}
			else{
				System.out.println("Wrong input going back to the start");
			}
		}
		System.out.println("Thanks for playing");
	}
}
