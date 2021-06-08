package main;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		char operator;
		Double num1,num2,result;
		Scanner tt=new Scanner(System.in);
		System.out.println("choose an operator:+,-,*,or/");
		operator=tt.next().charAt(0);
		System.out.println("enter first number");
		num1=tt.nextDouble();
		
		System.out.println("enter second number");
		num2=tt.nextDouble();
		switch(operator)
		{
		case '+':
			result=num1+num2;
			System.out.println(num1+"+"+num2+"="+result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(num1+"-"+num2+"="+result);
			break;
		case '/':
			result=num1/num2;
			System.out.println(num1+"/"+num2+"="+result);
			break;
			default:
				System.out.println("Invalid operator!");
				break;
		}
		tt.close();
	}

}
