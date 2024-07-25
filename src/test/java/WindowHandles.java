import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		String parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String window : allwindows) {
			if (!window.equals(parentwindow)) {
				driver.switchTo().window(window);
			}

		}
		driver.findElement(By.xpath("//button[text()=\"click\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"/downloads\"]")).click();

	}

}
