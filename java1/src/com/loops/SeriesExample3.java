package com.loops;

public class SeriesExample3 {

	public static void main(String[] args) {
		// 1,8,9,64,25,...
		for(int i = 1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i*i*i+" ");
			}
			else
			{
				System.out.println(i*i+" ");
			}
		}

	}

}
