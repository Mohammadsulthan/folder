package main;

import java.util.Scanner;

public class SquareAreaDemo
{
	public static void main(String[] area)
	{
		System.out.println("enter side of square");
		Scanner tt=new Scanner(System.in);
		double side=tt.nextDouble();
		double area1=side*side;
		System.out.println("Area of square is:"+area1);

	}
}
