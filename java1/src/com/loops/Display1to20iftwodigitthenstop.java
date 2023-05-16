package com.loops;
import java.util.Scanner;
public class Display1to20iftwodigitthenstop {

	public static void main(String[] args) {
		// to display nos. between 1 to 20, if the no is two-digit no than stop the display
		for(int i = 1; i<=20; i++)
		{
			if(i >=10)
			{
				break;
			}
			System.out.println(i);
		}

	}

}
