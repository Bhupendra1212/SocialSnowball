package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileuploadingUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);
		String path="D:\\Java+Selenium Study\\Java interview questions and ans";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"input-4\"]")).sendKeys(path);
		

	}

}
