package com.loops;

public class SeriesEg {

	public static void main(String[] args) {
		// 1,11,111,1111....
		
		int num=1;
		for(int i=1;i<=10;i++)
		{
			System.out.print(num+ " ");
			num=num*10+1;
		}

	}

}
