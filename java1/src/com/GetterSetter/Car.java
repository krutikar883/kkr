package com.GetterSetter;

public class Car {
	private int modelNumber;
	private String carName;
	private int speedLimit;
	
	public int getModelNumber()
	{
		return modelNumber;
	}
	public void setModelNumber(int modelNumber)
	{
		this.modelNumber = modelNumber;
	}
	
	public String carName()
	{
		return carName;
	}
	public void setCarName(String carName)
	{
		this.carName = carName;
	}
	
	public int getSpeedLimit()
	{
		return speedLimit;
	}
	public void setspeedLimit(int speedLimit)
	{
		if(speedLimit <= 80)
		{
			this.speedLimit = speedLimit;
		}
		else {
			System.out.println("Speed limit mist be less than or equal to 80");
		}
	}
	
	public void validateSpeedLimit()
	{
		if(speedLimit > 80)
		{
			System.out.println("Speed limit must be less than or equal to 80");
		}
		
	}
	
	public static void main(String[] args)
	{
		Car car = new Car();
		car.setModelNumber(123);
		car.setCarName("Audi");
		car.setspeedLimit(70);
		car.validateSpeedLimit(); // this will not print any message
		
		car.setspeedLimit(90);    // this will print Speed limit must be less than or equal to 80
		car.validateSpeedLimit();
		
		
	}

	
}
