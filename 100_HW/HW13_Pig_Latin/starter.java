/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the word you want to input");
		String sentence=sc.nextLine();
		
		while(true){
			if(sentence.indexOf(" ")==-1){
				System.out.print(pigLatin(sentence));
				break;
				
			}
			int space=sentence.indexOf(" ");
			String word=sentence.substring(0,space);
			System.out.print(pigLatin(word));
			
			//this deltes the words that has been used
			sentence=sentence.substring(space+1);
			
			
		}
	}
	public static String pigLatin(String word){
		String result="";
		String first_word=word.substring(0,1);
		String a=new String("a");
		String A=new String("A");
		String e=new String("e");
		String E=new String("E");
		String i=new String("i");
		String I=new String("I");
		String u=new String("u");
		String U=new String("U");
		String o=new String("o");
		String O=new String("O");
		
		
		if(word.length()<=1){
			word=word+" ";
			return word;
		}
		else if(word.length()>1){
			if(a.equals(first_word)||A.equals(first_word)||e.equals(first_word)||E.equals(first_word)||i.equals(first_word)||I.equals(first_word)||u.equals(first_word)||U.equals(first_word)||o.equals(first_word)||O.equals(first_word)){
				word=word+"-way ";
				return word;
				
			}
			else{
				//numbers
				int[]array=new int[10];
				array[0]=word.indexOf("a");
				array[1]=word.indexOf("A");
				array[2]=word.indexOf("e");
				array[3]=word.indexOf("E");
				array[4]=word.indexOf("i");
				array[5]=word.indexOf("I");
				array[6]=word.indexOf("u");
				array[7]=word.indexOf("U");
				array[8]=word.indexOf("o");
				array[9]=word.indexOf("O");
				int small=100;
				String new_word="";
				for(int k=0;k<9;k++){
					//find number smallest that are positive
					if(array[k]!=-1){
						if(array[k]<small){
							small=array[k];
						}
						
					}
					else{
						array[k]=100;
					}
					}
					new_word=word.substring(0,small);
					word=word.substring(small);
					word=word+"-"+new_word+"ay ";
					return word;
					
				}
				//need to find the vowel and bring it to end and add ay
				
			}
			else{
			return word;
		}
		}
		
		
	}

