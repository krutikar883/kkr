package com.While;
import java.util.Scanner;
public class AddFirstAndLastDigitNum {

	public static void main(String[] args) {
		// Perform the addition of first digit and last digit from the number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int lastdigit=num%10;
		int firstdigit=0;
		while(num!=0) 
		{
			firstdigit=num%10; // will return first digit of number at the end of loop
			                   /* 1234 % 10=4;
							     123 % 10 =3;
							     12 % 10 =2; 
							     1%10=1 */
							     	
			                   
			
			num=num/10; 
			                /*num=1234/10=123
			                 *num= 123/10=12
			                 * num=12/10=1
			                 * num=1/10=0
			                 */
		}
		int sum=firstdigit+lastdigit;
		System.out.println("the sum of first and last digit number is:" +sum);

		
		
		
	
		

	}

}
