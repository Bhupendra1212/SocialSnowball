package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintValueSendIntheTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[1]")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		Thread.sleep(2000);
		String s1=driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[1]")).getAttribute("value");
		Thread.sleep(2000);
		String s2=driver.findElement(By.xpath("//input[@name=\"password\"]")).getAttribute("value");
		System.out.println(s1);
		System.out.println(s2);

	}

}
