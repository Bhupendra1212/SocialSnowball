package com.TestNGDemo;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;


public class testCaseOfDataProvider {
	RemoteWebDriver driver = null;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("\"--remote-allow-origins=*\"");
		driver = new ChromeDriver();

	}
   @Test(dataProvider="loginDataa",dataProviderClass=dataProviderDeom.class)
	public void verifytheLogindata(String username, String password) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(
				By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"))
				.click();

	}

}
