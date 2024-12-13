/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=sc.nextLine();
        System.out.println("Hello "+name);
        sc.nextLine();
        
        System.out.println("Please enter a number");
        int number1 = sc.nextInt();
        System.out.println("Please enter a 2nd number");
        int number2 =sc.nextInt();
        sc.nextLine();
        int num3;
        System.out.println("Number is "+(number2+number1));
        
        System.out.println("What is your favorite food?");
        String food=sc.nextLine();
        System.out.println("Your favorite food is "+food);
        sc.nextLine();
    
	}
}