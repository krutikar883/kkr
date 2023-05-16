package com.containtment;


class Engine
{
	String eng_type;
	String cleanupdate;
	
	public Engine(String eng_type, String cleanupdate)
	{
		this.eng_type = eng_type;
		this.cleanupdate = cleanupdate;
	}
}

class Gear
{
	String gear_type;
	
	public Gear(String gear_type)
	{
		this.gear_type = gear_type;
	}
}

public class Car
{
	int model1;
	String car_name;
	int price;
	Gear ge;
	Engine en;

	public Car(int model, String car_name, int price, Gear ge, Engine en)
	{
		this.model1 = model1;
		this.car_name = car_name;
		this.price = price;
		this.ge = ge;
		this.en = en;
}


	public static void main(String[] args) {
		Car c = new Car(1234, " Audi", 78000, new Gear("Auto"), new Engine("Petrol", "3-5-2023"));
		System.out.println(c.model1);
		System.out.println(c.car_name);
		System.out.println(c.price);
		System.out.println(c.ge.gear_type);
		System.out.println(c.en.eng_type);
		System.out.println(c.en.cleanupdate);
	}

}
