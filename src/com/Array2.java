package com;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str= {"Shweta","Amit","Atharva","Maa","Papa"};
		
		System.out.println("before\t"+Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			//System.out.println("*"+str [i]);
			char c= (char) str[i].charAt(0);
			
			//System.out.println(str1);
			String str2= str[i].substring(1);
			str2= str2+c;
			//System.out.println(str2);
			str[i]=str2;
			//str pahla index ka character nahi hoga
			//jo char liye usko last mein add kar denge
			//System.out.println(str[i]+c);
		}
		
		System.out.println("After\t"+Arrays.toString(str));
	}
	

}
