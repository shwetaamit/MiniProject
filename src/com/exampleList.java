package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exampleList {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Student s= new Student();//default constructor that doesn't require to define in the class
		System.out.println(s.name);//Object reference
		s.name = "Shweta";
		System.out.println(s.name);
		Student st=new Student("Rekha");
		System.out.println(st.name);
		List<Student> str=new ArrayList<Student>();
		
		str.add(st);
		str.add(s);
		Iterator<Student> it=str.iterator();//type safe
		while(it.hasNext()){
			Student student1=it.next();//on this line no risk to compiler
			System.out.println("under iterator");
			System.out.println(student1.name);
			
		}
		
	}
}

class Student{
	public String name="Amit";
	
	Student(){
		System.out.println(name);			
		
	}
	
	Student(String st){
		this.name=st;//this keyword is a refernce for current class
	} 
}


	
//Constructor = className+()

