package com.InterviewQuestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandlesGoAndComeOnParentWindow {
	 
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.manager.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		RemoteWebDriver driver = new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(10000);
//		 FluentWait<RemoteWebDriver> wait=new FluentWait<>(driver);
//		 wait.until(ExpectedConditions.elementToBeClickable(By.id("\"newTabBtn\"")));
		driver.findElement(By.id("\\\"newTabBtn\\\"")).click();
		
		

	}

}
