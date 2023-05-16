package com.oops;

public class Student {
	
	int id;
	String sname;
	double per;
	

	public static void main(String[] args) {
		int num;
		Student stud;
		stud = new Student();
		System.out.println(stud.id + " " + stud.sname + " " + stud.per);
		
		stud.id = 100;
		stud.sname = "krutika";
		stud.per = 78.89;
		System.out.println(stud.id + " " + stud.sname + " " + stud.per);
		
		Student stud2 = new Student();
		stud2.id = 101;
		stud2.sname = "neha";
		stud2.per = 80;
		
		System.out.println(stud2.id + " " + stud2.sname + " " + stud2.per);
		
		System.out.println(stud);
		System.out.println(stud2);
		
		
		

	}

}
