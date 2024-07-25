package com.InterviewQuestion;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class maximizeWindowWithoutManageMethod {

	public static void main(String [] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.manage.driver",
				"C:\\Users\\Infiwave\\clipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.moveTo(800,800); window.resizeTo(screen.width,screen.height);");
		
//		Robot robot = new Robot();
//
//        // Simulate pressing the F11 key (Windows/Linux) to maximize the window
//        robot.keyPress(KeyEvent.VK_F11);
//        robot.keyRelease(KeyEvent.VK_F11);
//		Thread.sleep(20000);
//		driver.quit();

	}

}
