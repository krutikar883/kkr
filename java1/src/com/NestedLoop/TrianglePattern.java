package com.NestedLoop;
import java.util.Scanner;
public class TrianglePattern {

	public static void main(String[] args) {
		// rightangleTriangle
		
		Scanner sc=new Scanner(System.in);
		
		int i;
		int j;
		
		
		
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for(i=4; i>=0; i--)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
		}

	}

}
