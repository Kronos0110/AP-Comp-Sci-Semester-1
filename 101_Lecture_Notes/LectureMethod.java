/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        greeting("Mattew");
        greeting("Taqqqurias#");
        double newSalary=raised(100000.62,5);
        System.out.println(newSalary);
        newSalary= raised(newSalary,6);
        System.out.print(newSalary);
	}
	public static void greeting(String name){
	    System.out.println("Good morning"+name);
}
    public static double raised(double salary,int percent){
        double amount = salary +salary*(percent/100.99);
        return (amount);
    }
}