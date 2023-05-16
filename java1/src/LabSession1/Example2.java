package LabSession1;
import java.util.Scanner;
public class Example2 {
	private int id;
	private String name;
	private double salary;
	
	// Getter method
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	
	//Setter method
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public static void main(String[] args) {
		Example2 emp = new Example2();  // exmple is coz we create a class as a name of exmple instead of employe
		emp.setId(123);
		emp.setName("krutika");
		emp.setSalary(45000.00);
		
		System.out.println("Employee Id:" + emp.getId());
		System.out.println("Name:" + emp.getName());
		System.out.println("Salary:" + emp.getSalary());

	}
	
		
	

}
