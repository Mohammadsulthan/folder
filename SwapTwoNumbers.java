package main;

public class SwapTwoNumbers 
{
	public static void main(String[] args)
	{
		int first=120,second=220;
		System.out.println("--Before swap--");
		System.out.println("first number= "+first);
		System.out.println("second number= "+second);
		
		System.out.println();
		
		float thread=first;
		first=second;
		second=(int)thread;
		System.out.println("--After swap--");
		System.out.println("first number= "+first);
		System.out.println("second number= "+second);
	}
}
