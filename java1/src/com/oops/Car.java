package com.oops;

public class Car {
	
	int modelNumber;
	String sname;
	double price;
	String scolour;

	public static void main(String[] args) {
		
		Car car;
		car = new Car();
		System.out.println(car.modelNumber + " " + car.sname + " " + car.price + " " + car.scolour);
		
		car.modelNumber = 2015;
		car.sname = "Audi";
		car.price = 25000;
		car.scolour = "Black";
		System.out.println(car.modelNumber + " " + car.sname + " " + car.price + " " + car.scolour);
		
		Car car2 = new Car();
		car2.modelNumber = 2014;
		car2.sname = "Swift";
		car2.price = 22000;
		car2.scolour = "Red";
		System.out.println(car2.modelNumber + " " + car2.sname + " " + car2.price + " " + car2.scolour);
		
		Car car3 = new Car();
		car3.modelNumber = 2014;
		car3.sname = "Breeza";
		car3.price = 28000;
		car3.scolour = "Green";
		System.out.println(car3.modelNumber + " " + car3.sname + " " + car3.price + " " + car3.scolour);
		
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
		

	}

}
