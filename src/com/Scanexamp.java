package com;

import java.util.Scanner;

public class Scanexamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		
		Scanner sr=new Scanner(System.in);
		k=sr.nextInt();
		for(i=0;i<=k;i++)
		{
			for(j=0;j<i;j++)
				System.out.println(j);
		}
		System.out.println(i);
		

	}

}
