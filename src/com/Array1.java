package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String[] str= {"shweta","sk2","ram","shyam","Amit"};
//		for(int i=0;i<str.length;i++)
//		System.out.println(str[i]);

		List<String> str=new ArrayList<String>();
		str.add("Ram");
		str.add("AAm");
		str.add("kaam");
		str.add("Naam");
		
	//for(int i=0;i<str.size();i++);
			
			//System.out.println(str.get(i));
		 Iterator<String> itr=str.iterator();
	      while(itr.hasNext())
	        {
	          String obj = itr.next();
	          System.out.println(obj);;
		
	}
	
		}
		
		
	
}

