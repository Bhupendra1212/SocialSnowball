package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingOnNewTabDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,manager.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\Chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-info\"])[1]")).click();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allwindow=driver.getWindowHandles();
		System.out.println(allwindow);
		for(String window:allwindow) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				
			}
			
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href=\"/downloads\"]")).click();
		String tittle=driver.getTitle();
		System.out.println(tittle);
		//move to previous window
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//a[@href=\"#Seperate\"]")).click();
		
	}

}
