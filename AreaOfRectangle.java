package main;

import java.util.Scanner;

public class AreaOfRectangle 
{
	public static void main(String[] args)
	{
		Scanner tt=new Scanner(System.in);
		System.out.println("enter the lenght of rectangle:");
		double length=tt.nextDouble();
		System.out.println("enetr the of rectangle:");
		double width=tt.nextDouble();
		double area =length*width;
		System.out.println("Area of rectangle is:"+area);	
	}
}
