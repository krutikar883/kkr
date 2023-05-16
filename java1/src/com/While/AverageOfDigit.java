package com.While;
import java.util.Scanner;
public class AverageOfDigit {

	public static void main(String[] args) {
		// to find the average of digit from the num
		
		int count=0,average,digit,sumofDigits=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit");
		digit=sc.nextInt();
		
		
		while(digit!=0)
		{
			
			sumofDigits=digit%10;
			digit=digit/10;
			++count;

		}
		average=sumofDigits/count;
		System.out.println("Average number of digit :"+average);

	}

}
