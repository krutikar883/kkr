package com.java1;

import java.util.Scanner;

public class MaxThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 23;
		int num2 = 34;
		int num3 = 12;
		if(num1 >= num2 && num1 >= num3 )
			System.out.println(num1 + " is the maximum number ");
		else if(num2 >= num1 && num2 >= num3)
			System.out.println(num2 + " is the maximum number ");
		else
			System.out.println(num3 + " is the maximum number ");
			
		

	}

}
