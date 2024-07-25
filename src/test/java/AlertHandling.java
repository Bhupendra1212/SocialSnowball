import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()=\"click the button to demonstrate the prompt box \"]")).click();
		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Hi i am bhupendra");

		Thread.sleep(10000);
		alert.accept();

	}

}
