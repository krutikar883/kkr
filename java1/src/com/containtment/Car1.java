package com.containtment;

public class Car1 {
	private int model1;
	private String car1_name;
	private int price;
	private Gear ge;
	private Engine en;
	
	public Car1(int model1, String car1_name, int price, Gear ge, Engine en) {
		this.model1 = model1;
		this.car1_name = car1_name;
		this.price = price;
		this.ge = ge;
		this.en = en;
		
		
	}
	public void setmodel1(int model1)
	{
		this.model1 = model1;
	}
	public void setcar_name(String car1_name)
	{
		this.car1_name = car1_name;
	}
	public void setprice(int price)
	{
		this.price = price;
	}
	public void setge(Gear ge)
	{
		this.ge = ge;
	}
	public void seten(Engine en)
	{
		this.en = en;
	}
	
	public int getmodel1()
	{
		return model1;
	}
	public String getcar1_name()
	{
		return car1_name;
	}
	public int getprice()
	{
		return price;
	}
	public Gear getge()
	{
		return ge;
	}
	public Engine geten()
	{
		return en;
	}
	
	
	public static void main(String[] args) {
		Car1 c = new Car1(1234, " Audi", 78000, new Gear("Auto"), new Engine("Petrol", "3-5-2023"));
		System.out.println(c.model1);
		System.out.println(c.car1_name);
		System.out.println(c.price);
		System.out.println(c.ge.gear_type);
		System.out.println(c.en.eng_type);
		System.out.println(c.en.cleanupdate);

	}

}
