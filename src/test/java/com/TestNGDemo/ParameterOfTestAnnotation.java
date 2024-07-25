package com.TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParameterOfTestAnnotation {
	
	@Test
	public void m1() {
		System.out.println("this is the method1");

	}
    @Test(dependsOnMethods= {"m4"},alwaysRun=true)
	public void m2() {
		System.out.println("this is the method2");

	}
    @Test(expectedExceptions = ArithmeticException.class)
	public void m3() {
		System.out.println("this is the method3");
		throw new ArithmeticException();

	}
    @Test()
	public void m4() {
		System.out.println("this is the method4");
		Assert.assertEquals("Hi", "heelo");

	}
    @Test(priority=1)
	public void m5() {
		System.out.println("this is the method5");

	}
    @Test
	public void m6() {
		System.out.println("this is the method6");

	}
    @Test
	public void m7() {
		System.out.println("this is the method7");

	}

}
