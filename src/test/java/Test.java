import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.google.com/");

//		WebElement web=driver.findElement(By.xpath("//input[@value=\"Google Search\"])"));
//		web.click();

		
	String url=driver.getTitle();
		System.out.println(url);
		url.equalsIgnoreCase("google");
		
	}
}
