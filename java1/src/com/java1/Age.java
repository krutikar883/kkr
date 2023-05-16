package com.java1;
import java.util.Scanner;
public class Age {
/* WAP to take input ur age and ur frnd age if ur age is greater than ur frnd age then display 'hi',
 * if ur frnd age is grater than ur age then display 'hello' otherwise how r u */
	public static void main(String[] args) {
		System.out.println("Take input of your age");
		Scanner sc = new Scanner(System.in);
		int KrutikaAge=sc.nextInt();
		System.out.println("Take input of your friend age");
		int MrunaliAge=sc.nextInt();
		
		if(KrutikaAge > MrunaliAge)
		{
			System.out.println("Hi");
		}
		else if(MrunaliAge > KrutikaAge)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("How are you");
		}
		

	}

}
