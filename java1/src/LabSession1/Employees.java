package LabSession1;
import java.util.Scanner;
public class Employees {
	private int employee_id;
	private String name;
	private double salary;
	private static int totalEmployees =0;
	
	//Parameterized constructor
	public Employees(int employee_id, String name, double salary)
	{
		this.employee_id = employee_id;
		this.name = name;
		this.salary = salary;
		totalEmployees++;
	}
	
	// Method to diplay employee info
	public void displayInfo()
	{
		System.out.println("Employee ID:" + employee_id);
		System.out.println("Name:" + name);
		System.out.println("Salary:" + salary);
	}
	
	// static method to return total number of employee
	public static int totalEmp() {
		return totalEmployees;
		
	}
	
	public static void main(String[] args)
	{
		Employees emp1 = new Employees(1, "Ram", 25000);
		Employees emp2 = new Employees(2, "Radha", 35000);
		Employees emp3 = new Employees(3, "Sita", 30000);
		Employees emp4 = new Employees(4, "Krutika", 45000);
		Employees emp5 = new Employees(5, "Mrunal", 55000);
	
	
	emp1.displayInfo();
	emp2.displayInfo();
	emp3.displayInfo();
	emp4.displayInfo();
	emp5.displayInfo();
	
	System.out.println("Total number of employees:" +totalEmp());

}
}
