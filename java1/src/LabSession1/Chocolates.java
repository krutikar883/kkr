package LabSession1;
import java.util.Scanner;
public class Chocolates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		int money = sc.nextInt();
		int i, count=0;
		for(i=1; i<=money; i++)
		{
			count++;
			if(count%3==0)
			{
				count++;
			}
		}
		System.out.println("the kid will get " + count +" chocolates");
		
		}

}
