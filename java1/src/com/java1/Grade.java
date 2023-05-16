package com.java1;
//to find grade base on percentage

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1, m2, m3, m4, m5, sum, per;
		m1 = 65;
		m2 = 85;
		m3 = 81;
		m4 = 94;
		m5 = 84;
		sum = m1 + m2 + m3 + m4 +m5;
		per = sum/5;
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if(per<90 && per>=80)
		{
			System.out.println("Grade B");
		}
		else if(per<80 && per>=70)
		{
			System.out.println("Grade C");
		}
		else if(per<70 && per>=60)
		{
			System.out.println("Grade D");
		}
		else if(per<60 && per>=50)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F");
		}
		System.out.println("Percentage :"+per);
		System.out.println("Sum :"+sum);

	}

}
