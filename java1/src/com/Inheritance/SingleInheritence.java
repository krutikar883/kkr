package com.Inheritance;
import java.util.Scanner;
class Laptop
{
	String ramSize="8GB";
}
class Dell extends Laptop
{
	public void show()
	{
		System.out.println(ramSize);
	}
	public void DellDetails()
	{
		System.out.println("This is dell with 24 inch screen");
	}
}

public class SingleInheritence {

	public static void main(String[] args) {
		Dell d=new Dell();
		d.show();
		d.DellDetails();


	}

}
