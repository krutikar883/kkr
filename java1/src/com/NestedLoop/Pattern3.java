package com.NestedLoop;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		int i, j,k=1;
		
		
		for(i =1; i<=4; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(k);
				k++;
				
			}
			System.out.println();
		} 
		
		
		
		
		
	}

}
