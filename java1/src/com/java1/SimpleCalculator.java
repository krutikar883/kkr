package com.java1;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Float num1,num2,res;
		int choice;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("enter your choice :");
		choice = sc.nextInt();
		
		if(choice>=1 && choice<=4)
		{
			System.out.println("\nEnter any two number:");
			num1 = sc.nextFloat();
			num2 = sc.nextFloat();
			

			if(choice==1)
				res = num1 + num2;
			else if(choice==2)
				res = num1 - num2;
			else if(choice==3)
				res = num1 * num2;
			else 
				res = num1/num2;
			System.out.println("\nResult = " +res);
		}
		else
			System.out.println("\nInvalid choice");
			
		
		
		

	}

}
