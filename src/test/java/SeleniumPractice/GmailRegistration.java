package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3\r\n"
				+ "A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		
		driver.findElement(By.id("firstName")).sendKeys("ravish");
		driver.findElement(By.id("lastName")).sendKeys("Bisen");
		driver.findElement(By.xpath("//span[@class=\"VfPpkd-vQzf8d\"]")).click();
		Thread.sleep(5000);
		WebElement listOfMonth =driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select select=new Select(listOfMonth);
		select.selectByIndex(5);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"day\"]")).sendKeys("20");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"year\"]")).sendKeys("2001");
		Thread.sleep(1000);
		WebElement listOfGender=driver.findElement(By.xpath("//select[@id=\"gender\"]"));
		Select select2=new Select(listOfGender);
		select2.selectByValue("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@jsname=\"V67aGc\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class=\"t5nRo Id5V1\"])[3]")).click();
		driver.findElement(By.xpath("//input[@class=\"whsOnd zHQkBf\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"whsOnd zHQkBf\"]")).sendKeys("ravishdisen122341");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class=\"VfPpkd-vQzf8d\"]")).click();
		
		
		
		

	}

}
