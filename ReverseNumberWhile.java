package main;

import java.util.Scanner;

public class ReverseNumberWhile
{
	public static void main(String[] args)
	{
		int num=0;
		int reversenum=0;
		System.out.println("input your and press enter:");
		Scanner tt=new Scanner(System.in);
		
		num=tt.nextInt();
		while(num!=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("reverse of input number is:"+reversenum);
	}
}
