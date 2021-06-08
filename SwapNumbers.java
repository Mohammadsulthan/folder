package main;

public class SwapNumbers 
{
	public static void main(String[] main)
	{
		int first=120,second=220;
		System.out.println("--before swap--");
		System.out.println("first number: "+first);
		System.out.println("second number: "+second);
		
		first=first-second;
		second=first+second;
		first=first-second;
		System.out.println();
		
		System.out.println("--after swap--");
		System.out.println("first number: "+first);
		System.out.println("second number: "+second);
	}
}
