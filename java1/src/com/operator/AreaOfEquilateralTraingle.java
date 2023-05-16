package com.operator;
import java.util.Scanner;
public class AreaOfEquilateralTraingle {

	public static void main(String[] args) {
		// Area of Equilateral Triangle
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of equilateral triangle");
		double side=sc.nextDouble();
		{
			double area = 1.73*side*side;
			System.out.print("Area of Equilateral Triangle is:" +area);
		}
		
		

	}

}
