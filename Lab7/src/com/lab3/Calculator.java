package com.lab3;

public class Calculator {
	//method-1
	public int add(int x,int y)
	{
		int z=x+y;
		System.out.println("Add two Int numbers : "+z);
		return z;
	}

	public double add(double p,int q,int r)
	{
		double D=p+q+r;;
		System.out.println("Addition of three double numbers : "+D);
		return D;
	}

	public String add(String s1,String s2)
	{
		String s=s1+s2;
		System.out.println("Addition of two Strings : "+s);
		return s;
	}
	//method-2
	public int substract(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction of two numbers : "+c);
		return c;
	}

	public double substract(double i,double j)
	{
		double k=i-j;
		System.out.println("Subtraction of two  numbers : "+k);
		return k;
	}


	
	//default constructor
	Calculator(){
		
		
	}
	//parameterized constructor
	Calculator(int x ,int b){
		
		
	}
	

}

