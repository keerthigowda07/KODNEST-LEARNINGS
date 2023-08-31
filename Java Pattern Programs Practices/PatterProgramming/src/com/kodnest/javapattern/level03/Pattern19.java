package com.kodnest.javapattern.level03;

public class Pattern19 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		for(int l=5; l>=1; l--)
		{
			for(int m=1; m<=l; m++)
			{
				System.out.print(" ");
			}
			for(int n=1; n<=l; n++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
