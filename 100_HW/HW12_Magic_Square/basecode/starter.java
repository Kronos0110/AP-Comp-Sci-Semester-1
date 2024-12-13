import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		// CVMath.specialSquare(5);
		System.out.println(CVMath.findMid(2,3,1));
		System.out.println("What number of magic square do you want to find?(Ex:1 or 2...): ");
		int magic=sc.nextInt();
		CVMath.specialSquare(magic);
		
	}
}
