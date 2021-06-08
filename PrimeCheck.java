package main;

import java.util.Scanner;

public class PrimeCheck 
{
	public static void main(String[] args)
	{
		int temp;
		boolean isprime=true;
		Scanner tt=new Scanner(System.in);
		System.out.println("Enter any number");
		
		int num=tt.nextInt();
		tt.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%1;
			if(temp==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
			System.out.println(num+"is a prime number");
		else
			System.out.println(num+"is not a prime number");
	}
}
