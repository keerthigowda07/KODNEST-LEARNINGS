package com.kodnest.javapattern.level03;

public class Pattern13 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print("$");
			}
			for(int k=1; k<=5; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
