package LabSession1;
import java.util.Scanner;
public class RepeatedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Enter a digit to count");
		int digit=sc.nextInt();
		int count=0;
		int rem;
		do
		{
			rem=num%10;   /* rem= 53225 % 10 = 5
			                 rem= 5322 %10= 2
			                 rem= 532%10= 2
			                 rem=53%10=3
			                 rem=5%10=5
						   */
			
			if(rem==digit)      /* we have to check how many times 2 is repeated so we consider digit = 2
			                        (rem=5, digit=2)  	5!=2
			                        2==2 
			                        2==2 
			                        3!=2 
			                        5!=2*/
			{
				count++;
			}
			num=num/10;
			
			                        
							 
		}
		while(num>0);
			System.out.println(digit + " appears " + count + " times");

	}

}
