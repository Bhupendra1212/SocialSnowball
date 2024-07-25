package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDisplayedAndIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		 boolean displayed=driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[1]")).isDisplayed();
		 if(displayed==true) {
			 System.out.println("element is displayed");
		 }else {
			 System.out.println("element  is not displayed");
		 }
		 Thread.sleep(2000);
		 boolean enable=driver.findElement(By.xpath("(//input[@//input[@name=\"username\"]")).isEnabled();
		 if(enable==true) {
			 System.out.println("box is enable");
		 }else {
			 System.out.println("box  is not enable");
		 }

	}

}
