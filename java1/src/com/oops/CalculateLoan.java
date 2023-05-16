package com.oops;

public class CalculateLoan {
	
	public double calculateLoan(double principal, double rate)  //method overloading with one parameter
	{
		return principal * rate;
	}
	
	public double calculateLoan(double principal, double rate1, double rate2)  // method overload with 2 parameter
	{
		return principal * rate1+rate2;
	}
	
	//calculate loan with single interest
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
