/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight =new Employee(1987,"Dwight","Schrute",4416.66);
		dwight.employeeToString();
		Employee jim =new Employee(2474,"Jim","Halpert",4416.66);
		jim.employeeToString();
		Employee pam =new Employee(2011,"Pam", "Beesly",2250);
		pam.employeeToString();
		Employee jack=new Employee(1521,"Jack","White",3321.4);
		jack.employeeToString();
		
		jack.raiseSalary(5);
		dwight.raiseSalary(3);
		pam.raiseSalary(10);
		jim.raiseSalary(6);
		
		dwight.employeeToString();
		System.out.print("Annual Salary");
		System.out.println(dwight.getAnnualSalary());
		
		jim.employeeToString();
		System.out.print("Annual Salary");
		System.out.println(jim.getAnnualSalary());
		
		jack.employeeToString();
		System.out.print("Annual Salary");
		System.out.println(jack.getAnnualSalary());
		
		pam.employeeToString();
		System.out.print("Annual Salary");
		System.out.println(pam.getAnnualSalary());
	}
}
