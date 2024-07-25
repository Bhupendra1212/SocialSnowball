package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class checkLogoIsDisplayedOrNot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		boolean b=driver.findElement(By.xpath("(//img[@src=\"/web/images/ohrm_logo.png\"])[2]")).isDisplayed();
		if(b==true) {
			System.out.println("logo is displayed");
		}else {
			System.out.println("logo is not displayed");
		}
		

	}

}
