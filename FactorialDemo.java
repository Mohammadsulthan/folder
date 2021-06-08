package main;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args)
	{
		Scanner tt=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=tt.nextInt();
		int factorial=fact(num);
		System.out.println("factorial of entered number is:"+factorial);
	}

	static int fact(int n) {
		int output;
		if(n==1)
		{
			return 1;
		}
		output=fact(n-1)*n;
		return output;
	}
}
