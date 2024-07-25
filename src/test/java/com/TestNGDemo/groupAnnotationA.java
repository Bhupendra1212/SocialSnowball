package com.TestNGDemo;

import org.testng.annotations.Test;

public class groupAnnotationA {
	@Test
	public void TestA() {
		System.out.println("groupAnnotationA:-TestA");

	}

	@Test(groups = "Regression")
	public void TestB() {
		System.out.println("groupAnnotationA:-TestB");

	}

	@Test(groups = "Regression")
	public void TestC() {
		System.out.println("groupAnnotationA:-TestC");

	}

	@Test(groups = "Smoke")
	public void TestD() {
		System.out.println("groupAnnotationA:-TestD");

	}

	@Test(groups = "Sanity")
	public void TestE() {
		System.out.println("groupAnnotationA:-TestE");

	}

}
