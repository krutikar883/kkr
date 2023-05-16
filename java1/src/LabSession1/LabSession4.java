package LabSession1;
import java.util.Scanner;
public class LabSession4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		int count=0;
		
		while(num>0)
		
		{
			int digit = num % 10;
			sum=sum+digit;
			count++;
			num/=10;
		}
		if(count==4)
		{
			if(sum % 3 ==0 || sum % 5 == 0 || sum % 7 ==0)
			{
				System.out.println("lucky number");
			}
			else 
			{
				System.out.println("Sorry its not my lucky number");
			}
		}
		else 
		{
			System.out.println("not a valid number");
		}
			
		
			
		
	}
	

}
