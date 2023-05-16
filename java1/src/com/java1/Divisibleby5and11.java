package com.java1;
import java.util.Scanner;

public class Divisibleby5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		if((number % 5 ==0) && (number % 11 == 0))
		{
			System.out.println("Number is divisible by 5 and 11");
			
		}
		else 
		{
			System.out.println("Numberis Not divisible by 5 and 11");
		}
			

	}

}
