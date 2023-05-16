package com.loops;
import java.util.Scanner;
public class MagicalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int magicnumber = 55;
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println("Enter the number");
			int num = sc.nextInt();
			
			if(num > magicnumber)
			{
				System.out.println("Number is greater pls try again...");
				continue;
			}
			else if(num < magicnumber)
			{
				System.out.println("Number is less pls try again...");
				continue;
			}
			else
			{
				System.out.println("Number is same like magic number..");
				break;
			}
		}

	}

}
