package com.loops;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=100;
		int hours;
		
		for(hours=0; temp>=60; hours++)
		{
			temp=temp-7;
		}
		System.out.println("hours for the temperature to drop below 60 degrees:" +hours);

	}

}
