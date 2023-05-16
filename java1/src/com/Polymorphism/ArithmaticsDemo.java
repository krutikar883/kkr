package com.Polymorphism;

public class ArithmaticsDemo {
	
	public void calculate(int x, int y)
	{
		System.out.println("Addition =" +(x+y));
	}
	public void calculate(int a, int b, int c)
	{
		System.out.println("Multiplication=" +(a*b*c));
	}
	public void calculate()
	{
		System.out.println(" "+(6-3));
	}
	public int calculate(float x, int y)
	{
		return(int)(x-y);
	}

	public static void main(String[] args) {
		ArithmaticsDemo a= new ArithmaticsDemo();
		a.calculate();     
		System.out.println(a.calculate(2.3f, 4));
		a.calculate(8,7);   // Addition
		a.calculate(8,3,2); // multiplication

	}

}
