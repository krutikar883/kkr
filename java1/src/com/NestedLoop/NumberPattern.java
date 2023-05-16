package com.NestedLoop;

public class NumberPattern {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		
		for(i=1; i<=3; i++);
		{
			for(j=1; j<=i; j++);
			{
				System.out.println(j);
			}
			for(k =i-1; k>=1; k--);
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
