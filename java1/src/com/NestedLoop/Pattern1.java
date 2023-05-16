package com.NestedLoop;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char i ='D'; i>='A'; i--)
		{
			for(char j='A'; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
