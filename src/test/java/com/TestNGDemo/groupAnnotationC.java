package com.TestNGDemo;

import org.testng.annotations.Test;

public class groupAnnotationC {
	@Test(groups = "Regression")
	public void pankajA() {
		System.out.println("groupAnnotationC:-pankajA");

	}

	@Test(groups = "Smoke")
	public void pankajB() {
		System.out.println("groupAnnotationC:-pankajB");

	}

	public void pankajC() {
		System.out.println("groupAnnotationC:-pankajC");

	}

}
