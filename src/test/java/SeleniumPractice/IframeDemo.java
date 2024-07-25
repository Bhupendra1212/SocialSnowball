package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Frames.html");
		int size=driver.findElements(By.tagName("iframe")).size();
	    System.out.println(size);
		Thread.sleep(2000);
		WebElement wb=driver.findElement(By.id("singleframe"));
     	driver.switchTo().frame(wb);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("bhupendra");

	}

}
