/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the word you want to input");
		String sentence=sc.nextLine();
		
		while(true){
			if(sentence.indexOf(" ")==-1){
				System.out.print(spongeCase(sentence));
				break;
				
			}
			int space=sentence.indexOf(" ");
			String word=sentence.substring(0,space);
			System.out.print(spongeCase(word+" "));
			
			//this deltes the words that has been used
			sentence=sentence.substring(space+1);
			
			
		}
		/*String word=sc.nextLine();
		int length=word.length();
		length=length-1;
		for(int i=0;i<=length;i++){
			String Sponge=word.substring(i,i+1);
			Sponge = Sponge.toLowerCase();
			System.out.print(Sponge);
			i++;
			Sponge=word.substring(i,i+1);
			Sponge=Sponge.toUpperCase();
			System.out.print(Sponge);
			
		}
		
			*/
		
		
		

	}
	public static String spongeCase(String word){
		String result="";
		for(int i=0;i<word.length();i++){
			String letter=word.substring(i,i+1);
			
			if(i%2==0){
				letter=letter.toLowerCase();
			}
			else{
				letter=letter.toUpperCase();
			}
			result=result +letter;
		}
		return result;
	}
}
