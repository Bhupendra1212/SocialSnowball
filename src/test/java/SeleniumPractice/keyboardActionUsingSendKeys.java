package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class keyboardActionUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement x=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		Thread.sleep(2000);
		x.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement x1=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Thread.sleep(2000);
		x.sendKeys(Keys.CONTROL,"ac");
		Thread.sleep(2000);
		x1.sendKeys(Keys.CONTROL,"v");
		
		

	}

}
