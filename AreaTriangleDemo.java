package main;

import java.util.Scanner;

public class AreaTriangleDemo 
{
	public static void main(String[] args)
	{
		Scanner tt=new Scanner(System.in);
		System.out.println("enter the width of the triangle");
		double base=tt.nextDouble();
		
		System.out.println("enter the height of the traiangle");
		double height=tt.nextDouble();
		
		double area=(base*height)/2;
		System.out.println("Area of traiangle is:"+area);
	}
}
