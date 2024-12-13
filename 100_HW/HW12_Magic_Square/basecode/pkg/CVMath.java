package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void specialSquare(int th)
	{
		//a is number for addition
		//add is total addition
		//b is number for multiplication
		//mul is total multiplication
		int a=2;
		int b=1;
		int add=1;
		int mul=1;
		int i=0;
		while(i<th){
			if(add<mul)
			{
				
				add=add+a;
				a++;
			}
			if(mul<add)
			{
				b++;
				mul=b*b;
				
				
			}
			if(mul==add){
				System.out.println(add);
				b++;
				mul=b*b;
				i++;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// int count=1;
		// //a to find the targeting number
		// int []arr_1=new int[100000];
		// int []arr_2=new int[100000];
		// arr_1[1]=1;
		// arr_2[1]=1;
		// int i=0;
		// int k=0;
		// for(i=1;i<arr_2.length;i++){
		// 	//using i for loop to store addition
		// 	arr_2[i]=i+(arr_2[i-1]);
		// }
		// for( k=1;k<arr_1.length;k++){
		// 	arr_1[k]=k*k;
		// }
		// k=1;
		// i=1;
		// int a = 0;
		// //all in while loop to make it all work in loop
		// while(a<th){
			
		// 	//number that takes in is 'th'and 'a' is count variable
		// 	if(arr_1[k]<arr_2[i]){
		// 		k++;
		// 	}
		// 	if(arr_1[k]>arr_2[i]){
		// 		i++;
		// 	}
		// 	if(arr_1[k]==arr_2[i]){
		// 		i++;
		// 		a++;
		// 		System.out.println(arr_1[k]);
		// 	}
		// }
			

		
		
			
		// //using k for loop to store perfect square
	
		// //for loop in an for loop to check first for loop to number in all of second for loop
		
		

	
	
}
}
