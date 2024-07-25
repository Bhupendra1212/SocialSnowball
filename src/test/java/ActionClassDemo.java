import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class ActionClassDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.manager.driver",
				"C:\\\\Users\\\\Infiwave\\\\eclipse-workspace\\\\Socialsnowball\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement switchTo = driver.findElement(By.xpath("//a[@href=\"SwitchTo.html\"]"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(switchTo).perform(); // hover on the element
		WebElement windowoption = driver.findElement(By.xpath("//a[@href=\"Windows.html\"]"));
		mouse.moveToElement(windowoption).click().build().perform();  //We can select the option after hover.
		

	}

}
