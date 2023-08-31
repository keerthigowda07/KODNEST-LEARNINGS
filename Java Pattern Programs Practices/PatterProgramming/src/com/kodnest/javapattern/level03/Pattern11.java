package com.kodnest.javapattern.level03;

public class Pattern11 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
