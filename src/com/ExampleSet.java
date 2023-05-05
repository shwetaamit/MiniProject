package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();

		Employee e2 = new Employee("IBM");

		Set<Employee> emp = new HashSet<Employee>();

		emp.add(e2);
		emp.add(e);

		Iterator<Employee> it = emp.iterator();

		while (it.hasNext()) {

			Employee c = it.next();
			System.out.println(c.s);
		}
	}

}

class Employee {

	public String s = "TCS";

	public Employee(String s1) {
		this.s = s1;

	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int i) {
		// TODO Auto-generated constructor stub
	}
	
}
