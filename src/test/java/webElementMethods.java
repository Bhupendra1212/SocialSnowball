
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Durations;

public class webElementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\Users\\Infiwave\\eclipse-workspace\\Socialsnowball\\chromedriver-win64.chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		boolean isEnabled = driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
		System.out.println("Before click" + isEnabled);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		boolean isEnable = driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
		System.out.println("After click" + isEnable);
		boolean isdisplayed = driver.findElement(By.xpath("//button[@type=\"submit\"]")).isDisplayed();
		System.out.println("button is dispayed" + isdisplayed);
		Point p = driver.findElement(By.xpath("//button[@type=\"submit\"]")).getLocation();
		System.out.println("x-coordinate: " + p.getX() + "\t" + "y-coordinate:" + p.getY());
		Dimension d = driver.findElement(By.xpath("//button[@type=\"submit\"]")).getSize();
		System.out.println("Height:-" + d.getHeight() + "\t" + "Width" + d.getWidth());
		driver.close();

	}

}
