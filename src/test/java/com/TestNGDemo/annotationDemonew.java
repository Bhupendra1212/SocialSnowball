package com.TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationDemonew {
	RemoteWebDriver driver = null;

	@BeforeMethod
	public void launchApplicationAndLogin() {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("enterimg")).click();

	}

	@Test
	public void verifytheTittleOfHomePage() {
		String tittleHomePage = driver.getTitle();
		System.out.println(tittleHomePage);
//		Assert.assertEquals("tittleHomePage", "Automation Demo Site");

	}
     @AfterMethod
	public void closeBrowser() {
		driver.close();

	}

}
