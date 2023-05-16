package com.NestedLoop;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =5; i>=1; i--)
		{
			for(int j=1; j<=5-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=i; k<=i; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
