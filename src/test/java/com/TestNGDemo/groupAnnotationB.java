package com.TestNGDemo;

import org.testng.annotations.Test;

public class groupAnnotationB {
	@Test
	public void NehaA() {
		System.out.println("groupAnnotationB:-NehaA");

	}

	@Test
	public void NehaB() {
		System.out.println("groupAnnotationB:-NehaB");

	}

	@Test(groups = "Regression")
	public void NehaC() {
		System.out.println("groupAnnotationB:-NehaC");

	}

	@Test(groups = "Smoke")
	public void NehaD() {
		System.out.println("groupAnnotationB:-NehaD");

	}

}
