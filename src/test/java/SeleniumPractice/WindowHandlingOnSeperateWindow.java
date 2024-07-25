package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

public class WindowHandlingOnSeperateWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//a[@href=\"#Seperate\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		String parentWindow=driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();
		for(String window:allwindow) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			}
			
		}
		driver.findElement(By.xpath("//a[@href=\"/documentation\"]")).click();

	}

}
