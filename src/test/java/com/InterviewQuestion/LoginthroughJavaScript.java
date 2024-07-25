package com.InterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginthroughJavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		
		//When we have selectoe that time we can use this approach
		
		executor.executeScript("document.getElementsByClassName('orangehrm-login-button').click()");
		
//		OR
//		If dont have selector in the button and we have to do from tah name this approach can we use
		
		WebElement element=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		executor.executeScript("arguments[0].click()",element);

	}

}
