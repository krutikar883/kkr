package LabSession1;
import java.util.Scanner;
public class LabSession2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int fact=1;
	
		for(int i=1; i<=num; i++)
		{
			if(num % i == 0) {
				System.out.println(i + " ");
			}
				
		}
		if(num == 0)
		{
			System.out.println("No Factors");
		}
		else
		{
			fact=num*fact;
			System.out.println("are the factors");
		}
		

	}

}
