package com.java1;
import java.util.Scanner;

public class EvenOddChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");

	}

}
