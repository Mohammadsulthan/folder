package main;

public class FindLcm 
{
	public static void main(String[] args)
	{
		int n1=72,n2=120,lcm;
		lcm=(n1>n2) ? n1:n2;
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.println("the lcm of %d and %d is %d.",n1,lcm);
				break;
			}
				++lcm;
		}
			
	}
}
