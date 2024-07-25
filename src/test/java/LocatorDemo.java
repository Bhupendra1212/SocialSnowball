import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		// driver.findElement(By.className("orangehrm-login-button")).click();
		String text = driver.findElement(By.xpath("//div[@class=\"orangehrm-login-forgot\"]/child::p")).getText();

		System.out.println(text);
		if (text.equalsIgnoreCase("Forgot your password?")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}

		System.out.println(driver.getTitle());

	}

}
