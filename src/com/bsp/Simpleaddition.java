package com.bsp;

import java.util.Scanner;

public class Simpleaddition {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int rs=add(a,b);
		System.out.println(rs);
	}

	private static int add(int a, int b) 
	{
		return a+b;
	}

}
