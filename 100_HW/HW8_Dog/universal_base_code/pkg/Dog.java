package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	//Global Variable
	String name;
	int age;
	String breed;
	//Constructor
	public Dog(){
		name=new String("Clifford");
		age=3;
		breed=new String("Big red dog");
	}
	public Dog(String n){
		name=n;
		age=1;
		breed=new String("Dog Dog");
	}
	public Dog(String n, String b){
		name=n;
		age=1;
		breed=b;
	}
	public Dog(String n, int a){
		name=n;
		age=a;
		breed=new String("Dog Dog");
		
	}
	
	//////////////////////////////////////////////
	//method
	public void setName(String n1){
		name=n1;
		
	}
	public void setAge(int ag){
		age=ag;
	}
	public void setBreed(String b){
		breed=b;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int y=(int)((Math.random()*2)+1);
		if(y==1){
			return false;
		}
		else{
			return true;
		}
		
	}
	public void bark(){
		System.out.println(name+" Bark!!! Bark!!");
	}
	public void doggy(){
		System.out.println("---------------------------");
		System.out.println("Name of the dog is "+name);
		System.out.println("Age of the dog is "+ age);
		System.out.println("Breed of the dog is "+breed);
		System.out.println("---------------------------");
	}
	

}
