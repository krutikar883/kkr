package com.loops;
import java.util.Scanner;
public class SeriesExample {
	//1,2,4,7,11

	public static void main(String[] args) {
		int add = 1;
		for(int i=0; i<=10; i++)
		{
			add = add+i;
			//logic- (0+1=1),(1+1=2),(2+2=4),(4+3=7),(7+4)=11)....
			System.out.println(add);
		}
		
	}

}
