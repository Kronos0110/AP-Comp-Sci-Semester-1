/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int count=0;
		PooleDwarf a = new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf b = new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf c = new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf d = new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf e = new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf f = new PooleDwarf(randName(),(int)(Math.random()*100));
		PooleDwarf g = new PooleDwarf(randName(),(int)(Math.random()*100));
		if((a.getName()).equals(b.getName())){
			count=count+1;
		}
		if((a.getName()).equals(c.getName())){
			count=count+1;
		}
		if((a.getName()).equals(d.getName())){
			count=count+1;
		}
		if((a.getName()).equals(e.getName())){
			count=count+1;
		}
		if((a.getName()).equals(f.getName())){
			count=count+1;
		}
		if((a.getName()).equals(g.getName())){
			count=count+1;
		}
		
		System.out.println(a.getName()+" was name with "+count+" matches");
		
		
	
	}
}
