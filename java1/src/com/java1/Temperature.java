package com.java1;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		int Fahrenheit, Celsius;
		Celsius = 24;
		Fahrenheit = ((Celsius*9)/5)+32;
		System.out.println("Temperature in Fahrenheit is:" + Fahrenheit); */
		
		
		
		//Fahrenheit to Celsius
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit:");
		int Fahrenheit=sc.nextInt();
		int celsius=(Fahrenheit - 32) * 5 / 9;
		System.out.println("celsius is:" + celsius);

	}

}
