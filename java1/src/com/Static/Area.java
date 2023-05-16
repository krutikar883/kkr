package com.Static;

public class Area {
	
	public double calculateAreaOfCircle(double radius)
	{
		return 3.14 * radius * radius;
	}
	
	public double calculateAreaOfTrainagle(double base, double height)
	{
		return 0.5 * base * height;
	}
	
	public double calculateAreaOfRectangle(double length, double width)
	{
		return length * width;
	}
	
	public double calculateAreaOfSquare(double side)
	{
		return side * side;
	}

	public static void main(String[] args) {
		Area calculate = new Area();
		
		System.out.println("Area of circle: " + calculate.calculateAreaOfCircle(2.0));
		System.out.println("Area of Triangle: " + calculate.calculateAreaOfTrainagle(2.0,3.0));
		System.out.println("Area of Reactangle: " + calculate.calculateAreaOfRectangle(3.0,2.0));
		System.out.println("Area of Square: " + calculate.calculateAreaOfSquare(5.0));

	}

}
