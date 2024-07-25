import org.openqa.selenium.remote.*;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotUsingSelenium {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		RemoteWebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/");
		File file = driver.getScreenshotAs(OutputType.FILE);
		File out = new File("UsingSelenium.png");
		Files.copy(file, out);

	}

}
