package com.loops;
import java.util.Scanner;
public class NumberOfOddNos {

	public static void main(String[] args) {
		// display no. of odd nos. between 1 to 20
		int count = 0;
		for(int i = 1; i<=20; i++)
		{
			if(i%2!=0)
			{
				count++;
			}
			
		}
		System.out.println("Odd numbers between 1 to 20 is :" + count);
		

	}

}
