package com.operator;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// to calculate simple interest
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Principal:");
		float principal=sc.nextFloat();
		
		System.out.print("Enter the Rate:");
		float rate=sc.nextFloat();
		
		System.out.print("Enter the Time:");
		float time=sc.nextFloat();
		
		float SimpleInterest = (principal * time * rate)/100;
		
		System.out.print("\nPrincipal :" +principal);
		System.out.print("\nRate :" +rate);
		System.out.print("\nTime :" +time);
		System.out.println("\nSimple Interest is :" +SimpleInterest);
		

	}

}
