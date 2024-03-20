package com.bsp;

import java.util.Scanner;

public class PrintNumberInreverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the two numbers");
		int a=sc.nextInt();
		int rs=reverse(a);
		System.out.println(rs);
	}

	private static int reverse(int a)
	{
		
		int rev=0;
		while(a!=0)
		{
			int r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		
		return rev;
	}

}
