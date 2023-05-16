package com.containtment;
import java.util.Scanner;
public class Department {
	private int did;
	private String dname;
	private Employees emp;
	
	public void setDid(int did)
	{
		this.did = did;
	}
	public void setDname(String dname)
	{
		this.dname = dname;
	}
	public void setEmp(Employees emp)
	{
		this.emp = emp;
	}
	public int getDid()
	{
		return did;
	}
	public String getDname()
	{
		return dname;
	}
	public Employees getEmp()
	{
		return emp;
	}

	public static void main(String[] args) {
		Department dt = new Department();
		dt.setDid(101);
		dt.setDname("HR");
		dt.setEmp(new Employees());
		Employees e = dt.getEmp();
		e.setEid(1);
		e.setEname("krutika");
		
		System.out.println(dt.getDid());
		System.out.println(dt.getDname());
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		
	}

}
