package com.miniproject;

import java.util.*;
interface   Values
{
	int add(int a,int b);
	int sub (int a ,int b);
	int mul(int a,int b);
	int div(int a ,int b);
	int module(int a ,int b);
	
}
class CalValues implements Values
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub (int a ,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a ,int b)
	{
		return a/b;
	}
	
	public int module(int a ,int b)
	{
		return a%b;
	}
	
}
public class Calculator {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Values cv = new CalValues();
		
		
		System.out.println("== :)  Welcome to My MINI PROJECT For CALCULATOR == :) ");
		
		
		
		System.out.println(" 1. ADDITION \n 2. SUBSTARACTION \n 3. MULTIPLICATTION \n 4. DIVISION  \n 5. Modules \n 6.EXIT ");
		
		System.out.println("Enter the your choice : ");
		
		int choice = sc.nextInt();
//		int select = sc.nextInt();
//		switch(select)
//		{
//			case 1: System.out.print("ADDITION");
//			break;
//			
//			case 2: System.out.print("ADDITION");
//			break;
//			
//			case 3: System.out.print("ADDITION");
//			break;
//			
//			case 4: System.out.print("ADDITION");
//			break;
//			
//			case 5: System.out.print("ADDITION");
//			break;
//			
//			default :
//				System.out.print("Thank you for given time");
//		}
		switch(choice)
		{
		case 1 :
			{
					System.out.print("Enter the first number = ");
					int a = sc.nextInt();
					
					System.out.print("Enter the second number = ");
					int b = sc.nextInt();
					
					
					System.out.print("Addition of two number is  : "+ cv.add(a, b));
					break;
			}
					
		case 2 : 
			{
				System.out.print("Enter the first number = ");
				int a = sc.nextInt();
				
				System.out.print("Enter the second number = ");
				int b = sc.nextInt();
				
				
				System.out.print("Sunstraction  of two number is  : "+cv.sub(a, b));
				break;
			}
		
		case 3 :
			
			{
				System.out.print("Enter the first number = ");
				int a = sc.nextInt();
				
				System.out.print("Enter the second number = ");
				int b = sc.nextInt();
				
				
				System.out.print(" Multiplication  of two number is  : "+cv.mul(a, b));
				break;
			}
			
		case 4 :
			{
				System.out.print("Enter the first number = ");
				int a = sc.nextInt();
				
				System.out.print("Enter the second number = ");
				int b = sc.nextInt();
				
				try {
					System.out.print(" Division  of two number is  : "+cv.div(a, b));
				} catch(Exception e)
				{
					System.out.print("Invalid Syntax because if use 0 always come 0 ");
				}
				
				break;
			}
			
		case 5 :
			
			{
				System.out.print("Enter the first number = ");
				int a = sc.nextInt();
				
				System.out.print("Enter the second number = ");
				int b = sc.nextInt();
				
				
				System.out.print(" Modules  of two number is  : "+cv.module(a, b));
				break;
			}
			
		default :
			System.out.println("Invalid option cheeked once and retry option");
			
		}
		
	}
}


