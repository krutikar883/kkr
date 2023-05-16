package com.loops;

public class Displayno1to50AndSkip3and5DivisibleNumber {

	public static void main(String[] args) {
		// to display no between 1 to 50,if any no is divsible by 3 and 5 then skip that no
		for(int i = 1; i<=50; i++)
		{
			if(i % 3 != 0 && i % 5 != 0)
			{
				System.out.println(i);
			}
			
		}
	
	}

}
