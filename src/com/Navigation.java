package com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Navigation {
@Parameters({"https://amazon.in"})
@Test
	public void item(){
		
		System.out.println("adding item to cart");
	}
	@Test
	public void item2() {
		System.out.println("checking parameterization");
	}

}
