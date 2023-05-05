package com;

public class RuncomChild extends RunCompilex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunCompilex rc=new RuncomChild();
		rc.two();
		rc.one();
		
		RuncomChild rd=new RuncomChild();
		rd.three(); 
		
	}
	
		public void three() {
			System.out.println("i am three from child class");
		}
		
		public void three(int i) {
			System.out.println("i am three from child class");
		}
		
		
		public void one() {
			System.out.println("i am one from child class");
		}
	}




