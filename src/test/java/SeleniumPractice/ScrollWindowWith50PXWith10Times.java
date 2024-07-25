package SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollWindowWith50PXWith10Times {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		for(int i=1;i<=10;i++) {
			//scroll down
			executor.executeScript("window.scrollBy(0,50)");
			Thread.sleep(1000);
		}
       for(int j=0;j<=10;j++) {
    	   executor.executeScript("window.scrollBy(0,-50)");
    	   Thread.sleep(1000);
       }
	}

}
