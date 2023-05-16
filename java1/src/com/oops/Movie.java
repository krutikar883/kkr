package com.oops;
import java.util.Scanner;
public class Movie {

	int eid;
	String emovieName;
	int eprice;
	
	Movie(int id, String movieName, int price)
	{
		eid = id;
		emovieName = movieName;
		eprice = price;
		
	}
	public void Show_details()
	{
		System.out.println("id:" + eid);
		System.out.println("movie name:" + emovieName);
		System.out.println("movie price:" + eprice);
		
	}
	int getPrice()
	{
		return eprice;
	}
}
	
	
