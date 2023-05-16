package com.containtment;

public class Departments {
	
	class Employees {
		private int did;
		private String dname;
		
		public Employees(int did, String dname)
		{
			this.did = did;
			this.dname = dname;
		}		

	}

	public class Department {
		private int did;
		private String dname;
		private Employees emp;
		
		public Department(int did, String dname, Employees emp)
		{
			this.did = did;
			this.dname = dname;
			this.emp = emp;
		}

	public void main(String[] args) {
		Departments dt = new Departments(123, "krutika");
		
		
		System.out.println(dt.did(123));
		System.out.println(dt.dname);
	}
		

	}
	
}
