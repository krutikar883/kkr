package com.oops;

public class Employees {
	
	int id;
	String name;
	int salary;
	int age;
	
	public void accept_details(int eid, String ename, int esalary, int eage)
	{
		eid = id;
		ename = name;
		esalary = salary;
		eage = age;
	}
	public void display()
	{
		System.out.println(id+ "" +name+ "" +salary+ ""+age);
	}
	
	public void getBonus()
	{
		if(age > 60)
		{
			System.out.println("Salary is " + salary + 5000);
		}
		else if(age > 40)
		{
			System.out.println("Salary is " + salary + 2000);
		}
		else
		{
			System.out.println("No bonus only salary");
			
		}
	}
	

	public static void main(String[] args) {
		Employees e = new Employees();
		e.accept_details(123,"krutika", 7500, 37);
		e.display();
		e.getBonus();
		
		
		

	}

}
