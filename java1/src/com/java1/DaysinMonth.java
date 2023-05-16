package com.java1;
import java.util.Scanner;
public class DaysinMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = 0;
		System.out.println("Enter month number :");
		month = sc.nextInt();
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			System.out.println("31 days in this month");
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
		{
			System.out.println("30 days in this month");
		}
		else if(month == 2)
		{
			System.out.println("28 or 29 days in this month");
		}
		else
			System.out.println("This is an invalid number");


	}

}
