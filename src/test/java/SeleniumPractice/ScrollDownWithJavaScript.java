
package SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.InterviewQuestion.windowHandlesGoAndComeOnParentWindow;

public class ScrollDownWithJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		executor.executeScript("window.scrollBy(0,-500)");

	}

}
