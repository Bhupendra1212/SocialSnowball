import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

public class FluentWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("bhupendrabhagat@infiwavesolutions.com");
		FluentWait wait = new FluentWait<>(driver);
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.findElement(By.id("enterimg")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Bhupendra");
		wait.ignoring(ElementClickInterceptedException.class);

		driver.findElement(By.id("Button1")).click();

		// driver.close();

	}

}
