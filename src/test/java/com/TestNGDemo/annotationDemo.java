package com.TestNGDemo;



import org.testng.annotations.*;
@Test
public class annotationDemo {
	public void m1() {
		System.out.println("1st method");

	}
	@BeforeTest
	public void m2() {
		System.out.println("2nd method");

	}
	@BeforeSuite
	public void m3() {
		System.out.println("3rd method");

	}

	public void m4() {
		System.out.println("4th method");

	}

	public void m5() {
		System.out.println("5th method");

	}

}
