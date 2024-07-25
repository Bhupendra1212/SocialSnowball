package SeleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BookHoteladactin {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.manager.driver",
				"\"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("bhupendra1212");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Welcome@1212");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"login\"]")).click();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.xpath("//select[@name=\"location\"]"));
		Select select = new Select(location);
		select.selectByValue("London");
		WebElement hotels = driver.findElement(By.xpath("//select[@id=\"hotels\"]"));
		Select selecthotel = new Select(hotels);
		selecthotel.selectByVisibleText("Hotel Cornice");
		WebElement roomtype = driver.findElement(By.xpath("//select[@name=\"room_type\"]"));
		Select roomtypeselect = new Select(roomtype);
		roomtypeselect.selectByIndex(3);
		driver.findElement(By.id("datepick_in")).sendKeys("18/07/2024");
		driver.findElement(By.id("datepick_out")).sendKeys("19/07/2024");
		driver.findElement(By.id("adult_room")).sendKeys("3 - Three");
		driver.findElement(By.id("child_room")).sendKeys("1 - One");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"Submit\"]")).click();

		Thread.sleep(4000);
		driver.quit();

	}

}
