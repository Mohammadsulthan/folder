package main;

import java.util.Scanner;

public class CircleDemo 
{
	static Scanner tt=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enetr the raddius:");
		double radius=tt.nextDouble();
		double area=Math.PI*(radius*radius);
		System.out.println("the area of circle is: "+area);
		double circumference=Math.PI*2*radius;
		System.out.println("the circumference of the circle"+circumference);
		
	}
}
