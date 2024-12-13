/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
public static void main(String args[]) {
// the string "I love to learn coding remotely." will appear in
// the command window when you compile and run this program.
Scanner sc = new Scanner(System.in);
System.out.print("Input a number: ");
int input = sc.nextInt();
printPrimes(input);
}

public static boolean checkPrime(int Num){
int a = 2;
while(Num>a){
if(Num%a == 0){
return false;
}
else if(Num%a != 0){
a ++;
}


}
return true;

}

public static void printPrimes(int put){
int sum =2;
while(sum<put){
if(checkPrime(sum)){
System.out.println(sum);
}
else{

}
sum ++;
}
}

}
